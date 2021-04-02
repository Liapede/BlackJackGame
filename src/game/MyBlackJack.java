package game;

public class MyBlackJack {

    static Game game;
    static Tip tip;

    public static void main(String[] args){

        System.out.println("ブラックジャックを始めます。");
        System.out.println();

        game = new Game();
        tip = new Tip();
        tip.tipInit();
        tip.showTip();

        do {
            game.startGame();
            tip.tipBet();
            tip.tipCalc(game.oneGame());
            tip.showTip();
        } while(tip.getTipOfHave() < 100 && tip.getTipOfHave() > 0);

        System.out.println(game.endGame(tip.getTipOfHave()));

    }
}
