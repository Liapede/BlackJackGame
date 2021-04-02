package game;

import java.util.Scanner;

public class Tip {

    //
    int tipOfHave;
    int tipOfBet;

    //プレイヤーにチップを渡す
    void tipInit(){
        tipOfHave = 10;
    }

    //チップを賭ける
    void tipBet(){
        while(true) {
            System.out.println("賭けるチップの枚数を入力してください。");
            Scanner tipScan = new Scanner(System.in);
            String tipStr = tipScan.next();
            try {
                tipOfBet = Integer.parseInt(tipStr);
                if(tipOfBet > tipOfHave){
                    System.out.println("入力エラーです。あなたが現在賭けることができるチップの枚数は" + tipOfHave + "枚までです。");
                }else if(tipOfBet < 1){
                    System.out.println("入力エラーです。1より大きい整数を入力してください。");
                }else{
                    break;
                }
            }catch (NumberFormatException nfex){
                System.out.println("入力エラーです。半角数字で入力してください。");
            }
        }
        System.out.println(tipOfBet + "枚賭けました");
        System.out.println();
    }

    //勝敗と掛け金によってチップを増減させる
    void tipCalc(String winOrLose){
        if(winOrLose.equals("Win")){
            tipOfHave += tipOfBet;
        }else if(winOrLose.equals("Lose")){
            tipOfHave -=tipOfBet;
        }else{}
    }

    //チップの数を表示
    void showTip(){
        System.out.println("あなたが現在持っているチップは" + tipOfHave + "枚です。");
    }

    //チップのgetter
    int getTipOfHave(){
        return tipOfHave;
    }

}
