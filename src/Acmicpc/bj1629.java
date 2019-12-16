package Acmicpc;

import java.util.*;
public class bj1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int mod=input.nextInt();
		int result=1;
		int mul=(a%mod);
		
		while(b>0) {
			if(b%mod == 1) {
				result *= mul;
				result %= mod;
				
			}
			result= (mul%mod)*(mul%mod)%mod;
			b/=2;
		}
		System.out.print(result);
		
		
	}
}
