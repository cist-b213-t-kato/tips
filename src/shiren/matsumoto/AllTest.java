package shiren.matsumoto;

class Alltest{
    public static Execute[] getTest(int value){
        Execute[] test ={new FizzBuzz(value),new Tree(value),new Prime_Number(value)};
        return test;
    }
}


