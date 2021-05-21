import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("yard? ");
		double yard = scanner.nextDouble();
		double cm = yard*91.44;
		System.out.printf("%.1fyard=%.1fcm\n", yard,cm);
	
	}

}
