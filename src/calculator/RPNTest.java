package calculator;

import java.util.Arrays;

public class RPNTest {
	
	public static void main(String[] args) {
		double result = RPN.rpncalc(Arrays.asList("5 2 - 3 *".split(" ")));
		
		System.out.println(result);
		
	}

//	@Test
//	public void 計算テスト(){
//
//		assert(RPN.calc("1 + 2").doubleValue()-3.0>0.01);
//		assert(RPN.calc("1 + 2 * 3").doubleValue()-7.0>0.01);
//		assert(RPN.calc("( 1 + 2 ) * 3").doubleValue()-9.0>0.01);
//		assert(RPN.calc("( 1 + 2 ) ^ 3").doubleValue()-27.0>0.01);
//
//	}

}