package io.github.kriolos.efatura.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModDoc {
	private final static String [] headers = new String [] {
		"Origem",
		"NIF da Entidade",
		"Designação da Entidade",
		"Tipo Doc.",
		"N.º Doc.",
		"Data",
		"Valor da Fatura",
		"Valor Base de Incidência",
		"Taxa IVA",
		"IVA Suportado",
		"Direito Ded.",
		"IVA Dedutível",
		"Tipologia",
		"Campo Destino Modelo",
		"Número de Ordem"
	};

	ArrayList<ModLine> lines;

	public ModDoc() {
		this(10);
	}

	public ModDoc(int capacity) {
		lines = new ArrayList<>(capacity);
	}

	public void addLine(ModLine line) {
		lines.add(line);
	}

	public void toCsv(String csvOutputFilePath) throws IOException {
		final File f = new File(csvOutputFilePath);
		f.createNewFile();
		toCsv(f);
		System.out.println("ExportCompleted");
	}
	
	public void toCsv(File f) throws IOException {
		
		final PrintWriter pw = new PrintWriter(f);
		
		// Write header
		writeHeader(pw);
		
		// Write body 
		lines.stream().forEach(l -> {
			try {
				l.Write(pw);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		pw.flush();
		pw.close();
	}

	private void writeHeader(Writer w) throws IOException {
		String result = Stream.of(headers)
			      .map(Mod106Line::escapeSpecialCharacters)
			      .collect(Collectors.joining(";"));
		
		w.write(result);
		w.write(System.lineSeparator());
	}
}
