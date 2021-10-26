import java.util.Scanner;

public class GugudanTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<num; j++) {
				System.out.println((i+2)*(j+1));
			}
		}
	}
}
