public class kafe9default {
    import java.util.Scanner;
public class kafe9default {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan Ukuran Cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
        case "kopi":
          hargaMenu = 12000;
          break;
        case "teh":
          hargaMenu = 7000;
          break;
        case "coklat":
          hargaMenu = 20000;
          break;
        }
    double totalHarga = hargaMenu*jumlah;

    switch (ukuranCup) {
        case 'S':
          break;
        case 'M':
          totalHarga += 0.25 * totalHarga;
          break;
        case 'L':
        totalHarga += 0.4 * totalHarga;
        break;
        default:
        System.out.println("Size Is Unavailable ");
    }
    double diskon = keanggotaan ? 0 : 0.1;
    double nominalBayar = totalHarga - (diskon * totalHarga);
 System.out.println("Item Pembelian: " + jumlah + " " + menu +" dengan ukuran cup " + ukuranCup);
 System.out.println("Nominal Bayar: " + nominalBayar);

    }
    
}
}
