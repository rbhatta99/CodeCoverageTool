package edu.utdallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new FileReader("total.txt"));
		String line=null;
		while((line = br.readLine())!=null)
		{
			Class testclass =Class.forName(line);
			Result result= JUnitCore.runClasses(testclass);
			
			for(Failure fail : result.getFailures())
			{
				System.out.println(fail.toString());
			}
			
			System.out.println("test Successfull");
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
