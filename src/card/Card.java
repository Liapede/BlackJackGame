package card;

public class Card {

    //カードの要素
    String cardSuit;
    String cardRank;
    int cardPoint;

    //カードの要素の内容
    String[] suit = {"スペード", "ハート", "ダイヤ", "クラブ"};
    String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    int[] point = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    int cardNum;//0-51

    //カード
    Card(int i){
        cardNum = i;
        cardSuit = suit[cardNum/13];
        cardRank = rank[cardNum%13];
        cardPoint = point[cardNum%13];
    }

}
