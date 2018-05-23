import java.util.LinkedList;

public class a_11_3 {

    /*
    3. Write a method called removeEvenInRange that accepts three parameters: a LinkedList, a starting index, and an
    ending index. The method’s behavior is to remove all occurrences of the even numbers that appear in the list
    between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the even
    numbers that appear outside the given index range are not affected.
    For example, for the list [1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16], a call of
    removeEvenInRange(list, 5, 13) should produce the list [1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16].
    Notice that the even numbers located at indexes between 5 inclusive and 13 exclusive in the original list (before any
    modifications were made) have been removed.
    */

    public static void main(String[] args) {

        LinkedList<Integer> testList = new LinkedList<>();

        testList.add(0, 1);
        testList.add(1, 1);
        testList.add(2, 2);
        testList.add(3, 0);
        testList.add(4, 4);
        testList.add(5, 5);
        testList.add(6, 6);
        testList.add(7, 8);
        testList.add(8, 8);
        testList.add(9, 3);
        testList.add(10, 11);
        testList.add(11, 9);
        testList.add(12, 12);
        testList.add(13, 0);
        testList.add(14, 14);
        testList.add(15, 0);
        testList.add(16, 16);

        System.out.println("testList: \n" + testList);
        System.out.println("Expected result from removeEvenInRange(testList, 5, 13: \n " +
                "[1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16]");
        removeEvenInRange(testList, 5, 13);
        System.out.println("Result: \n " + testList);
    }

    // Jeg vælger at itererer bagfra, for at udngå indexOutOfBounds exception, da listen bliver kortere nå man
    // fjerner et element
    public static void removeEvenInRange(LinkedList<Integer> list, int startIndex, int endIndex) {

        for (int i = endIndex - 1; i >= startIndex; i--) {

            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
