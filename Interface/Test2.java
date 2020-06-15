public class Test2{
    Number add(Number add1, Number add2){
        System.out.println("Number");
        return (int)add1+(int)add2;
    }

    long add(long add1,long add2){
        System.out.println("primitive");
        return add1+add2;
    }

    public static void main(String[] args) {
        Test test = new Test();
      // Number sum = test.add(Integer.valueOf("1"), Integer.valueOf("2"));
      // System.out.println(test.add(1, 2));
    }

}