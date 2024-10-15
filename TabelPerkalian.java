package Tugasp7;

public class TabelPerkalian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10; 
	        System.out.println("Tabel perkalian " + n + " x " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                System.out.print(i * j + "\t");
	            }
	            System.out.println();
	        }
	}
}
