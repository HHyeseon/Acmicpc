package Acmicpc;

import java.util.*;
public class bj2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Scanner input = new Scanner(System.in);
		int destination=input.nextInt();
		int departure=1;
		int count=1;	//시작 지점부터 세지 않기때문에 1로 초기화
		int n=6;

		while(true) {
			if(destination<=departure)
				break;

			departure+=n;   
			n+=6;
			count++;
		}
		System.out.print(count);
		 */
/*
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i = 1; i<100000000;i++){
			if(1+3*i*(i-1)<=N && N<=1+3*(i+1)*i) {
		
			
				System.out.println(i+1);
				break;
			}
		}
		*/
		
		Scanner input = new Scanner(System.in);
		int destination=input.nextInt();
		int departure=1;
		int n=6;
		int count=1;
		
		while(true) {
			if(destination<=departure)
				break;
			
			departure+=n;
			n+=6;
			count++;
		}
		System.out.print(count);

	}

}
