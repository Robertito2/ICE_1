package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Robert Orazu May 30, 2023
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(14));
            card.setSuit(Card.SUITS[random.nextInt(3)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number 0 - 13");
        int input = keyboard.nextInt();
        for (int i = 0; i < 7; i++) {
            if(hand[i].getValue() == input){
                printInfo();
                break;      
            }
        }
        System.out.println("Program is ending..."); 
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Robert Orazu May 2023
     */
    private static void printInfo() {
        //  I'm done! now   
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Robert, but you can call me Tito, Bob or Emerie");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get an AWS certification");
        System.out.println("-- Visit new places");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Praying");
        System.out.println("-- Money");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing soccer");

        System.out.println("I am from Nigeria");
    }

}
