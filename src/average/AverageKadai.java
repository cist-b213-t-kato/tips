package average;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class AverageKadai {
	public static void main(String[] args){
		List<Double> a = Arrays.asList();//Arrays.asList(3.0, 2.0, 1.0, 2.0, 1.0);

		double ave = calcAverage(a);
		System.out.println(ave);
	}

	public static double calcAverage(List<Double> list){
		double returning = 0;
		for(double n : list){
			returning += n;
		}
		return returning/list.size();
	}

	public static class AverageKadaiTest{
		@Test
		public void test(){
			double ave = AverageKadai.calcAverage(Arrays.asList());
			//NaNチェック
			assertTrue(Double.isNaN(ave));
		}

		@Test
		public void test2(){
			double ave = AverageKadai.calcAverage(Arrays.asList(1.0, 2.0));
			assertTrue(Double.compare(ave, 1.5)==0);
		}
	}

}

