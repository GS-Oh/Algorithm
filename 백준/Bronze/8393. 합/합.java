import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i, T=0;
		
		for(i=1; i <= N; i++) {
			T = T+i;
		}
		System.out.println(T);
        
	}
}