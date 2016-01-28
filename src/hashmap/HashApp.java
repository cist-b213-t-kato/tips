package hashmap;

import java.util.HashMap;

public class HashApp {

	public static void main(String[] args){

		// 文字列やオブジェクトなどの「０から始まる数字」以外を
		// インデックスとして扱いたいとき、
		// つまり以下のようなことをしたいとき
		// array["りんご"] = "apple";
		// array["なし"] = "pear";
		// array["もも"] = "peach";
		// 連想配列という配列を使うとよい
		// 記法は以下のようになる

		// 連想配列のインデックスをkeyと呼び、値をvalueとよぶ
		// HashMapの場合、<key, value>の形で指定する
		// ここではkeyもvalueもStringとする
		HashMap<String, String> map = new HashMap<>();

		map.put("りんご", "apple");
		map.put("なし", "pear");
		map.put("もも", "peach");

		String input = "なし";
		String output = map.get(input);
		System.out.println(input + "は英語で" + output + "です");

//		for(String input2 : map.keySet()){
//			System.out.println(input2 + "は英語で" + map.get(input2) + "です");
//		}

	}
}
