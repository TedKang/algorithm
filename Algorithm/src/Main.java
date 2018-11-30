import java.util.Scanner;

public class Main {		
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		long tmp[] = Utils.getLongArray(sc.nextLine().split(" "));
		
		Problem2869 solve = new Problem2869(tmp[0], tmp[1], tmp[2]);
		System.out.println(solve.getRes());
	}	
}
