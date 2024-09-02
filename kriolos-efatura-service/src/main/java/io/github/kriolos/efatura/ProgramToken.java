package io.github.kriolos.efatura;

import java.io.IOException;
import java.util.stream.Stream;

import io.github.kriolos.efatura.services.GetTokenHelper;


public class ProgramToken {

	public static void main (String[] args) throws IOException 
	{
		Stream<String[]> list = Stream.of(args).map(s -> s.split(";"));

		for( String [] d : list.toArray(String[][]::new) ) 
		{
			
			try
			{
				String jwt = GetTokenHelper.init(d[1],d[2]);
				System.out.println(d[1] + "::"+  jwt);
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
