package Acmicpc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class bj1037 {

	public static void main(String[] args) throws  NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		//int n= Integer.parseInt(t.nextToken());
		int n= Integer.parseInt(br.readLine());
		int[]a=new int[n];

		for(int i=0; i<n; ++i) {
			
			a[i]=Integer.parseInt(t.nextToken());

		}
		br.close();
		Arrays.sort(a);

		bw.write(String.valueOf(a[0]*a[n-1]));


		//	System.out.print(a[0]*a[n-1]);

		bw.flush();		
		bw.close();

	}

}
