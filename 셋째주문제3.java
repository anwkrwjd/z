import java.util.Scanner;

public class 셋째주문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("number?  ");
		
		String name = scanner.nextLine();
		
		switch (name){
		
		case "1" :
			System.out.print("Dog");
			break ;	
		
		case "2" :
			System.out.print("Cat");
			break ;
		
		case "3" :
			System.out.print("chick");
			break ;
		
			
		default :
			System.out.print("I don't konw.");
			break ;
		
		}

	}

}
