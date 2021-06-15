import java.util.Scanner;

public class 넷째주문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int x=scanner.nextInt();
		int cnt=0;
		int sum=0;
		for(int i=1;sum<x;i++) {
			if(i%2==1) {
				sum+=i;
				cnt++;
			}
		}
				System.out.printf("%d %d",cnt,sum);
				}

}
