import java.util.Scanner;

public class Bioskop06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        final double hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk selesai): ");
            int jumlahTiket = input.nextInt();

            if (jumlahTiket == 0) {
                break;
            } else if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Mohon masukkan angka positif.");
                continue;
            }

            double harga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = harga * (1 - diskon);
            
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaSetelahDiskon;
            
            System.out.println("Subtotal: Rp " + (hargaSetelahDiskon * 100.0) / 100.0 + " (Diskon: " + (diskon * 100) + "%)");
        }

        System.out.println("\n============== HASIL PENJUALAN HARI INI ==============");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        System.out.println("======================================================");

    }
}
