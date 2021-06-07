import java.util.Scanner;

public class 넷째주Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	int i = 1;
	int sum = 0 ;
	int num = scanner.nextInt();
	
	while (i<=num) {
		sum+=i;
		i++;
	}
	System.out.print(sum);
	}
}

