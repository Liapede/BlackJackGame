package game;

import card.Deck;
import com.sun.source.tree.IfTree;
import person.Dealer;
import person.Player;

public class Game {

    Deck deck;
    Player player;
    Dealer dealer;

    public void startGame(){
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
        deck.shuffleDeck();
    }

    public String oneGame(){
        player.pInit();
        dealer.dInit();

        if(player.askHit().equals("Bust")){
            System.out.println("バーストしました。あなたの負けです。");
            System.out.println();
            return "Lose";
        }else{}

        if(dealer.dHit().equals("Bust")){
            dealer.showDealerHand();
            dealer.showDealerScore();
            System.out.println("ディーラーがバーストしました。あなたの勝ちです。");
            System.out.println();
            return "Win";
        }else{
            System.out.println("ディーラーがカードを引き終わりました。");
        }


        dealer.showDealerHand();
        dealer.showDealerScore();
        player.showPlayerScore();

        if (player.getPlayerScore() > dealer.getDealerScore()){
            System.out.println("あなたの勝ちです。");
            System.out.println();
            return "Win";
        }else if (player.getPlayerScore() < dealer.getDealerScore()){
            System.out.println("あなたの負けです。");
            System.out.println();
            return "Lose";
        }else{
            System.out.println("引き分けです。");
            System.out.println();
            return "Draw";
        }
    }

    public String endGame(int tipOfHave){
        if(tipOfHave > 99){
            return "おめでとうございます！ゲームクリアです！";
        }else if(tipOfHave < 1){
            return "残念…ゲームオーバーです。";
        }else{
            return "このメッセージが見られるのはおかしいよ。";
        }
    }

}
