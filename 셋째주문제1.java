import java.util.Scanner; //Scanner를 사용하기 위해 추

public class 셋째주문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		int n=scanner.nextInt();
		if (0<n) {
			System.out.println("plus");
		}
		else if (0==n) {
			System.out.println("zero");
		}
		else  {
			System.out.println("minus");	
		}
	}
}
