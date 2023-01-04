public class Pengembalian extends Operasi{
    String[] id_pengembalian = new String[max];
    String[] tgl_pengembalian = new String[max];
    String[] id_peminjaman = new String[max];
    String[] id_anggota = new String[max];
    String[] id_buku = new String[max];

    @Override
    public void input() {
        System.out.println(" - Inputkan Data - ");
        System.out.print("Masukkan ID Pengembalian : ");
        id_pengembalian[top] = in.nextLine();
        System.out.print("Masukkan Tanggal Pengembalian : ");
        tgl_pengembalian[top] = in.nextLine();
        System.out.print("Masukkan ID Peminjaman : ");
        id_peminjaman[top] = in.nextLine();
        System.out.print("Masukkan ID Anggota : ");
        id_anggota[top] = in.nextLine();
        System.out.print("Masukkan ID Buku : ");
        id_buku[top] = in.nextLine();
        top++;

        System.out.println();
        System.out.println("Data masuk daftar");
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("\t - Data Peminjaman -");
        for (int i=0; i<top; i++){
            System.out.println();
            System.out.println("No          : " +(i+1));
            System.out.println("ID Pengembalian  : " +id_peminjaman[i]);
            System.out.println("Tanggal          : " +tgl_pengembalian[i]);
            System.out.println("ID Peminjaman    : " +id_peminjaman[i]);
            System.out.println("ID Anggota       : " +id_anggota[i]);
            System.out.println("ID Buku          : " +id_buku[i]);
        }
    }
}
