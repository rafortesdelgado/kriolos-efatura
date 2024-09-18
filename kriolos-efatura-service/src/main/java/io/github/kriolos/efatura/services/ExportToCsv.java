package io.github.kriolos.efatura.services;

import java.awt.Frame;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import io.github.kriolos.efatura.clientapi.generated.model.Dfe;
import io.github.kriolos.efatura.models.ModDoc;
import io.github.kriolos.efatura.models.ModLineIMapper;

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


	public static void ExportDfeSummary(ModDoc doc, String clientName) {
		System.out.println("Export dfe");
		String path = "/home/lumus/Desktop/desktop/Orconta/" + doc.getLabel() + ".csv";
		// path = getPath();
		try {
			doc.toCsv(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public static String getPath() {

		final Frame f = new Frame("Java AWT Examples");
		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath());
		j.setDialogType(JFileChooser.SAVE_DIALOG);
		Integer opt = j.showSaveDialog(f);
		f.setVisible(true);
		
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
