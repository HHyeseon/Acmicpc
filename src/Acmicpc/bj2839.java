package Acmicpc;

import java.util.Scanner;

public class bj2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int count=0;
		
		while(true) {
			if(n%5==0 && n>=0) {		//5로 나누어 떨어지고 양의 값이어야함
				System.out.println((n/5)+count);
				break;
			}
			
			if(n<0) {
				System.out.println(-1);
				break;
			}		//예를들면 4는 n-=3에 의해 음수가 되기 때문에 0이 출력됨
			
			n-= 3;
			count++;
		}
		
	}

}
