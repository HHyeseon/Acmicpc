package Acmicpc;

import java.util.*;
public class bj1463 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		long n = input.nextLong();
		long[]arr = new long[(int)n+1];

		if(n<=1) {			//n�� 1���� �۰ų� ���� ���� ����� �ʿ�x
			arr[0]=0;
			arr[1]=0;
		}

		for(int i=2; i<=n; ++i) {		//���ǿ� �ش��ϸ� �迭�� 1�� ���Ѵ�
			arr[(int)i]= arr[(int)i-1]+1;

			if(n%3==0 && arr[(int)i/3]+1 < arr[(int)i])
				arr[(int)i] = arr[(int)i/3]+1;
			else if(n%2==0 && arr[(int)i/2]+1 < arr[(int)i])
				arr[(int)i] = arr[(int)i/2]+1;

		}

		System.out.print(arr[(int)n]);



	}
}
