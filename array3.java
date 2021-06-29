import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double[] arr= {85.6, 79.5, 83.1, 80.0, 79.2, 75.0};
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double sum=arr[a-1]+arr[b-1];
		
		System.out.printf("%.1f",sum);
	}

}
