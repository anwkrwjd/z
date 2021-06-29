import java.util.Scanner;

public class arrary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		
		System.out.print(arr[0]+" "+arr[3]+" "+arr[6]);
	}
}
