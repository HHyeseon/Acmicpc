package Acmicpc;
import java.util.Scanner;

public class bj4948 {

	static boolean []a= new boolean[246913];		//범위가 123456까지이므로 배열이 0부더 시작하므로 2배인 246912에 1을 더한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	//	int count=0;			while문에서 입력을 받기때문에 여기에 선언하면 count값이 축적되므로 while문에 선언한다.

		while(true) {
			
			prime();
			
			int n= input.nextInt();
			int count=0;
			
			if(n==0)
				break;
			
			for(int i=n+1; i<= 2*n; ++i) {
				if(!a[i])
					count++;

			}

			System.out.println(count);
		}





	}

	public static void prime() {
		a[0]=a[1]= true;

		for(int i=2; i<=Math.sqrt(a.length); ++i) {
			if(a[i])
				continue;

			for(int j=i*i; j<= a.length; j+=i) {
				a[j]= true;
			}
		}
	}
}