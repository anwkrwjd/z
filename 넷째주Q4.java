import java.util.Scanner;

public class 넷째주Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		while(true) {
			int i= scanner.nextInt();
			if(i==0)
				break;
			if (i%3!=0&&i%5!=0)
				x++;
		}
		System.out.print(x);
	}
}