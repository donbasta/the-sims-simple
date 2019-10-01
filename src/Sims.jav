import java.io.*;
import java.lang.*;
import java.util.*;

public class Sims {
    /* Class ini berisi konstruktor tipe data Sims serta metode-metode lain */
}

    Sims() {
        /* Konstruktor tipe data Sims */
        /* Inisialisasi atribut disesuaikan dengan spesifikasi,
            yakni Hygiene bernilai 0, energy bernilai 10, fun 
            bernilai 10 */
        this.hygiene = 0;
        this.energy = 10;
        this.fun = 0;
    }

    public void beraksi(String aksi){
        /* fungsi : Menerima string 'aksi' sebagai parameter dan menjalankan aksi sesuai
            dengan parameter tersebut
        */
    }

    public void printStatus(){
        /* fungsi : Prosedur untuk mencetak nilai atribut karakter 
        */
    }
       

    public boolean finishStatus(){
        /* fungsi : Menghasilkan kondisi yang menentukan apakah permainan sudah selesai
            atau belum. Kondisi permainan selesai apabila nilai seluruh atribut adalah 
            15 atau nilai seluruh atribut adalah 0.
        */
    }

    public boolean isMenang(){
        /* fungsi : Menghasilkan kondisi menang game, yakni seluruh atribut bernilai 15
        */
    }

    public boolean isKalah(){
        /* fungsi : Menghasilkan kondisi kalah game, yakni seluruh atribut bernilai 0
        */
    }

}