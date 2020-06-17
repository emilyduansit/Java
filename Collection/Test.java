import java.util.List;

public class Test {
     int sum(List<Integer> list){
         int sum = 0;
         mylabel:
         do{
            for(int number : list){
                sum += number;
                if(number == 3) break;
            }

         }while(sum < 10);
         return sum;
     }

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.sum(List.of(1,2,3,4)));
    }
}