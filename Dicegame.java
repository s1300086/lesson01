import java.util.Scanner;

public class Dicegame{


    public Dicegame(  ){

    }

    public static void main(String args[]){

        int x;
        int y;
        int sum;


	
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("> ");
        String input_text = sc.nextLine( );
        System.out.println("Hello, " + input_text + "!");


	
	System.out.println("Rolling dice...");
	
	x = (int)Math.ceil(Math.random()*6);
        y = (int)Math.ceil(Math.random()*6);
	
        System.out.println("Die 1: " + x);
        System.out.println("Die 2: " + y);
	
        sum = x + y;
	
        System.out.println("Total value: " + sum);
    }
}
