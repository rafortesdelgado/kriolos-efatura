package io.github.kriolos.efatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;
import io.github.kriolos.efatura.clientapi.generated.model.LedDto;
import io.github.kriolos.efatura.services.GetTokenHelper;
import io.github.kriolos.efatura.services.LedService;


public class ProgramLedLoop
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<String[]> list = new ArrayList<>();

		String line;
		while( !(line=input.nextLine().trim()).isBlank())
		{
			list.add(line.split(";"));
		}

		ApiClient apiCli = new ApiClient();
		LedApi dfeApi = new LedApi(apiCli);
		
		for( String [] d : list) 
		{
			try
			{
				if(d.length != 3) continue;
				String clientName  = d[0].replace(' ', '_').trim();
				String nif = d[1].trim();
				String password = d[2].trim();

				if(nif.length() == 0 || password.length() == 0) continue;

				String token = GetTokenHelper.init(nif,password);
				
				apiCli.setBasePath("https://services.efatura.cv/");
				apiCli.setAccessToken(token);
				
				LedService ledService = new LedService(dfeApi);

				List<LedDto> ledsDto =  ledService.GetLed(2024);
				ledsDto.forEach(led -> System.out.println(led));
				//ledService.CreateLed(ledsDto, "2025");
			}
			catch(Exception e ) 
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally 
			{
				input.close();
			}
		}
	}
}
