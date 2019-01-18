/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *A class to create Card
 * each card has suit and value
 * @author wenji
 */
public class Card {
        private String suit;
        // Hearts, Spades, diamonds, clubs
        
        private int value;

        public Card (String givenSuit, int givenValue)
        {
                suit=givenSuit;
                value= givenValue;
        }
        
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Spades")||suit.equals("Diamonds")||suit.equals("Clubs")){
            this.suit = suit;}
        else{
            System.out.println("Not valid Suit");
        }
    }

    public int getValue() {
        if(value<1 || value>13){
        return value;}
        else{
            System.out.println("not aviliable values");
        }
    }

    public void setValue(int value) {
        this.value = value;
    }
        
        
        
}
