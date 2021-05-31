import java.util.Scanner;

public class 셋째주문제2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대문자를 입력하세요: ");
		
		String grade = scanner.nextLine();
		
		switch (grade){
		
		case "A" :
			System.out.print("Excellent");
			break ;	
		
		case "B" :
			System.out.print("Good");
			break ;
		
		case "C" :
			System.out.print("Usually");
			break ;
		
		case "D" :
			System.out.print("Effort");
			break ;
			
		case "F" :
			System.out.print("Failure");
			break ;
			
		default :
			System.out.print("error");
			break ;
		
		}
		
	}
}
