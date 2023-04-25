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

	public static void ExportDfeSummary(List<PayloadProcessingResponseDfePayload> data, ModLineIMapper mapper) {
		System.out.println("Export dfe");

		final ModDoc doc = new ModDoc(data.size());
		int i = 0;
		Collections.sort(data, (o1, o2) -> DfePayloadComparator(o1,o2));
		for (PayloadProcessingResponseDfePayload d : data) {
			i = mapper.addLineToModDoc(i, doc, d);
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
