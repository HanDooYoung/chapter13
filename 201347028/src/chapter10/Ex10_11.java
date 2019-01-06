package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_11 {

	public static void main(String[] args) throws Exception{
		FileReader fReader=new FileReader("/Users/h/io.txt");
		BufferedReader bReader=new BufferedReader(fReader);
		
		String str=null;
		
		while((str=bReader.readLine())!=null) {
			System.out.println(str);
		}
		
		bReader.close();
		fReader.close();

	}

}
