package io.github.kriolos.efatura.models;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.kriolos.efatura.clientapi.generated.model.Dfe;

public class ModDoc {
	private final static String[] headers = new String[] {
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

	private String label;

	public ModDoc(String label) {
		this(label, 100);
	}

	public String getLabel() {return label; }

	public ModDoc(String label, int capacity) {
		this.lines = new ArrayList<>(capacity);
		this.label = label;
	}

	public void addLine(ModLine line) {
		lines.add(line);
	}

	public void toCsv(String csvOutputFilePath) throws IOException {
		final File f = new File(csvOutputFilePath);
		f.createNewFile();
		f.createNewFile();
		toCsv(f);
		System.out.println("ExportCompleted");
	}

	public void toCsv(File f) throws IOException {

		final PrintWriter pw = new PrintWriter(f, StandardCharsets.UTF_8);
		pw.write('\ufeff');
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

	public static ModDoc CreateDoc (List<Dfe> data, String label, ModLineIMapper mapper) {

		final ModDoc doc = new ModDoc(label, data.size());
		int i = 0;
		Collections.sort(data, (o1, o2) -> DfePayloadComparator(o1, o2));
		for (Dfe d : data) {
			i = mapper.addLineToModDoc(i, doc, d);
		}

		return doc ;
	}

	private static int DfePayloadComparator(Dfe p1, Dfe p2) {

		int compare = LocalDate.parse(p1.getIssueDate())
				.compareTo(LocalDate.parse(p2.getIssueDate()));

		if (compare != 0) {
			return compare;
		}

		compare = p1.getEmitterParty().getTaxId().hashCode() - p2.getEmitterParty().getTaxId().hashCode();

		if (compare != 0) {
			return compare;
		}

		return p1.getDocumentNumber() - p2.getDocumentNumber();
	}
}
