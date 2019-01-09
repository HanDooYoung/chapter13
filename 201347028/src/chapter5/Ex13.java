package chapter5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex13 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int a,b;
		String c;
		bw.write("수식을 한줄로 띄어쓰기로 입력하세요 : ");
		bw.flush();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		a=Integer.parseInt(st.nextToken());
		c=st.nextToken();
		b=Integer.parseInt(st.nextToken());
		st.hasMoreTokens();
		switch(c) {
		case "+":
			bw.write(a+" "+c+" "+b+" = "+(a+b));
			bw.close();
			break;
		case "-":
			bw.write(a+" "+c+" "+b+" = "+(a-b));
			bw.close();
			break;
		case "*":
			bw.write(a+" "+c+" "+b+" = "+(a*b));
			bw.close();
			break;
		case "/":
			String result=String.format("%.2f",(double)a/(double)b);
			bw.write(a+" "+c+" "+b+" = "+result);
			bw.close();
			break;
		case "%":
			bw.write(a+" "+c+" "+b+" = "+(a%b));
			bw.close();
			break;
		default:
			bw.write("연산자를 잘못 입력했습니다.\n");
			bw.close();
		}
		

	}

}
