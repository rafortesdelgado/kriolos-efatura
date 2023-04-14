package io.github.kriolos.efatura.service;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import io.github.kriolos.efatura.clientapi.generated.model.DfeLine;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfePayload;
import io.github.kriolos.efatura.service.enums.DfeDocumentTypeEnum;

public class ExportToCsv {

//	Origem
//	NIF da Entidade
//	Designação da Entidade
//	Tipo Doc.
//	N.º Doc.
//	Data
//	Valor da Fatura
//	Valor Base de Incidência
//	Taxa IVA
//	IVA Suportado
//	Direito Ded.
//	IVA Dedutível
//	Tipologia
//	Campo Destino Modelo
//	Número de Ordem

	public static void ExportDfeSummary(List<PayloadProcessingResponseDfePayload> data) {
		final Mod106 doc = new Mod106(data.size());
		int i = 0;
		Collections.sort(data, (o1, o2) -> DfePayloadComparator(o1,o2));
		
		for (PayloadProcessingResponseDfePayload d : data) {
			try {
				System.out.println(DfeDocumentTypeEnum.convert(d.getDocumentTypeCode()).name());
				
				if(d.getDocumentTypeCode()  == 4) 
				{
					System.out.println("4");
				}
				
				Map<Double, List<DfeLine>> lines = d.getLines().stream().collect(
						Collectors.groupingBy(l -> Optional.ofNullable(l.getTaxes().get(0).getTaxPercentage()).orElse(0d)));

				for (Map.Entry<Double, List<DfeLine>> g : lines.entrySet()) {

					Mod106Line n = new Mod106Line();
					n.origem = d.getEmitterParty().getTaxId().getCountryCode();
					n.nif = d.getEmitterParty().getTaxId().getValue();
					n.designacao_entidade = d.getEmitterParty().getName();
					n.tipo_doc = DfeDocumentTypeEnum.convert(d.getDocumentTypeCode()).name();
					n.num_doc = d.getDocumentNumber().toString();
					n.data = d.getIssueDate();

					if (d.getTotals() != null) {
						final Double taxa_iva_perct = g.getKey();
						final Double taxa_iva = g.getKey() / 100;
						
						n.valor_factura = g.getValue().stream()
							.mapToDouble(line -> line.getNetTotal()).sum() 
							* (1 + taxa_iva) ;
//						n.valor_factura = IfNullReturnEmpty(d.getTotals().getPayableAmount());

						n.valor_base_incidencia = g.getValue().stream()
							.mapToDouble(line -> line.getNetTotal())
							.sum();

//						n.valor_base_incidencia = IfNullReturnEmpty(d.getTotals().getNetTotalAmount());

						n.taxa_iva = taxa_iva_perct;
//						n.taxa_iva = 
//								d.getLines().stream()
//							.flatMap(l -> l.getTaxes().stream())
//							.map(l -> l.getTaxPercentage() != null ? l.getTaxPercentage() : 0)
//							.max((o1, o2) -> o1.compareTo(o2))
//							.get().doubleValue() + "";
//							.get()
//							.getTaxPercentage()
//							.toString();

						n.iva_suportado = taxa_iva * g.getValue().stream().mapToDouble(line -> line.getNetTotal()).sum();
//						n.iva_suportado = IfNullReturnEmpty(d.getTotals().getTaxTotalAmount());

						n.direito_dedutivel = n.iva_suportado; // Em branco
						n.iva_dedutivel = n.iva_suportado;
					}

					n.tipologia = ""; // Em branco
					n.campo_destino_modelo = "";
					n.num_ordem = (++i);

					doc.addLine(n);
				}
			} catch (Exception e) {
				System.out.println(d.getDocumentNumber().toString());
				System.out.println(DfeDocumentTypeEnum.convert(d.getDocumentTypeCode()).name());
				e.printStackTrace();
			}
		}

		String path = getPath();
		try {
			doc.toCsv(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int DfePayloadComparator
		(PayloadProcessingResponseDfePayload p1 , PayloadProcessingResponseDfePayload p2){
		
		int compare =  LocalDate.parse(p1.getIssueDate())
			.compareTo(LocalDate.parse(p2.getIssueDate()));

		if(compare != 0 ) {
			return compare;
		}

		compare = p1.getEmitterParty().getTaxId().hashCode() - p2.getEmitterParty().getTaxId().hashCode();
		
		if(compare != 0 ) {
			return compare;
		}

		return p1.getDocumentNumber() - p2.getDocumentNumber();
	} 

	public static String getPath() {
		final Frame f = new Frame("Java AWT Examples");
		JFileChooser j = new JFileChooser();
		j.setDialogType(JFileChooser.SAVE_DIALOG);
		Integer opt = j.showSaveDialog(f);
		String path = j.getSelectedFile().getAbsolutePath();
		System.out.println(path);

		f.dispose();

		return path;
//		FileDialog fd = new FileDialog();
//		fd.setDirectory("C:\\");
//		fd.setFile("*.xml");
//		fd.setVisible(true);
//		String filename = fd.getFile();
//		if (filename == null)
//		  System.out.println("You cancelled the choice");
//		else
//		  System.out.println("You chose " + filename);
	}
}
