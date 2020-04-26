package Acmicpc;

import java.util.*;
public class bj15649 {
	static int[]a= new int[9];
	static boolean[]check= new boolean[9];		//비어있으면 false, 그렇지 않으면 true
	
	
	static void go(int index, int n, int m) {
		if(index== m)	{	//길이(index)가 m이 되면 결과를 출력
			
			for(int i=0; i<m; ++i) {
				System.out.print(a[i]);
				if(i!= m-1) {
					System.out.print(" ");					
				}
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=n; ++i) {
			if(check[i])	//true이면 그냥 넘어간다
				continue;
			
			check[i]= true;
			a[index]= i;
			
			go(index+1, n, m);
			check[i]= false;
			a[index]= 0;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();	//1~n까지의 자연수
		int m=input.nextInt();	//길이
		int index=0;
		
		go(index, n, m);
					
	}

}
