public class Anggota extends Operasi{
    public String[] id_anggota = new String[max];
    String[] nama_anggota = new String[max];
    String[] alamat = new String[max];
    String[] no_telp = new String[max];


    @Override
    public void input() {
        System.out.println("Inputkan Data");
        System.out.print("ID anggota : ");
        id_anggota[top] = in.nextLine();
        System.out.print("Nama : ");
        nama_anggota[top] = in.nextLine();
        System.out.print("Alamat : ");
        alamat[top] = in.nextLine();
        System.out.print("No Telp : ");
        no_telp[top] = in.nextLine();
        top++;


        System.out.println();
        System.out.println("Data masuk daftar");
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("\t - Data Anggota -");
        for (int i=0; i<top; i++){
            System.out.println();
            System.out.println("No          : " +(i+1));
            System.out.println("ID Anggota  : " +id_anggota[i]);
            System.out.println("Nama        : " +nama_anggota[i]);
            System.out.println("Alamat      : " +alamat[i]);
            System.out.println("No telp     : " +no_telp[i]);
        }
    }
}
