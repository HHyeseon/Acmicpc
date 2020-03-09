package Acmicpc;

import java.util.*;
public class bj11057 {

	static int mod= 10007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int[][]a= new int[n+1][10];		//길이가 n, 두번째 인덱스는 마지막 수
		
		for(int i=0; i<=9; ++i)
			a[1][i]= 1;
		//길이가 1이고 마지막수가 0~9일때
		
		for(int i=2; i<=n; ++i) {
			for(int j=0; j<=9; ++j) {
				for(int k=0; k<=j; ++k) {
					a[i][j]+= a[i-1][k];
					a[i][j]%= mod;
				}
			}
		}
		
		int ans=0;
		for(int z=0; z<=9; ++z) {
			ans+= a[n][z];
			
		}
		
		ans%=mod;
		System.out.println(ans);



	}

}
