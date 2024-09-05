package io.github.kriolos.efatura;

import java.util.ArrayList;
import java.util.Scanner;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.services.FiscalReportService;
import io.github.kriolos.efatura.services.GetTokenHelper;


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
				ProgramSingle.cliName = d[0].replace(' ', '_');
				String token = jwt;
				int selection = 3;
				apiCli.setBasePath("https://services.efatura.cv/");
				apiCli.setAccessToken(token);
				FiscalReportService frs = new FiscalReportService(dfeApi);
				frs.getMod106Suppliers("2024", "2024-08-01", null);  
				frs.getMod106Clients("2024", "2024-08-01", null);

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
