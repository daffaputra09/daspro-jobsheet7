import java.util.Scanner;

public class Parkir06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        }

        System.out.println("\n==================================");
        System.out.println("Total pembayaran parkir: Rp " + total);
        System.out.println("==================================");

    }
}
