import java.util.*;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(M>=45) {
			M -= 45;
		}else if(M<45) {
			H--;
			M = M +60-45;
			if(H<0) {
				H=23;
			} 
		}
		
		System.out.printf("%d %d",H,M);
	}

}
