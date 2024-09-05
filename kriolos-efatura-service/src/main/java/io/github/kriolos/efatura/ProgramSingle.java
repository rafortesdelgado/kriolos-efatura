package io.github.kriolos.efatura;

import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.services.FiscalReportService;
import io.github.kriolos.efatura.services.GetTokenHelper;
import io.github.kriolos.efatura.services.TokenManager;


public class ProgramSingle {

	public static String cliName;	
	public static String path = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();
	public static void main (String[] args) 
	{
		// String jwt = GetTokenHelper.init("200505181","505216");
		// Program.cliName = "steel";
		String jwt = GetTokenHelper.init("289308496","lausdeo156@@!");
		ProgramSingle.cliName = "syncit";
        String token = jwt;
		int selection = 3;

		// Scanner input = new Scanner(System.in);

		// System.out.println("Client name");

		// Program.cliName = input.nextLine();		


		// System.out.println("Client token");


		// String token = input.nextLine();
        // int selection = printMenu(input);

		TokenManager tm = new TokenManager();
				
		// String token = tm.getToken(289308496);
		
		ApiClient apiCli = new ApiClient();
		apiCli.setBasePath("https://services.efatura.cv/");
		apiCli.setAccessToken(token);
		
		DfeApi dfeApi = new DfeApi(apiCli);
		FiscalReportService frs = new FiscalReportService(dfeApi);
		
		

		switch (selection){
			case 1 : frs.getMod106Suppliers("2023"); break;
			case 2 : frs.getMod106Clients("2023"); break;
			case 3 : frs.getMod106Suppliers("2023");  frs.getMod106Clients("2023");
		}
	}

	public static int printMenu( Scanner input ) {

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Mod106 - Fornecedores");
        System.out.println("2 - Mod106 - Clientes");
        System.out.println("3 - Todos");
        System.out.println("other - Quit"); 

		return input.nextInt();
    }
	
}
