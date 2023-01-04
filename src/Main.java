import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        String username, password;

        Operasi ops = new Operasi();
        Buku buk = new Buku();
        Anggota agt = new Anggota();
        Peminjaman pinjam = new Peminjaman();
        Pengembalian kembali = new Pengembalian();

        System.out.println("\t\t- Login - ");
        System.out.println("Masukkan-- ");
        System.out.print("Username : ");
        username = in.nextLine();
        System.out.print("Password : ");
        password = in.nextLine();

        if (ops.login(username,password)) {
            System.out.println();
            System.out.println();

            ops.Menu();
            System.out.println();

            switch (ops.pilih) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("\t - Menu Buku - ");
                        System.out.println("1. Input Buku");
                        System.out.println("2. Data Buku");
                        System.out.println("3. Kembali");
                        System.out.print("  Masukkan pilihan : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            buk.input();
                        }
                        else if (pilih == 2) {
                            buk.display();
                        }
                        else if (pilih == 3) {
                            ops.Menu();
                        }
                    } while (pilih != 4);

                    break;

                case 2:
                    do {
                        System.out.println();
                        System.out.println("\t - Data Anggota - ");
                        System.out.println("1. Tambah Anggota");
                        System.out.println("2. Tampilkan data anggota");
                        System.out.println("3. Kembali");
                        System.out.print("  Masukkan pilihan : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            agt.input();
                        } else if (pilih == 2) {
                            agt.display();
                        } else if (pilih == 3) {
                            ops.Menu();
                        }
                    } while (pilih != 4);

                    break;
                case 3:
                    do {
                        System.out.println();
                        System.out.println("\t - Data Peminjaman - ");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. Kembali");
                        System.out.print("  Masukkan pilihan : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            pinjam.input();
                        } else if (pilih == 2) {
                            pinjam.display();
                        } else if (pilih == 3) {
                            ops.Menu();
                        }
                    } while (pilih != 4);

                    break;
                case 4:
                    do {
                        System.out.println();
                        System.out.println("\t - Data Pengembalian - ");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. kembali");
                        System.out.print("  Masukkan pilihan : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            kembali.input();
                        } else if (pilih == 2) {
                            kembali.display();
                        } else if (pilih == 3) {
                            ops.Menu();
                        }
                    } while (pilih != 4);

                    break;
            }
        }
        else {
            System.out.println("Username atau password yang anda masukkan salah");
        }
    }
}