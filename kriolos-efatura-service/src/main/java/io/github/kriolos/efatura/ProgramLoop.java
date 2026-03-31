package io.github.kriolos.efatura;

import java.util.ArrayList;
import java.util.Scanner;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.services.ExportToCsv;
import io.github.kriolos.efatura.services.FiscalReportService;
import io.github.kriolos.efatura.services.GetTokenHelper;
package io.github.kriolos.efatura;
// import java.io.IOException;
// import java.util.stream.Stream;

// import io.github.kriolos.efatura.services.GetTokenHelper;


// public class ProgramToken {

// 	public static void main (String[] args) throws IOException 
// 	{
// 		Stream<String[]> list = Stream.of(args).map(s -> s.split(";"));

// 		for( String [] d : list.toArray(String[][]::new) ) 
// 		{
			
// 			try
// 			{
// 				String jwt = GetTokenHelper.init(d[1],d[2]);
// 				System.out.println(d[1] + "::"+  jwt);
// 			}
// 			catch(Exception e ) 
// 			{
// 				System.out.println(e.getMessage());
// 				e.printStackTrace();
// 			}
// 			finally 
// 			{
// 			}
			
// 		}
// 	}
// }


public class ProgramLoop
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<String[]> list = new ArrayList<>();

		String line;
		while( !(line=input.nextLine().trim()).isBlank())
		{
			if(!line.startsWith("#"))
			{
				list.add(line.split(";"));
			}
		}

		input.close();

		ApiClient apiCli = new ApiClient();
		apiCli.setDebugging(false);
		DfeApi dfeApi = new DfeApi(apiCli);
		

		for( String [] d : list) 
		{
			ProcessClient(apiCli, dfeApi, d);
		}
	}

	private static void ProcessClient(ApiClient apiCli, DfeApi dfeApi, String[] d) {
		try
		{
			if(d.length < 3 || d[0].startsWith("#")) 
			{
				return;
			}
			String clientName  = d[0].replace(' ', '_').trim();
			String nif = d[1].trim();
			String password = d[2].trim();

			if(nif.length() == 0 || password.length() == 0)
				return;

			String token = GetTokenHelper.init(nif,password);
			
			apiCli.setBasePath("https://services.efatura.cv/");
			apiCli.setAccessToken(token);
			
			FiscalReportService frs = new FiscalReportService(dfeApi, clientName);
			ExportToCsv.ExportDfeSummary(frs.getMod106Suppliers(null, "2026-01-01", null), clientName);  
			ExportToCsv.ExportDfeSummary(frs.getMod106Clients(null, "2026-01-01", null), clientName);  

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
