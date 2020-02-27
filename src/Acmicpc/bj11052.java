package Acmicpc;

import java.util.*;
import java.lang.Math;
public class bj11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int[]p= new int[n+1];			//가격
		int[]d= new int[n+1];		//최대


		for(int i=1; i<=n; ++i)
			p[i]= input.nextInt();
		
		
		for(int j=1; j<=n; ++j) {
			for(int k=1; k<=j; ++k) {
				if(d[j]<d[j-k]+p[k])
					d[j]= d[j-k]+p[k];
				
			}
		}
		
		System.out.print(d[n]);
	}

}
