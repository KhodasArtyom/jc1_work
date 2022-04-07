package my.ollections;

import java.util.ArrayList;
import java.util.List;

public class AverageCounter {

    double avarage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Integer number : numbers) {

            if (number == null) {
                continue;
            }
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    int sumSimpleNum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            if (isSimpleNum(number)) {
                sum += number;
            }
        }
        return sum;
    }

    private boolean isSimpleNum(int number) {

        for(int i = 2; i <=Math.round(Math.sqrt(number));i ++) {
            if(number % i ==0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test1.add(2);

        System.out.println(new AverageCounter().avarage(test1));
        System.out.println(new AverageCounter().avarage(null));


        List<Integer> test2 = List.of(1, 2, 3, 4, 5,7,8,9,);
        System.out.println(new AverageCounter().sumSimpleNum(test2));
    }

}
