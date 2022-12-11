import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, x;
		double c;
		
		System.out.println("Üçgenin dik kenarlarından birini giriniz: ");
		a = scan.nextInt();
		
		System.out.println("Üçgenin diğer dik kenarını giriniz: ");
		b = scan.nextInt();
		
		x = a*a + b*b;
		c = Math.sqrt(x);
		
		
		System.out.println("Hipotenüs Değeri: " + c);
	}

}
