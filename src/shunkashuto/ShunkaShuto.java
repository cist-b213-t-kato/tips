package shunkashuto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShunkaShuto {
	public static void main(String[] args) throws NumberFormatException, IOException{

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String[] seasonArray = {"春","夏","秋","冬"};


        System.out.print("何月？ >> ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(n+"月の季節は "+seasonArray[((n+9)%12)/3]+" です");

	}

}