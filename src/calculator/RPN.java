package calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ReversePolishNotation
 * 逆ポーランド記法による数式の計算
 **/
public class RPN {


	public static BigDecimal calc(List<String> ori){
        Node<List<String>> node = new Node<>();
        node.data = ori;
        RPN.transform(node);
        List<String> list = new ArrayList<>();
        list.add(RPN.traverse(node, list));
        return RPN.rpncalc(list);
	}

    /**
     *  逆ポーランド法のフォーマットになっているString[]から計算する
     **/
//    public static Double rpncalc(String[] o){
//    	return rpncalc(new ArrayList<>(Arrays.asList(o)));
//    }

    public static BigDecimal rpncalc(List<String> o){

        Stack<BigDecimal> o_stack = new Stack<>();

        for(String t : o){
            if(NumberUtils.isNumber(t)){
//                Double r = Double.valueOf(t);
                o_stack.push(new BigDecimal(t));
            }else{
                BigDecimal b = o_stack.pop();
                BigDecimal a = o_stack.pop();
                if(t.equals("+")){
                    o_stack.push(a.add(b));
                }else if(t.equals("-")){
                    o_stack.push(a.subtract(b));
                }else if(t.equals("*")){
                    o_stack.push(a.multiply(b));
                }else if(t.equals("/")){
                    o_stack.push(a.divide(b, 10, BigDecimal.ROUND_HALF_UP));
                }else if("^".equals(t)){
                	o_stack.push(a.pow(Integer.valueOf(b.intValue())));
                }
            }
        }
        return o_stack.pop();
    }

    /**
     * 演算子の優先順の比較 o1がo2より優先順が高い場合1以上が返る
     */
    protected static int opecomp(String o1, String o2){
        String[] o_pri = {"*/", "+-"};
        int n1 = 0, n2 = 0;

        for(n1=0; n1<o_pri.length; n1++){
            if(o_pri[n1].indexOf(o1)!=-1){
                break;
            }
        }
        for(n2=0; n2<o_pri.length; n2++){
            if(o_pri[n2].indexOf(o2)!=-1){
                break;
            }
        }

        return n2-n1;
    }

    public static void transform( Node<List<String>> node ){
    	int lowPriorityIndex = -1;

    	if("(".equals(node.data.get(0))
    			&& ")".equals(node.data.get(node.data.size()-1))){
    		node.data.remove(0);
    		node.data.remove(node.data.size()-1);
    	}

    	for(int i=node.data.size()-1; i>=0; i--){
    		String o = node.data.get(i);

    		if(")".equals(o)){
    			while(!"(".equals(node.data.get(i))){
    				i--;
    			}
    		}else if(!NumberUtils.isNumber(o)){
    			if(lowPriorityIndex == -1
    					|| checkPriority(o)<checkPriority(node.data.get(lowPriorityIndex))){
        			lowPriorityIndex = i;
        			continue;
        		}
    			if(checkPriority(o)>checkPriority(node.data.get(lowPriorityIndex))
    					|| ")".equals(o)){
    				break;
    			}
    		}
    	}

    	if(lowPriorityIndex==-1){
    		return;
    	}

    	node.left = new Node<>(new ArrayList<>());
    	node.right = new Node<>(new ArrayList<>());
		for(int i=0; i<lowPriorityIndex; i++){
			node.left.data.add(node.data.get(i));
		}
		transform(node.left);
		for(int i=lowPriorityIndex+1; i<node.data.size(); i++){
			node.right.data.add(node.data.get(i));
		}
		transform(node.right);

		String str = node.data.get(lowPriorityIndex);
		node.data = new ArrayList<>();
		node.data.add(str);

    }

    public static String traverse(Node<List<String>> node, List<String> list){

    	if(node.left!=null){
        	list.add(traverse(node.left, list));
    	}
    	if(node.right!=null){
    		list.add(traverse(node.right, list));
    	}

    	return node.data.get(0);

    }

    public static int checkPriority(String str){
    	switch(str){
    	case "=":
    		return 1;
    	case "+":
		case "-":
    		return 2;
    	case "*":
		case "/":
    		return 3;
		case "^":
			return 4;
		default:
			throw new RuntimeException("謎じゃ。");
    	}
    }


    /**
     *   標準の数式 => 逆ポーランド記法 の変換をする
     */
    public static String[] transform(List<String> list) throws Exception{
        ArrayList<String> list2 = new ArrayList<String>();

        Stack<String> o_stack = new Stack<>();

        while(!list.isEmpty()){
            String s = list.remove(0);

            if("+-*/".indexOf(s)!=-1){//sが演算子であるとき
                if(!o_stack.isEmpty()){
                    if(OperatorUtils.comp(s, o_stack.peek()) < 0){
                        list2.add(o_stack.pop());
                    }
                }
                o_stack.push(s);
            }else if(s.equals("(")){
                o_stack.push(s);
            }else if(s.equals(")")){
                String s2 = "";
                while(!o_stack.isEmpty()){
                    s2 = o_stack.pop();
                    if(s2.equals("(")){
                        break;
                    }
                    list2.add(s2);
                }
            }else if(NumberUtils.isNumber(s)){  //数字の場合
                list2.add(s);
            }else{
                throw new Exception("式の不整合");
            }
        }
        while(!o_stack.isEmpty()){
            list2.add(o_stack.pop());
        }

        String[] result = (String[])list2.toArray(new String[]{});
        return result;
    }
}