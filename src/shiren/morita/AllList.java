package shiren.morita;

class AllList {

	public static Execute[] getList(int value){
		Execute[] list = {new PrimeNumber(value), new FizzBuzz(value), new Tree(value)};
		return list;
	}
}
