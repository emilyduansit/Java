package test6;

import java.util.List;

public class Test {
    void method(long...arg)///3
    {
        System.out.println("Method A");
    }

    void method(float arg)   ////1
    {
        System.out.println("Method B");
    }

    void method(Integer arg) ////2
    {
        System.out.println("Method C");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int sum = test.sumup(List.of(1,2,3,4,5));
        System.out.println(sum);

        System.out.println(test.select(1));

        int number = 100;
        test.method(number);


    }

    int sumup(List<Integer> numbers){
        int sum = 0;
        mylabel:
        do{
            for(int number : numbers){
                if(number == 3) break mylabel; //加上label ， 终止do循环
                sum +=number;
            }
        }while(sum < 15);
        return sum;
    }

    String select(int number){
        String output;
        switch(number){
            case 1:
            default: 
            case 2:
              output = "positive";
        }
        return output;
    }
}