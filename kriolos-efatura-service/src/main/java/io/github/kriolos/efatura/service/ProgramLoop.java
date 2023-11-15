package io.github.kriolos.efatura.service;

import java.util.ArrayList;
import java.util.Scanner;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;


public class ProgramLoop {

	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<String[]> list = new ArrayList<>();

		String line;
		while( !(line=input.nextLine().trim()).isBlank())
		{
			list.add(line.split(";"));
		}

		input.close();

		for( String [] d : list) 
		{
			String jwt = GetTokenHelper.init(d[1],d[2]);
			Program.cliName = d[0].replace(' ', '_');
			String token = jwt;
			int selection = 3;

			ApiClient apiCli = new ApiClient();
			apiCli.setBasePath("https://services.efatura.cv/");
			apiCli.setAccessToken(token);

			
			DfeApi dfeApi = new DfeApi(apiCli);

			FiscalReportService frs = new FiscalReportService(dfeApi);
			//frs.getMod106Suppliers("2023");  
			frs.getMod106Clients("2023");
		}
	}
}
