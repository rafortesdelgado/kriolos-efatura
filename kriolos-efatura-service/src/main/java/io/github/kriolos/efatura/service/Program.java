package io.github.kriolos.efatura.service;

import java.util.Scanner;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;


public class Program {
	
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int selection = printMenu(input);

		TokenManager tm = new TokenManager();
				
		String token = tm.getToken(289308496);
		
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
