public class BasicGameApp {
    public Player p;
    public Dealer d;


    public Card[] deck;


    public static void main(String[] args) {
        System.out.println("Hello world!");
        new BasicGameApp();
    }

    public BasicGameApp() {
        System.out.println("Welcome to Andrew's Blackjack Game");

        deck = new Card[52];
        int counter = 0;
        for (int all=0; all<4; all++) {
            for (int x = 0; x < 13; x++) {
                Card C = new Card(x + 1, all);
//                C.print();
                deck[counter] = C;
counter++;




            }
        }
        System.out.println("***********");
//printDeck();
shuffle();
printDeck();
System.out.println("player's info");
        p = new Player();
        d = new Dealer();
        deal();
        p.print();
        d.print();

    }

    public void printDeck() {
        for (int x = 0; x < deck.length; x++) {
            System.out.println(x);
            deck[x].print();
        }
    }

    public void deal (){


        p.cards[0]=deck[0];
        p.cards[1]= deck[1];




        d.cards[0]=deck[2];
        d.cards[1]= deck[3];


    }
    public void shuffle(){
        System.out.println("shuffling");
for(int a = 0; a<deck.length; a++){
    int random = (int) (Math.random()*52);
Card sean = deck[a];
deck[a]=deck[random];
deck[random] = sean;



}


    }

    }
//homework: finish the methond with no dups