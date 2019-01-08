package chapter5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex12 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int a,b;
		char c;
		bw.write("첫번째 수를 입력하세요 : ");
		bw.flush();
		a=Integer.parseInt(br.readLine());
		bw.write("계산할 연산자를 입력하세요 : ");
		bw.flush();
		c=br.readLine().charAt(0);
		bw.write("두번째 수를 입력하세요 : ");
		bw.flush();
		b=Integer.parseInt(br.readLine());
		if(c=='+')	{
			bw.write(a+" "+c+" "+b+" = "+(a+b));	
			bw.close();
		}
		else if(c=='-')	{
			bw.write(a+" "+c+" "+b+" = "+(a-b));
			bw.close();
		}
		else if(c=='*')	{
			bw.write(a+" "+c+" "+b+" = "+(a*b));
			bw.close();
		}
		else	 if(c=='/')	{
			bw.write(a+" "+c+" "+b+" = "+((double)a/(double)b));
			bw.close();
		}
		else if(c=='%')	{
			bw.write(a+" "+c+" "+b+" = "+(a%b));
			bw.close();
		}
		else		{
			bw.write("잘못입력했습니다.\n");
			bw.close();
		}

	}

}
