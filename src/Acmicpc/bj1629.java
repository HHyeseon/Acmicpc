package Acmicpc;

import java.util.*;
public class bj1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		long a=input.nextInt();
		long b=input.nextInt();
		long mod=input.nextInt();
		
		long result=1;
		long mul=(a%mod);
		
		while(b>0) {
			if(b%2==1) {
				result *= mul;
				result %= mod;
			}
			
			mul=((mul%mod)*(mul%mod))%mod;
			//mul=((mul%mod)*(mul%mod));
			//mul=(mul*mod)%mod;      
			b/=2;
		}
		System.out.print(result);
		
	}
}
