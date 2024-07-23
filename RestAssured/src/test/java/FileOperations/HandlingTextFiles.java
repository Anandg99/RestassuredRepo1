package FileOperations;

import org.testng.annotations.Test;
import java.io.*;

public class HandlingTextFiles {
	@Test
	public void CreateTextFile() {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Anand_Details\\SampleFile1.txt");
			fout.write(65);
			fout.write(78);
			fout.write(65);
			fout.write(78);
			fout.write(68);
			
			fout.write(65);
			fout.write(78);
			fout.write(65);
			fout.write(78);
			fout.write(68);

			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void WriteinFile()
	{
		 try{    
             FileOutputStream fout=new FileOutputStream("C:\\Anand_Details\\SampleFile2.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}  
	}
	@Test
	public void ReadFile()
	{
		try{    
            FileInputStream fin=new FileInputStream("C:\\Anand_Details\\SampleFile2.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
	}
	@Test
	public void ReadTextFile()
	{
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Anand_Details\\SampleFile2.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1)
	            {    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }
		 catch(Exception e)
		 {System.out.println(e);}    
	}
}
