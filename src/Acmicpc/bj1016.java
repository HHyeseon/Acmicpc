package Acmicpc;

import java.io.*;
import java.util.StringTokenizer;
public class bj1016 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long min=Long.parseLong(t.nextToken());
		long max=Long.parseLong(t.nextToken());
		

		boolean[]check = new boolean[(int)(max-min+1)];
		
		for(int i=2; i*i<=max; ++i) {
			long square=i*i;		//제곱수
			if(square>max)
				break;
		//	long s= min%square==0? min/square : (min/square)*square;  //min보다 큰 제곱수 중에서 시작값을 구함
			
		//	long s = ((min)/(square))*square;
			long s= min%square==0? min/square : (min/square)*square;  
			while(s<min)
				s+=square;
			
			while(s<=max) {
				check[(int)(max-s)] = true;
				s+=square;
			}
			
			
			 
		}
			
			int count=0;
			for(int j=0; j<(int)(max-min)+1; ++j) {
				if(!check[j])
					count++;
			}
			bw.flush();
			bw.write(count+" ");
			br.close();
			bw.close();
		
	
	}

}

