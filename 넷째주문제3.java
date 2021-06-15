import java.util.Scanner;

public class 넷째주문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
