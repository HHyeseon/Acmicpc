package Acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1712 {

public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a= Integer.parseInt(st.nextToken());		//고정비용
		int b= Integer.parseInt(st.nextToken());		//가변비용
		int c= Integer.parseInt(st.nextToken());		//노트북 가격
		br.close();
		

		if(b>=c)
			//bw.write(-1);
			System.out.print(-1);
		else
			
		//bw.write(String.valueOf(result));
		System.out.print(a/(c-b)+1);

		
		//bw.close();


	}

}
