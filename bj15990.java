package Acmicpc;

import java.util.*;
public class bj15990 {
	static final long mod = 1000000009L;
	static final int l= 1000;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int t= input.nextInt(); //테스트 개수
		long[][]a= new long[l+1][4];

		for(int i=1; i<=l; ++i) {
			if(i-1>= 0) {
				a[i][1]= a[i-1][2]+a[i-1][3];

				if(i==1)
					a[i][1]=1;

				a[i][1]%=mod;
			}

			if(i-2>= 0) {
				a[i][2]= a[i-2][1]+a[i-2][3];

				if(i==2)
					a[i][2]=1;
				a[i][2]%=mod;
			}

			if(i-3>=0) {
				a[i][3]= a[i-3][1]+a[i-3][2];

				if(i==3)
					a[i][3]=1;

				a[i][3]%=mod;
			}

		}

		for(int i=0; i<t; ++t) {
			int n=input.nextInt();
			System.out.println((a[n][1]+a[n][2]+a[n][3])%mod);

		}



	}

}
