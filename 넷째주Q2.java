import java.util.Scanner;

public class 넷째주Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);

	int sum = 0;
	int num = scanner.nextInt(); 
	
	for(int i=num; i<=100; i++){
		sum+=i;
		}
	System.out.print(sum);
	}
}
