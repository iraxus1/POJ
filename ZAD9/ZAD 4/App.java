package pl.edu.pja;

public class App{
    public static void main(String[] args) {
        final MyList<Integer> integerMyList = new MyList<>();
        /*final MyList<String> stringMyList = new MyList<>();*/

        for(int i = 0; i <= 21; i++)
        {
            integerMyList.add(i);
        }
        /*
        stringMyList.add("aaa");
        stringMyList.add("bbb");
        stringMyList.add("ccc");
        */
        System.out.println("DLA INTEGER");
        System.out.println("Ilość: ");
        System.out.println(integerMyList.size());
        System.out.println("Czy zawiera: ");
        System.out.println(integerMyList.contains(10));
        System.out.println("Index nr: ");
        System.out.println(integerMyList.indexOf(10));
        System.out.println("Ostatni index nr: ");
        System.out.println(integerMyList.lastIndexOf(21));
        System.out.println("Get index: ");
        System.out.println(integerMyList.get(0));
        System.out.println("Zamiana elementow z "+ integerMyList.get(1) + " na 420");
        integerMyList.set(1, 420);
        System.out.println(integerMyList.get(1));

        /*
        System.out.println("\n\nDLA STRING");
        System.out.println("Ilość: ");
        System.out.println(stringMyList.size());
        System.out.println("Czy zawiera: ");
        System.out.println(stringMyList.contains("aaa"));
        System.out.println("Index nr: ");
        System.out.println(stringMyList.indexOf("bbb"));
        System.out.println("Ostatni index nr: ");
        System.out.println(stringMyList.lastIndexOf("ccc"));
        System.out.println("Get index: ");
        System.out.println(stringMyList.get(0));
        System.out.println("Zamiana elementow z "+ stringMyList.get(1) + " na ddd");
        stringMyList.set(1, "ddd");
        System.out.println(stringMyList.get(1));
         */
    }
}
