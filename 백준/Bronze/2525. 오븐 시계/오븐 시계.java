import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H, M, V;
		H = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		M = M+V;
		
		if(M>=60) {
			while (M>=60) {
				H ++;
				M -=60;
				if(H>=24) {
					H=0;
				}
			}
		}
		
		System.out.println(H+" "+M);
		
	}

}
