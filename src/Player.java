public class Player {
    public int cardTotal;
    public boolean isHit;
    public Card [] cards;

    public Player() {
        cardTotal = 3;
        isHit = true;
        cards = new Card[2];
    }

    public void print() {
        System.out.println("The player has a card total of: " + cardTotal);
        for(int x=0; x< cards.length; x++){
            cards[x].print();
        }
        System.out.println("Player has Hit: " + isHit);
        System.out.println("The player has " + cards.length + " cards");
    }

}