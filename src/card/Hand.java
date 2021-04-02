package card;

import card.Card;
import card.Deck;

import java.util.ArrayList;

public class Hand {

    Card card;
    Deck deck;
    ArrayList<Card> ownHand = new ArrayList<Card>();
    int sizeOfHand = 0;
    int scoreOfHand = 0;

    //デッキから1枚引く
    public void addCard(){
        card = deck.getCard();
        ownHand.add(card);
        sizeOfHand++;
    }

    //プレイヤーが引いたカードを表示
    public void showPlayerCard(){
        card = ownHand.get(sizeOfHand - 1);
        System.out.println("あなたが引いたカードは" + card.cardSuit + "の" + card.cardRank + "です。");
    }

    //手札の点数を計算
    public void calcScore(){
        int sumOfPoint = 0;
        for(int i=0; i<sizeOfHand; i++){
            card = ownHand.get(i);
            sumOfPoint += card.cardPoint;
        }
        scoreOfHand = sumOfPoint;
    }

    //プレイヤーの点数を表示
    public void showPlayerScore(){
        System.out.println("あなたの現在の点数は" + scoreOfHand + "です。");
    }

    //点数のgetter
    public int getScore(){
        return scoreOfHand;
    }

    //バーストを確認
    /*public String checkBust(){
        if (scoreOfHand > 21){
            return "Bust";
        }else{
            return "notBust";
        }
    }*/

    //BJを確認

    //ディーラーの1枚目のカードを表示
    public void showDealerCard(){
        card = ownHand.get(sizeOfHand - 2);
        System.out.println("ディーラーの1枚目のカードは" + card.cardSuit + "の" + card.cardRank + "です。");
    }

    //手札をすべて表示
    public void showAllHand(){
        for(int i=0; i<sizeOfHand; i++){
            card = ownHand.get(i);
            System.out.println(card.cardSuit + "の" +card.cardRank);
        }
    }

}
