import java.util.Scanner;

public class 넷째주Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	while(true) {
		
		System.out.print("Base= ");
		float base=scanner.nextFloat();
		
		System.out.print("Height= ");
		float height=scanner.nextFloat();
		float width=(base*height)/2;
		
		System.out.println(String.format("Triangle width= %.1f ",width));
		System.out.print("continue? ");
		scanner.nextLine();
		String con = scanner.nextLine();
		if(!con.equals("Y")&&!con.equals("y")){
			break;
			}
		}
	}
}
