package Acmicpc;

import java.util.Scanner;
public class bj10844 {

	static long mod= 1000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();		//����
		int[][]a= new int[n+1][10];
		
		for(int i=1; i<=9; ++i) {
			a[1][i]= 1;
		}		//���̰� 1�� ��쿣 �� �����ۿ� �����Ƿ�

		for(int j=2; j<=n; ++j) {

			for(int k=0; k<=9; ++k) {
				
				a[j][k]=0;

				if(k-1 >= 0) 
					a[j][k]+= a[j-1][k-1];
				
				 if(k+1 <= 9) 
					a[j][k]+= a[j-1][k+1];
				 
				
				a[j][k] %= mod;
			}
		}
		
		long ans=0;
		
		for(int i=0; i<=9; ++i) {
			ans+= a[n][i];
		}
		
		System.out.print(ans%mod);

		 
		

	}

}
