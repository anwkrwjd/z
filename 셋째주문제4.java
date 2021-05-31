import java.util.Scanner;

public class 셋째주문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("  ");
		int month = scanner.nextInt();
		
		switch (month){
		
		case 1 :
			System.out.print("31");
			break ;	
		
		case 2 :
			System.out.print("28");
			break ;
		
		case 3 :
			System.out.print("31");
			break ;
			
		case 4 :
			System.out.print("30");
			break ;	
		
		case 5 :
			System.out.print("31");
			break ;
		
		case 6 :
			System.out.print("30");
			break ;
			
		case 7 :
			System.out.print("31");
			break ;	
		
		case 8 :
			System.out.print("31");
			break ;
		
		case 9 :
			System.out.print("30");
			break ;
			
		case 10 :
			System.out.print("31");
			break ;	
		
		case 11 :
			System.out.print("30");
			break ;
		
		case 12 :
			System.out.print("31");
			break ;
		
		}
	}
}
