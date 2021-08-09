package practice.assingment;

import java.io.FileInputStream;
import java.io.IOException;

public class Q3 {
	public static void main(String[] args) {
		try(FileInputStream f = new FileInputStream("q2File.txt");) {
			 int nl=1,nw=0;           
             char ch;
             int n=f.available();
             if(n == 0) nl = 0;
             for(int i=0;i<n;i++)
             {
                         ch=(char)f.read();
                         if(ch=='\n')
                         nl++;
                         else if(ch==' ')
                                     nw++;
                                                            
             }
             System.out.println("\nNumber of lines : "+nl); 
             System.out.println("\nNumber of words : "+(nw + nl));
             System.out.println("\nNumber of characters : "+n);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
