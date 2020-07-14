package Acmicpc;

import java.util.*;

public class bj15650{
	static int[]a= new int[10];
	static boolean []check= new boolean[10];
	
	static void go(int index, int start, int n, int m) {
		if(index==m) {				//index가 m이 될 경우(m의  개수만큼 선택됐을때) 출력을 한다.
			for(int i=0; i<m; ++i) {
				System.out.print(a[i]);
				if(i!= m-1)
					System.out.print(' ');
			}
			
			System.out.println();
			return;
		}
	/////////////////////////출력////////////////////////////
		
		for(int i=start; i<=n; ++i) {
			if(check[i])		//i는 1부터 n까지의 값,만약 i값을 사용한 적이 있으면 건너뛴다.
				continue;
			
			check[i]=true;
			a[index]=i;
			go(index+1, i+1, n, m);
			
			check[i]= false;		//위의 재귀호출로 index위치에 i를 모두 넣었으므로 원래 상태로 되돌림
//			a[index]=0;		이 부분은 있어도되고 없어도됨
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();		//1~n까지의 자연수
		int m= input.nextInt();		//길이
		int index=0;
		
		go(index, 1, n, m);

	}

}
