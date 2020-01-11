package Acmicpc;


import java.io.*;
import java.util.StringTokenizer;
public class bj2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A = Long.parseLong(st.nextToken());			//낮에 올라가는 길이
		long B = Long.parseLong(st.nextToken());			//밤에 미끄러지는 길이
		long V = Long.parseLong(st.nextToken());			//높이
		
		br.close();
		
		int days=0;
		int n=0;
		
		while(true) {
			 
			n+=A;
			days++;			
			
			if(n>=V)
				break;
			n-=B;
		}
		
		
		
		
		bw.write(String.valueOf(days));
		bw.close();
	}

}
