package math;

/**
 * {@link Math#ceil(double)} 切り上げを試す
 * @author tkato213
 *
 */
public class CeilApp {

	public static void main(String[] args) {

		long defaultMinimumGenreQuestionNumber = 6;
		long questionNumber = 4;

		long n = (long)Math.ceil((double)defaultMinimumGenreQuestionNumber/questionNumber);

		System.out.println(n);

	}

}
