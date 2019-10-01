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

            case "Tidur Malam" :
                if(this.energy==0){
                    this.energy += 15;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Makan Hamburger" : 
                if(this.energy<=10){
                    this.energy += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Makan Pizza" :
                if(this.energy<=5){
                    this.energy += 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Makan Steak and Beans" :
                if(this.energy==0){
                    this.energy += 15;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Minum Air" :
                if(this.energy>=5){
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Minum Kopi" :
                if(this.energy<=10 && this.hygiene>=10){
                    this.energy += 5;
                    this.hygiene -= 10;
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Minum Jus" :
                if(this.energy<=5 && this.hygiene>=5){
                    this.energy += 10;
                    this.hygiene -= 5;
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Buang Air Kecil" :
                if(this.hygiene<=10){
                    this.hygiene += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Buang Air Besar" :
                if(this.hygiene<=5 && this.energy>=5){
                    this.hygiene += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Bersosialisasi ke Kafe" :
                if(this.fun==0 && this.energy>=10 && this.hygiene>=5){
                    this.fun += 15;
                    this.energy -= 10;
                    this.hygiene -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Bermain Media Sosial" :
                if(this.fun<=5 && this.energy>=10){
                    this.fun += 10;
                    this.energy -= 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Bermain Komputer" :
                if(this.fun==0 && this.energy>=10){
                    this.fun += 15;
                    this.energy -= 10;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Mandi" :
                if (this.hygiene==0 && this.energy>=5){
                    this.hygiene += 15;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Cuci Tangan" :
                if (this.hygiene <= 10){
                    this.hygiene += 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Mendengarkan Musik di Radio" :
                if(this.fun<=5 && this.energy>=5){
                    this.fun += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Membaca Koran" :
                if(this.fun <= 10 && this.energy>= 5){
                    this.fun += 5;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            case "Membaca Novel" :
                if(this.fun <= 5 && this.energy >= 5){
                    this.fun += 10;
                    this.energy -= 5;
                    this.printStatus();
                } else {
                    System.out.println("Aksi tidak valid");
                }

            default:
                System.out.println("Aksi tidak valid");
        }

    }

    public void printStatus(){

        System.out.printf("Hygiene = %d\n",  this.hygiene);
        System.out.printf("Energy = %d\n",  this.energy);
        System.out.printf("Fun = %d\n",  this.fun);

    }



}