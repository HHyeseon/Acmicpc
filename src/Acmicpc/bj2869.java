package Acmicpc;


import java.io.*;
import java.util.StringTokenizer;
public class bj2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A = Long.parseLong(st.nextToken());			//���� �ö󰡴� ����
		long B = Long.parseLong(st.nextToken());			//�㿡 �̲������� ����
		long V = Long.parseLong(st.nextToken());			//����
		
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
