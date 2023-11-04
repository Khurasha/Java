/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class Cardtricks {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random kk = new Random();
        Scanner komal = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
            {
            Card c = new Card();
            c.setValue(kk.nextInt(13)+1);
            c.setSuit(Card.SUITS[kk.nextInt(4)]);
            magicHand[i] = c;
            }
            System.out.println("Enter the card nummber:");
            int cardnumber = komal.nextInt();
            System.out.println("Enter the suits:");
            String Suits = komal.next();
            
            boolean value = false;
            
            for(Card CardGames : magicHand){
                if(CardGames.getValue() == cardnumber && CardGames.getSuit().equalsIgnoreCase(Suits)){
                    value = true;
                    break;
                }
        }
        
            if(value){
                System.out.println("The card number and suit is present in the array:");
            }else{
                System.out.println("The card number and suit is not present in the array:");
            }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
