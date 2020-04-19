package Acmicpc;

import java.util.*;
public class bj1463 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		long n = input.nextLong();
		long[]arr = new long[(int)n+1];

		if(n<=1) {			//n이 1보다 작거나 같을 경우는 계산할 필요x
			arr[0]=0;
			arr[1]=0;
		}

		for(int i=2; i<=n; ++i) {		//조건에 해당하면 배열에 1을 더한다
			arr[(int)i]= arr[(int)i-1]+1;

			if(n%3==0 && arr[(int)i/3]+1 < arr[(int)i])
				arr[(int)i] = arr[(int)i/3]+1;
			else if(n%2==0 && arr[(int)i/2]+1 < arr[(int)i])
				arr[(int)i] = arr[(int)i/2]+1;

		}

		System.out.print(arr[(int)n]);



	}
}
