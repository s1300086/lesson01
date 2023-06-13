public class Dicegame{


    public Dicegame(  ){

    }

    public static void main(String args[]){

        int x;
        int y;
        int sum;
	System.out.println("Rolling dice...");
	
	x = (int)Math.ceil(Math.random()*6);
        y = (int)Math.ceil(Math.random()*6);
	
        System.out.println("Die 1: " + x);
        System.out.println("Die 2: " + y);
	
        sum = x + y;
	
        System.out.println("Total value: " + sum);

	if ( sum > 7 )
	    System.out.println("You won");
	else
	    System.out.println("You lost");
    }
}
