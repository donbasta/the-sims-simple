import java.util.Scanner;


public class Driver{
    public static Scanner input = new Scanner(System.in);
    public static boolean loop;
    public static int[] inputvar = new int[20];

    public static void header(){

    }
    
    public static void padding(){
        int i;
        String S = "";
        for (i=0;i<100;i++) S+="-";
        System.out.printf("%n%s%n%s%n%n", S, S);
    }

    public static void Menu(){
        System.out.println("   MAIN MENU:");
        System.out.println("1. New Game");
        System.out.println("2. Keluar");
        inputMenu();
    }

    public static void inputMenu(){
        inputting(1, "memilih menu");
        switch(inputvar[i]){
            case 1:


                break;
            case 2:
                System.out.println("Goodbye sampai jumpa lain waktu!!");
                loop = false;
                break;
            default:
                break;
        }
    }

    public static void inputting(int i, String A){
        String s = "Masukan input untuk " + A + " : ";
        System.out.print(s);
        inputvar[i] = input.nextInt();
    }

    public static String inputActivity(){
        System.out.print("   MAIN MENU:");
        String s = input.nextLine();
        return s;
    }

    public static void main(String[] args){
        loop = true;
        Sims Game = new Sims();
        while(loop){
            menu();



            loop = Game....()
        }
    }
}