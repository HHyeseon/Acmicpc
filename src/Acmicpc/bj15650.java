package Acmicpc;

import java.util.*;

public class bj15650{
	static int[]a= new int[10];
	static boolean []check= new boolean[10];
	
	static void go(int index, int start, int n, int m) {
		if(index==m) {				//index�� m�� �� ���(m��  ������ŭ ���õ�����) ����� �Ѵ�.
			for(int i=0; i<m; ++i) {
				System.out.print(a[i]);
				if(i!= m-1)
					System.out.print(' ');
			}
			
			System.out.println();
			return;
		}
	/////////////////////////���////////////////////////////
		
		for(int i=start; i<=n; ++i) {
			if(check[i])		//i�� 1���� n������ ��,���� i���� ����� ���� ������ �ǳʶڴ�.
				continue;
			
			check[i]=true;
			a[index]=i;
			go(index+1, i+1, n, m);
			
			check[i]= false;		//���� ���ȣ��� index��ġ�� i�� ��� �־����Ƿ� ���� ���·� �ǵ���
//			a[index]=0;		�� �κ��� �־�ǰ� �����
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();		//1~n������ �ڿ���
		int m= input.nextInt();		//����
		int index=0;
		
		go(index, 1, n, m);

	}

}
