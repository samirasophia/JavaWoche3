package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streaming {
    public static void main(String[] args) {
        String meow = "meow";
        boolean hi = contains(meow);
        System.out.println(hi);
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(11);
        numList.add(12);
        numList.add(9);
        List<Integer> sum2 = numList.stream()
                .filter(n -> n%2==0)
                        .collect(Collectors.toList());
        System.out.println(sum2);

        List<Integer> sort = numList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sort);

        List<Integer> doubleNum = numList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubleNum);

      int sum3 = numList.stream()
              .reduce(0, Integer::sum);
        System.out.println(sum3);

        numList.stream()
                .forEach(n -> System.out.println(n));


    }
    public static boolean contains (String meow){
        return meow.contains("i");

    }
}
