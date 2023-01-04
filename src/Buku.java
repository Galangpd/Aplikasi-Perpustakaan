public class Buku extends Operasi{
    int max=50;
    int top=0;
    String[] id_buku = new String[max];
    String[] judul = new String[max];
    String[] jenis = new String[max];
    String[] penulis = new String[max];
    String[] penerbit = new String[max];


    @Override
    public void input() {
        System.out.print("Masukkan ID buku : ");
        id_buku[top] = in.nextLine();
        System.out.print("Masukkan judul buku : ");
        judul[top] = in.nextLine();
        System.out.print("Masukkan jenis buku : ");
        jenis[top] = in.nextLine();
        System.out.print("Masukkan nama penulis : ");
        penulis[top] = in.nextLine();
        System.out.print("Masukkan nama penerbit : ");
        penerbit[top] = in.nextLine();
        top++;


        System.out.println();
        System.out.println("Buku masuk daftar");
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("\t - Daftar Buku -");
        for (int i=0; i<top; i++){
            System.out.println();
            System.out.println("No       : " +(i+1));
            System.out.println("ID Buku  : " +id_buku[i]);
            System.out.println("Judul    : " +judul[i]);
            System.out.println("Jenis    : " +jenis[i]);
            System.out.println("Penulis  : " +penulis[i]);
            System.out.println("Penerbit : " +penerbit[i]);

            System.out.println();
        }
        System.out.println();
    }
}
