package Acmicpc;
import java.util.Scanner;

public class bj4948 {

	static boolean []a= new boolean[246913];		//������ 123456�����̹Ƿ� �迭�� 0�δ� �����ϹǷ� 2���� 246912�� 1�� ���Ѵ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	//	int count=0;			while������ �Է��� �ޱ⶧���� ���⿡ �����ϸ� count���� �����ǹǷ� while���� �����Ѵ�.

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