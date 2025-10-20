package com.Learning.practiceJava.streams.Tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class stockPrice {

    // maximize revenue based on -

    // price[] = [2,3,5,1,2,5,6,7];
    // log[] = [0,0,0,1,1,0,1];
    // k = 4; (consecutive days)
    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(2, 3, 5, 1, 2, 5, 6, 9);
        int k = 4;
        int revenue = 0;
        for (int n = 0; n <= price.size() - k; n++) {
            int tempRevenue = 0;
            List<Integer> log = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0 );
            for (int j = n; j < n + k; j++) {
                log.set(j, 1);
            }

            System.out.println("log : " + log);
            // log.stream().forEach(x->System.out.println(x));

            for (int i = 0; i <= log.size() - 1; i++) {
                if (log.get(i) == 1) {
                    tempRevenue = tempRevenue + price.get(i);
                } else {
                    tempRevenue = tempRevenue - price.get(i);
                }
            }
            System.out.println("Temp Revenue : " + tempRevenue);
            revenue = tempRevenue > revenue ? tempRevenue : revenue;
            System.out.println("Revenue : " + revenue);
        }
        
    }
}
