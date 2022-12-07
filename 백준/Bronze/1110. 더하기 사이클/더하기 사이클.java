import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
        
		int copy = num;
		int count = 0;
		
		while(true) {
			
			num = (((num%10)*10) +(((num/10)+(num%10))%10));
			count++;
			
			if(copy == num) {
			break;
			}
		}
		
		System.out.print(count);
	}
}
