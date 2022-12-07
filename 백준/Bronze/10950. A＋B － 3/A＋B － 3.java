import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int N,C;
		N = sc.nextInt();
		
		for(C=1; C<=N; C++) {
			System.out.println(sc.nextInt()+sc.nextInt());
		}
		
    }
}