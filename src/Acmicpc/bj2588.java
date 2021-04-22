package Acmicpc;

import java.util.Scanner;
public class bj2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int result= a*b;
		
		System.out.println(a*(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a*(b/100));
		System.out.println(result);
	}

}
