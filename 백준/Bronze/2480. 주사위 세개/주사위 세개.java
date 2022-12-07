import java.util.*;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A == B && B == C)
            System.out.print(10000 + A*1000);
        else if(A == B || A == C)
            System.out.print(1000 + A*100);
        else if(B == C)
            System.out.print(1000 + B*100);
        else
            System.out.print((Math.max(Math.max(A, B), C)*100));
		
    }
}