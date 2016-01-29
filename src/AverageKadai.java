
public class AverageKadai {
	public static void main(String[] args){
		double[] a = new double[]{3.0,2.0,1.0,2.0,1.0};

		double ave = calcAverage(a);
		System.out.println(ave);

	}

	public static double calcAverage(double[] n){
		double returning = 0;
		for(double r : n){
			returning += r;
		}

		return returning/n.length;
	}

}
