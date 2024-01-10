package edu.estu;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class App {

    /**
     * A shocking quiz.
     */
    public static void main(String[] args) {
        System.out.println("What is the minimum of the following doubles? Can you guess!");
        List<Double> doubleList = List.of(Double.NaN, 1D, 2D, 3D, -1D, -2D);
        System.out.println("The minimum element - as returned by Collections.min() method - is " + Collections.min(doubleList));
        System.out.println("Did you correctly anticipate the actual result? Did you find the actual result awkward or unexpected?");
    }

    /**
     * For a certain user input(s) the function/method enters an infinite loop.
     * This is an intentional bug, do not fix it.
     * Instead, write a *failing* junit test case to demonstrate the bug.
     *
     * @param input a double value
     */
    public static void infiniteLoop(double input) {
        if (Double.isInfinite(input)) {
            for (; ; ) ; // this is dangerous
        }
    }

   

    /* **********************************************
     ******* ALL TESTS MUST PASS IN THE END *********
     **** WRITE YOUR 4 static void METHODS HERE: ****
     ************************************************
     */

    
    static void incrementCountMapWildcard(Map<Enum<?>, Integer> map, Enum<?> key) {
        map.merge(key, 1, Integer::sum);
    }

   
    static <E extends Enum<E>> void incrementCountMapGenerics(Map<E, Integer> map, E key) {
        map.merge(key, 1, Integer::sum);
    }

  
    static void incrementCountMapWildcard(Map<? extends Enum<?>, Integer> map, Enum<?> key) {
        map.merge(key, 1, Integer::sum);
    }

   
    static <E extends Enum<E>> void incrementCountMapGenerics(Map<E, Integer> map, E key) {
        map.merge(key, 1, Integer::sum);
    }

    // Other methods...

    // Part-I method remains unchanged

    // Other methods...
}
