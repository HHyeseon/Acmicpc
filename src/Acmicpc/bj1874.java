package Acmicpc;
import java.util.*;

public class bj1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		StringBuilder sb= new StringBuilder();
		Stack<Integer> stack= new Stack<>();
		int start=0;


		while(n-- >0) {
			int value= input.nextInt();

			if(value>start) {
				for(int i=start+1; i<=value; ++i) {
					stack.push(i);
					sb.append("+").append('\n');
					//System.out.println("+");
				}
				
				start= value;
			}
			
			else if(stack.peek()!= value) {
				System.out.println("NO");
				System.exit(0);			//또는 return으로 써도 결과는 같다
			}
			
			stack.pop();
			sb.append("-").append('\n');
			//System.out.println("-");
		}

		System.out.println(sb);
	}

}
