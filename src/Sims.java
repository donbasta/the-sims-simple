import java.io.*;
import java.lang.*;
import java.util.*;

public class Sims {

    int hygiene;
    int energy;
    int fun;

    Sims() {
        this.hygiene = 0;
        this.energy = 10;
        this.fun = 0;
    }

    public void beraksi(String aksi){

        switch(aksi){
            case "Tidur Siang" :
                if(this.energy<=5){
                    this.energy += 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Tidur Malam" :
                if(this.energy==0){
                    this.energy += 15;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Makan Hamburger" : 
                if(this.energy<=10){
                    this.energy += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Makan Pizza" :
                if(this.energy<=5){
                    this.energy += 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Makan Steak and Beans" :
                if(this.energy==0){
                    this.energy += 15;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Minum Air" :
                if(this.hygiene>=5){
                    this.hygiene -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Minum Kopi" :
                if(this.energy<=10 && this.hygiene>=10){
                    this.energy += 5;
                    this.hygiene -= 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Minum Jus" :
                if(this.energy<=5 && this.hygiene>=5){
                    this.energy += 10;
                    this.hygiene -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Buang Air Kecil" :
                if(this.hygiene<=10){
                    this.hygiene += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Buang Air Besar" :
                if(this.hygiene<=5 && this.energy>=5){
                    this.hygiene += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Bersosialisasi ke Kafe" :
                if(this.fun==0 && this.energy>=10 && this.hygiene>=5){
                    this.fun += 15;
                    this.energy -= 10;
                    this.hygiene -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Bermain Media Sosial" :
                if(this.fun<=5 && this.energy>=10){
                    this.fun += 10;
                    this.energy -= 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Bermain Komputer" :
                if(this.fun==0 && this.energy>=10){
                    this.fun += 15;
                    this.energy -= 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Mandi" :
                if (this.hygiene==0 && this.energy>=5){
                    this.hygiene += 15;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Cuci Tangan" :
                if (this.hygiene <= 10){
                    this.hygiene += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Mendengarkan Musik di Radio" :
                if(this.fun<=5 && this.energy>=5){
                    this.fun += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Membaca Koran" :
                if(this.fun <= 10 && this.energy>= 5){
                    this.fun += 5;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;

            case "Membaca Novel" :
                if(this.fun <= 5 && this.energy >= 5){
                    this.fun += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }
                break;
            
            case "Cek Status":
                this.printStatus();
                break;

            default:
                System.out.println("Aksi tidak valid");
                break;
        }

    }

    public void printStatus(){

        System.out.printf("Hygiene = %d%n",  this.hygiene);
        System.out.printf("Energy = %d%n",  this.energy);
        System.out.printf("Fun = %d%n",  this.fun);

    }

    public boolean finishStatus(){
        return !((this.fun==0 && this.energy==0 && this.hygiene==0) || (this.fun==15 && this.energy==15 && this.hygiene==15));
    }

    public boolean isMenang(){
        return this.fun==15 && this.energy==15 && this.hygiene==15;
    }

    public boolean isKalah(){
        return this.fun==0 && this.energy==0 && this.hygiene==0;
    }
}