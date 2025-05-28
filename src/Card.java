public class Card {
    public String number; //ex ace,2,3
    public String suit;
    public boolean isEleven; //for aces
    public int value; // ex 11,2,3





    public Card (int pnumber, int psuit) {
        number = "Five";
        suit = "Hearts";
        isEleven = false;
        value = 5;
       if(psuit==0) {
            suit="clubs";

        }
       if(psuit==1) {
suit="hearts";

       }
        if(psuit==2) {
            suit="spades";

        }
        if(psuit==3) {
            suit=" diamonds";

        }

        if(pnumber==0) {
            number = "Ace";
            value = 11;
        }

        if(pnumber==1) {
            number = "Two";
            value = 2;
        }

        if(pnumber==2) {
            number = "Three";
            value = 3;
        }
        if(pnumber==3) {
            number = "Four";
            value = 4;
        }
        if(pnumber==4) {
            number = "Five";
            value = 5;
        }
        if(pnumber==5) {
            number = "Six";
            value = 6;
        }
        if(pnumber==6) {
            number = "Seven";
            value = 7;
        }
        if(pnumber==7) {
            number = "Eight";
            value = 8;
        }
        if(pnumber==8) {
            number = "Nine";
            value = 9;
        }
        if(pnumber==9) {
            number = "Ten";
            value = 10;
        }
        if(pnumber==10) {
            number = "Queen";
            value = 10;
        }
        if(pnumber==11) {
            number = "Jack";
            value = 10;
        }
        if(pnumber==12) {
            number = "King";
            value = 10;
        }



    }
        public void print(){
            System.out.println("This card is a " +  number + " of " + suit+ ". its worth "+ value);


        }

    // make construct for Card
    // set varibels above to fav card
}
// add print deck
// homework make constructor and print for dealer
