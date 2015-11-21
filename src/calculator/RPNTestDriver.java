package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class RPNTestDriver {

	/**
	 * テストドライバ
	 * */
	public static void main(String[] args) throws IOException, Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String ori = "( 10 + 20 ) * 30 + 35 / 40";
//        String ori = "2.1 * ( 24 + 20 ) + 2 / 97";
        String ori = "33 * -4";

        System.out.println(RPN.calc(new ArrayList<>(Arrays.asList(ori.split(" ")))));

    }

}
