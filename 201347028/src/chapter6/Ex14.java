package chapter6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex14 {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String result;
		int i,j;
		for(i=2;i<=9;i++) {
			bw.write("  #"+i+"단# ");
		}
		bw.write("\n\n");
		for(i=1;i<=9;i++) {
			for(j=2;j<=9;j++) {
				result=String.format("%2d",j*i);
				bw.write(j+"X "+i+"="+result+" ");
			}
			bw.write("\n");
		}
		bw.close();

	}

}
