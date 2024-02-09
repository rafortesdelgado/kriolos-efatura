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

		ApiClient apiCli = new ApiClient();
		apiCli.setDebugging(false);
		DfeApi dfeApi = new DfeApi(apiCli);

		for( String [] d : list) 
		{
			
			try
			{

				String jwt = GetTokenHelper.init(d[1],d[2]);
				Program.cliName = d[0].replace(' ', '_');
				String token = jwt;
				int selection = 3;
				apiCli.setBasePath("https://services.efatura.cv/");
				apiCli.setAccessToken(token);
				FiscalReportService frs = new FiscalReportService(dfeApi);
				frs.getMod106Suppliers("2024");  
				frs.getMod106Clients("2024");

			}
			catch(Exception e ) 
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally 
			{
			}
			
		}
	}
}
