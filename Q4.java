import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int x;
		int y;
		int z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오 :  ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오 :  ");
		y = input.nextInt();
		
		System.out.print("세번째 숫자를 입력하시오 :  ");
		z = input.nextInt();
		
		int sum = x+y+z;
		int avg = sum/3;
		System.out.println("sum = "+ sum);
		System.out.println("avg = "+ avg);
	}

}
