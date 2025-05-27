package UpperBoundedWildcards;

import java.util.List;

public class N {


    public static void printNumber(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

}


class Dipto {
    public static void main(String[] args) {

        List<Integer> intlist = List.of(1, 2, 3);


        List<Double> doublist = List.of(1.2, 1.3, 1.4);


        System.out.println("Integer List: " + intlist);
        System.out.println("Double List: " + doublist);


        System.out.println("Printing using upper bounded wildcard method:");
        N.printNumber(intlist);
        N.printNumber(doublist);
    }
}
