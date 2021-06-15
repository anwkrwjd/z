import java.util.Scanner;

public class 넷째주문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>b) {
			for(int j=1;j<=9;j++) {
				for(int i=a;i>=b;i--) {
					System.out.printf("%d * %d = %2d  ",i,j,i*j);
				}
			System.out.println();
			}
		}
		else {
			for(int j=1;j<=9;j++) {
				for(int i=a;i<=b;i++) {
					System.out.printf("%d * %d = %2d  ",i,j,i*j);
				}
				System.out.println();
			}
		}
	}
}
