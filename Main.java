// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1)); // Outputs 20
        list.deleteByValue(20);
        System.out.println(list.get(1)); // Outputs 30

        genericMyList<Integer> intList = new genericMyList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println(intList.get(1)); // Outputs: 20

        intList.deleteByValue(20);
        System.out.println(intList.get(1)); // Outputs: 30

        genericMyList<String> strList = new genericMyList<>();
        strList.add("hello");
        strList.add("world");

        System.out.println(strList.get(0));
    }
}