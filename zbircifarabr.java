import java.util.Scanner;
public class zbircifarabr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pozitivan, cijeli broj:");
		int num = unos.nextInt(); 	  
	    int sum = 0;
	    
	    if(num < 0){
        	System.out.println("NOPE. Procitaj uputu i probaj ponovo.");
	    }
	        while (num > 0) {
	            sum = sum + num % 10;
	            num = num / 10;
	            }
	        System.out.println("Rezultat je: " + sum);  
	        

	}

}
