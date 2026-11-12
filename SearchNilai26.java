import java.util.Scanner;
public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("banyak elemen: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("nilai ke: " + (i + 1) + " :");
            nilai[i] = sc.nextInt();
        }
        System.out.print("nilai yang di cari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang di cari" + key + " tidak ditemukan.");
        }
    }
}