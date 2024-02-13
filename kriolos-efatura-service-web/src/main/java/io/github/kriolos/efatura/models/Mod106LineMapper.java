package io.github.kriolos.efatura.models;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.github.kriolos.efatura.clientapi.generated.model.DfeLine;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfePayload;
import io.github.kriolos.efatura.kriolosefaturaservice.enums.DfeDocumentTypeEnum;

public class Mod106LineMapper implements ModLineIMapper{
	
	@Override
	public int addLineToModDoc ( int i , ModDoc doc , PayloadProcessingResponseDfePayload  d ) 
	{
		try {				
			Map<Double, List<DfeLine>> lines = d.getLines().stream().collect(
					Collectors.groupingBy(l -> Optional.ofNullable(getPercentageTaxes(l)).orElse(0d)));

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

		return i ;
	}

	private Double getPercentageTaxes(DfeLine l) {
		if(l.getTaxes() == null ) return null;
		
		return l.getTaxes().get(0).getTaxPercentage();
	}
}
