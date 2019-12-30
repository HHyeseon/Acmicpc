package Acmicpc;

import java.util.*;
public class bj1065 {
	
	public static int findNumber(int number) {
		int count=99;
		int a= number%10;    //일의 자리
		int b= (number/10)%10;		 //십의 자리
		int c= (number/100)%10;   //백의 자리
		
		int gap1=c-b;
		int gap2=b-a;
			
		if(gap1==gap2)
			return 1;
		
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		int n=input.nextInt();
		int count=99;
		
		if(n<100)
			System.out.println(n);

		else  {
			for(int i=100; i<=n; ++i) {
				
				count += findNumber(i);
			}
			if(n==1000)
				count--;
			
			System.out.print(count);

		}
		
		
	
	}

}
