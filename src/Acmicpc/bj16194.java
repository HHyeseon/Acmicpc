package Acmicpc;

import java.util.Scanner;
public class bj16194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();		//ī���� ����
		int[]d= new int[n+1];		//�ּ�
		int[]p= new int[n+1];		//����
		
		for(int i=1; i<=n; ++i) {
			p[i]= input.nextInt();
			d[i]= 1000*10000;
		}
		

		d[0]=0;
		for(int j=1; j<=n; ++j) {
			for(int k=1; k<=j ; ++k) {
				if(d[j]>d[j-k]+p[k])
					d[j]= d[j-k]+p[k];
			}
		}
		
		System.out.print(d[n]);
		
		
	}

}