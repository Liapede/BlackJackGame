package card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    static Card card;

    //デッキを作成
    static ArrayList<Card> cardDeck = new ArrayList<Card>();
    int deckTotal = 52;

    public Deck() {
        for (int i = 0; i < deckTotal; i++) {
            card = new Card(i);
            cardDeck.add(card);
        }
    }

    //デッキをシャッフル
    public void shuffleDeck(){
        Collections.shuffle(cardDeck);
    }

    //デッキの一番上のカードをgetし除去する
    public static Card getCard(){
        card = cardDeck.get(0);
        cardDeck.remove(0);
        return card;
    }

}
