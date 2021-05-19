package pl.edu.pja;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(1,1,2,2,4,5,3,3,7,6,4,4,6,8,9,4,5,3);
        //System.out.println(new HashSet<>(integers));
        System.out.println(delete(integers));
    }
    public static <T> HashSet<T> delete(final List<T> delete)
    {
    return new HashSet<>(delete);
    }
}
