import java.util.Scanner;
public class KafeKampus26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng","Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };
        System.out.print("--CARI MENU--");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1)+". " +menu[i] + " harganya Rp" + harga[i]);
        }
        System.out.print("menu apa yang kamu inginkan :");
        String cariMenu = input.nextLine();
        
        int pos = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                pos = i;
                break;
            }
        }
        if (pos !=-1){
            System.out.println("menun tersedia: "+ menu[pos]);
            System.out.println("harga : Rp"+ harga[pos]);
        }else{
            System.out.println("menu" + cariMenu + " maaf tidak tersedia ");
        }
        System.out.println("jumlah pesanan yang ingin di pesan");
        int jumlah = input.nextInt();
        input.nextLine();
    
        String[] pesanan = new String[jumlah];     
        int[] hargaPesanan = new int[jumlah];
    
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;
            while (!ditemukan) {
                System.out.print("Menu ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
            
                for (int j = 0; j < menu.length; j++) {
                    pos = j;
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[pos];
                        hargaPesanan[i] = harga[pos];
                        total += harga[pos];
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("maaf menu tidak tersedia, coba lagi.");
                }
            } 
        }
        System.out.println("----DAFTAR PESANAN----");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + "- Rp" + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("TOTAL BIAYA: Rp"+ total);
        System.out.println("==========================");
        input.close();
    }
}