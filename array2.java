import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		double[] arr = new double[6];
		double sum = 0;
		double average=0;
		
		for(int i=0; i<6; i++) {
			arr[i] = scanner.nextDouble();
			sum+=arr[i];
		}
		average= sum/6;
		Math.round(average);
		System.out.printf("%.1f", average);
	}

}
