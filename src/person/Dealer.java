package person;

import card.Hand;

public class Dealer {

    Hand dHand;

    //最初に二枚引き、一枚目を公開する
    public void dInit(){
        dHand = new Hand();
        for(int i=0; i<2; i++){
            dHand.addCard();
            dHand.calcScore();
        }
        dHand.showDealerCard();
        System.out.println();
    }

    //17以上になるまで引く
    public String dHit(){
        System.out.println("ディーラーがカードを引きます。");
        System.out.println();
        while(true){
            if(dHand.getScore() > 16){
                return "StopHit";
            }else{
                dHand.addCard();
                dHand.calcScore();
                if(dHand.getScore() > 21){
                    return "Bust";
                }else{}
            }
        }
    }

    public void showDealerHand(){
        System.out.println("ディーラーの手札は");
        dHand.showAllHand();
        System.out.println("です。");
    }

    public  void showDealerScore(){
        dHand.calcScore();
        int score = dHand.getScore();
        System.out.println("ディーラーの合計点は" + score + "です。");
        System.out.println();
    }

    public int getDealerScore(){
        return dHand.getScore();
    }

}
