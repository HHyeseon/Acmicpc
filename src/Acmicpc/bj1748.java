package Acmicpc;

import java.util.Scanner;

public class bj1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		long result=0;
		
		for(int start=1, len=1; start<=n; start*=10, ++len) {			//1~9, 10~99, 100~999... 
			int end= start*10-1;		//위의 각주 참조
			
			if(end>n)
				end=n;
			
			result+= (long)(end-start+1)*len;		//결과값은 숫자의 개수와 길이를 곱한값을 더하면된다.
		}
		System.out.println(result);
		
		
	}

}
