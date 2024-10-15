package Tugasp7;

public class DeretBilanganGanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Bilangan ganjil dari 0-20:");
	        int i = 1;
	        while (i <= 20) {
	            if (i % 2 != 0) {
	                System.out.print(i + " ");
	            }
	            i++;
	        }

	        System.out.println("\nBilangan genap dari 0-20:");
	        i = 0;
	        while (i <= 20) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	            i++;
	        }
	}
}
