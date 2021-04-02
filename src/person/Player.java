package person;

import card.Deck;
import card.Hand;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Player {

    Hand pHand;

    //最初に二枚引き、表示
    public void pInit(){
        pHand = new Hand();

        for(int i=0; i<2; i++){
            pHand.addCard();
            pHand.showPlayerCard();
        }

        pHand.calcScore();
        pHand.showPlayerScore();
        System.out.println();
    }

    //ヒットをやめるかバーストするまで引く
    public String askHit(){
        while(true){
            System.out.println("ヒットしますか？するならy、しないならnを入力してください。");
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println();

            if (str.equals("y")){
                pHand.addCard();
                pHand.showPlayerCard();
                pHand.calcScore();
                pHand.showPlayerScore();
                if (pHand.getScore() > 21){
                    return "Bust";
                }else{}

            }else if (str.equals("n")){
                return "StopHit";

            }else{
                System.out.println("入力エラーです。半角でyかnを入力してください。");
            }
        }
    }

    public void showPlayerHand(){
        System.out.println("あなたの手札は");
        pHand.showAllHand();
        System.out.println("です。");
        System.out.println();
    }

    public  void showPlayerScore(){
        pHand.calcScore();
        int score = pHand.getScore();
        System.out.println("あなたの合計点は" + score + "です。");
        System.out.println();
    }

    public int getPlayerScore(){
        return pHand.getScore();
    }


}
