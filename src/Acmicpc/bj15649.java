package Acmicpc;

import java.util.*;
public class bj15649 {
	static int[]a= new int[9];
	static boolean[]check= new boolean[9];		//��������� false, �׷��� ������ true
	
	
	static void go(int index, int n, int m) {
		if(index== m)	{	//����(index)�� m�� �Ǹ� ����� ���
			
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
			if(check[i])	//true�̸� �׳� �Ѿ��
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
		int n=input.nextInt();	//1~n������ �ڿ���
		int m=input.nextInt();	//����
		int index=0;
		
		go(index, n, m);
					
	}

}
