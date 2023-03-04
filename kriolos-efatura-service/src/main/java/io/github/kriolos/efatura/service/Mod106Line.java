package io.github.kriolos.efatura.service;

import java.io.IOException;
import java.io.Writer;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mod106Line {
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
	
	public String origem; 
	public String nif;
	public String designacao_entidade;
	public String tipo_doc;
	public String num_doc;
	public String data;
	public Double valor_factura;
	public Double valor_base_incidencia;
	public Double taxa_iva;
	public Double iva_suportado;
	public Double direito_dedutivel;
	public Double iva_dedutivel;
	public String tipologia;
	public String campo_destino_modelo;
	public Integer num_ordem;
	
	public void Write ( Writer w ) throws IOException 
	{
		String [] args = new String [] {
			origem, 
			nif,
			designacao_entidade,
			tipo_doc,
			num_doc,
			data,
			Math.round(Optional.ofNullable(valor_factura).orElse(0d)) + "",
			Optional.ofNullable(valor_base_incidencia).orElse(0d).toString(),
			Optional.ofNullable(taxa_iva).orElse(0d).toString(),
			Math.round(Optional.ofNullable(iva_suportado).orElse(0d)) + "",
			Optional.ofNullable(direito_dedutivel).orElse(0d).toString(),
			Math.round(Optional.ofNullable(iva_dedutivel).orElse(0d)) + "",
			tipologia,
			campo_destino_modelo,
			Optional.ofNullable(num_ordem).orElse(0).toString()
		};
		
		String result = Stream.of(args)
			      .map(Mod106Line::escapeSpecialCharacters)
			      .collect(Collectors.joining(";"));
		
		w.write(result);
		w.write(System.lineSeparator());
	}
	
	public static String escapeSpecialCharacters(String data) {
		if(data != null ) {
			String escapedData = data.replaceAll("\\R", " ");
		    if (data.contains(",") || data.contains("\"") || data.contains("'")) {
		        data = data.replace("\"", "\"\"");
		        escapedData = "\"" + data + "\"";
		    }
		    return escapedData;
		}
		
		return "";
	    
	}
}
