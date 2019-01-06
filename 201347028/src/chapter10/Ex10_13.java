package chapter10;

import java.io.FileOutputStream;

public class Ex10_13 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("/Users/h/ex.txt");
		int ch;
		
		while((ch=System.in.read())!=10)
			fos.write((byte) ch);
		
		fos.close();

	}

}
