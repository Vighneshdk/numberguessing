import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String args[]) {  
        Scanner sc=new Scanner(System.in); // no spaces
        Random r = new Random(); // different variable name
        int num = r.nextInt(100)+1; 
        int tries=0;
        int g=0;
        int max=5; // only 5 chances lol

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100. You have " + max + " tries.");

        while(g!=num && tries<max){
            System.out.print("Enter guess : ");
            g=sc.nextInt();
            tries++;

            if(g==num){
                System.out.println("Yesss!! you got it in "+tries+" tries");
            }
            else if(Math.abs(g-num)<=10){
                System.out.println("You're close!!");
            }
            else if(g<num){
                System.out.println("too low");
            }
            else{
                System.out.println("too high");
            }
        }

        if(tries==max && g!=num){
            System.out.println("Game Over :( the number was "+num);
        }
    }
}

