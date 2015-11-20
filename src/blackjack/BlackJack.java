package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class You extends BlackJackActor{
    @Override
    public String getName(){
        return "you";
    }
}

class Dealer extends BlackJackActor {
    @Override
    public String getName(){
        return "dealer";
    }

    @Override
    public void shows(){
        super.shows(false);
    }

}

public class BlackJack {

    public static void main(String[] args) throws IOException{
        new BlackJack();
    }

    public BlackJack() throws IOException{
        BlackJackActor you = new You();
        BlackJackActor dealer = new Dealer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";

        GOTO:
        while(true){
            if(you.getTotal()<21){
                System.out.println();
                dealer.shows();
                you.shows();
                System.out.print("h:ヒット  s:スタンド  >> ");
                inputStr = br.readLine();
            }else if(you.getTotal()==21 && dealer.getTotal()==21){
                System.out.println();
                dealer.shows(true);
                you.shows();
                System.out.println("ブラックジャック");
                System.out.println("引き分け");
                return;
            }else if(you.getTotal()==21){
                System.out.println();
                dealer.shows(true);
                you.shows();
                System.out.println("ブラックジャック");
                System.out.println("あなたの勝ちです！");
                return;
            }else if(you.getTotal()>21){
                System.out.println();
                dealer.shows(true);
                you.shows();
                System.out.println("バースト");
                System.out.println("あなたの負けです！");
                return;
            }

            if(inputStr.equals("h")){
                you.hits();
            }else if(inputStr.equals("s")){
                break;
            }else{
//                throw new IllegalArgumentException("不正な値");
                System.out.println("不正な値");
                continue;
            }
        }

        while(true){
            System.out.println();
            dealer.shows(true);
            you.shows();

            if(dealer.getTotal()>21){
                System.out.println("あなたの勝ちです！");
                return;
            }else if(dealer.getTotal()>you.getTotal()){
                System.out.println("あなたの負けです！");
                return;
            }else if(dealer.getTotal()<you.getTotal()){
                System.out.println("ディーラー：ヒット");
                dealer.hits();
            }else if(dealer.getTotal().equals(you.getTotal())){
                System.out.println("引き分け");
                return;
            }


        }

    }


}
