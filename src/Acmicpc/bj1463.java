package Acmicpc;

import java.util.*;
public class bj1463 {

		static int[]arr;
		public static void main(String[] args)  {
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			arr=new int[n+1];
			
			
			System.out.print(one(n));
		}





		public static int one(int n) {

		
			if(n<=1) 
				return 0;
			if(arr[n]>0)
				return arr[n];
			
			
			int temp= one(n-1)+1;
			if(n%2==0) {
				arr[n]= one(n/2)+1;
				if(temp>arr[n])
					temp=arr[n];
			}
			else if(n%3==0) {
				arr[n]= one(n/3)+1;
				if(temp>arr[n])
					temp=arr[n];
			
			}
			
			return temp;
		}
	}


