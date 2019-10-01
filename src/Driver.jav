import java.util.Scanner;

public class Driver{
    public static Scanner input = new Scanner(System.in); // deklarasi class yang berfungsi untuk menginput program.
    public static boolean loop; // var untuk menyimpan status looping program. 
    public static int[] inputvar = new int[20]; // array dimana menyimpan hasil inputan pengguna.

    public static void header(){
        /* fungsi : Menampilkan header/kop untuk memperindah tampilan dan memperjelas maksud program.
        */
    }
    
    public static void padding(){
        /* fungsi : Memberikan pembatas antara header dan isi menu.
        */
    }

    public static void Menu(){
        /* fungsi : Menampilkan header, padding, dan isi menu,
           serta memanggil prosedur inputMenu
        */
    }

    public static void inputMenu(){
        /* fungsi : Prosedur untuk memanggil prosedur inputting, lalu menentukan pilihan berdasar opsi yang dipilih.
            Jika salah, maka akan menginput ulang pilihan.
        */
    }

    public static void inputting(int i, String A){
        /* fungsi : Prosedur untuk menginput pilihan menu yang berupa integer.
        */
    }

    public static String inputActivity(){
        /* fungsi : Prosedur untuk menginput pilihan aktivitas yang ingin dilakukan dalam game.
        */
    }

    public static void main(String[] args){
        /* fungsi : Main program dimana program dijalankan berdasar sequence pemanggilan fungsi dan class lain.
        */
    }
}