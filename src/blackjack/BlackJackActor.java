package blackjack;

import java.util.ArrayList;
import java.util.List;

abstract class BlackJackActor{
    protected List<Integer> cards = new ArrayList<>();
    abstract String getName();

    public BlackJackActor(){
    	//まずは2枚引く というルール
        hits();
        hits();
    }

    public void shows(boolean visible){
        System.out.print(getName() + ": ");
        String card = "";
        for(int i=0; i<cards.size(); i++){
            card = cards.get(i).toString();
            if(card.equals("1")){
                card = "A";
            }else if(card.equals("11")){
                card = "J";
            }else if(card.equals("12")){
                card = "Q";
            }else if(card.equals("13")){
                card = "K";
            }
            if(i==cards.size()-1 && visible==false){
                System.out.print("*");
            }else{
                System.out.print(card+" ");
            }
        }
        if(visible==true){
            System.out.println("["+getTotal()+"]");
        }else{
            System.out.println();
        }
    }

    public void shows(){
        shows(true);
    }

    public void hits(){
        cards.add((int)(Math.random()*13)+1);
    }

    public Integer getTotal(){
        Integer sum = 0;
        int count=0;
        for(Integer n : cards){
            if(n==1){
                count++;
            }else if(n>10){
                sum+=10;
            }else{
                sum+=n;
            }
        }

        while(count-->0){
            sum += (sum<=10)?11:1;  //sum += (sum+11<=21)?11:1;
        }

        return sum;
    }


}