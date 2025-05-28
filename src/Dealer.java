public class Dealer {
    public int cardTotal;
    public boolean over17;
    public Card [] cards;

    public Dealer() {
        cardTotal = 3;
        over17 = false;
        cards = new Card[2];
    }

    public void print() {
        System.out.println("Dealer has a card total of: " + cardTotal);
        for(int x=0; x< cards.length; x++){
            cards[x].print();
        }
        System.out.println("Dealer is over 17?: " + over17);
        System.out.println("Dealer has " + cards.length + " cards");
    }
}