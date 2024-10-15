package Tugasp7;

public class AnakAyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
        do {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        } while (n > 1);
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
	}
}
