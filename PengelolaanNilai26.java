import java.util.Scanner;
public class PengelolaanNilai26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        int tertinggi = nilai[0], terendah = nilai[0];
        double rataRata = (double) total / jumlah;
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi){ 
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah){ 
                terendah = nilai[i];
            }
        }
        System.out.println("=-HASIL PENGELOLAAN NILAI=-");
        System.out.println("Rata-rata           :" + total / jumlah);
        System.out.println("Nilai tertinggi     :" + tertinggi);
        System.out.println("Nilai terendah      :" + terendah);
        System.out.println("Total nilai         :" + terendah);

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        input.close();
    }
}