import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Peminjaman extends Operasi{
    File file = new File("struk.txt");
    String[] id_peminjaman = new String[max];
    String[] tgl_peminjaman = new String[max];
    String[] id_anggota = new String[max];
    String[] id_buku = new String[max];
    int pilih;


    @Override
    public void input() {
        System.out.println(" - Inputkan Data - ");
        System.out.print("Masukkan ID Peminjaman : ");
        id_peminjaman[top] = in.nextLine();
        System.out.print("Masukkan Tanggal Peminjaman : ");
        tgl_peminjaman[top] = in.nextLine();
        System.out.print("Masukkan ID Anggota : ");
        id_anggota[top] = in.nextLine();
        System.out.print("Masukkan ID Buku : ");
        id_buku[top] = in.nextLine();


        System.out.println("1. Cetak Struk");
        System.out.println("2. Simpan");
        System.out.println("Pilih : ");
        pilih = in.nextInt();
        if (pilih == 1){
            print();
        }
        else {
            System.out.println("Data masuk daftar");
            System.out.println();
        }
        top++;
    }

    public void print(){
        try {
            PrintWriter out = new PrintWriter(file);
            out.println(" - Struk Peminjaman -");
            out.println("ID Peminjaman : " + id_peminjaman[top]);
            out.println("Tanggal       : " + tgl_peminjaman[top]);
            out.println("ID Anggota    : " + id_anggota[top]);
            out.println("ID Buku       : " + id_buku[top]);
            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Gagal mencetak struk");
        }
    }

    @Override
    public void display() {
        System.out.println("\t - Data Peminjaman -");
        for (int i=0; i<top; i++){
            System.out.println();
            System.out.println("No          : " +(i+1));
            System.out.println("ID Peminjaman  : " +id_peminjaman[i]);
            System.out.println("Tanggal        : " +tgl_peminjaman[i]);
            System.out.println("ID Anggota     : " +id_anggota[i]);
            System.out.println("ID Buku        : " +id_buku[i]);
        }
    }
}
