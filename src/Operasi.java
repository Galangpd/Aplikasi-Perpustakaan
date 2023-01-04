import java.util.Scanner;

public class Operasi {
    public Scanner in = new Scanner(System.in);
    public int max=50;
    public int top=0;
    public int pilih;


    public boolean login(Object obj1, Object obj2){
        if(obj1.equals("admin") && obj2.equals("admin")) {
            return true;
        }
        else {
            return false;
        }
    }
    public int Menu(){
        pilih = 0;
        System.out.println();
        System.out.println("\t\t- Program Perpustakaan - ");
        System.out.println("1. Buku");
        System.out.println("2. Anggota");
        System.out.println("3. Peminjaman");
        System.out.println("4. Pengembalian");
        System.out.print("  Masukkan pilihan : ");
        pilih = in.nextInt();

        return pilih;
    }

    public void input(){
        System.out.println("Ini fitur input");
    }

    public void display(){
        System.out.println("Ini fitur display");
    }
}
