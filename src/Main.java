import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        System.out.println("\t\t- Program Perpustakaan - ");
        System.out.println("1. Buku");
        System.out.println("2. Anggota");
        System.out.println("3. Peminjaman");
        System.out.println("4. Pengembalian");
        System.out.print("  Masukkan pilihan : ");
        pilih = in.nextInt();

        System.out.println();
        Buku buk = new Buku();
        switch (pilih){
            case 1 :
                do {
                    System.out.println("\t - Menu Buku - ");
                    System.out.println("1. Input Buku");
                    System.out.println("2. Data Buku");
                    System.out.print("  Masukkan pilihan : ");
                    pilih = in.nextInt();
                if (pilih == 1){
                    buk.input_buku();
                }
                else if (pilih==2) {
                    buk.display_buku();
                }
                }while (pilih != 3);

                break;

            case 2 :
                System.out.println("Ini menu anggota");
                break;
            case 3 :
                System.out.println("Ini menu peminjaman");
                break;
            case 4 :
                System.out.println("Ini menu pengembalian");
                break;
        }
    }
}