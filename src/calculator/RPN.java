package calculator;

import java.util.List;
import java.util.Stack;

/**
 * ReversePolishNotation
 * 逆ポーランド記法による数式の計算
 **/
public class RPN {

    public static double rpncalc(List<String> o){

        Stack<Double> stack = new Stack<>();

        for(int i=0; i<o.size(); i++){
        	String t = o.get(i);
            if(NumberUtils.isNumber(t)){
                stack.push(Double.parseDouble(t));
            }else{
                double b = stack.pop();
                double a = stack.pop();
                if(t.equals("+")){
                    stack.push(a + b);
                }else if(t.equals("-")){
                    stack.push(a - b);
                }else if(t.equals("*")){
                    stack.push(a * b);
                }else if(t.equals("/")){
                    stack.push(a / b);
                }
            }
        };

        return stack.peek();
    }

}