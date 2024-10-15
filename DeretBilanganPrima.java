package Tugasp7;

public class DeretBilanganPrima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Bilangan prima dari 0-20:");
	        for (int i = 2; i <= 20; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }

	        System.out.println("\nBilangan bukan prima dari 0-20:");
	        for (int i = 0; i <= 20; i++) {
	            boolean isPrime = true;
	            if (i < 2) isPrime = false;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (!isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	}
}
