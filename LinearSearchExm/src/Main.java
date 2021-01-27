public class Main {

    public static void main(String[] args) {
        LinearSearchExm ls = new LinearSearchExm();
        int[] myArray = {23,10, 34, 77, 89, 234, 24, 25, 90,};
        int key = 77;
        System.out.println(key + " is found at index: " + ls.linearSearch(myArray, key));
        //Also instead of declare int variable and assign the key, we can passed the value
        System.out.println(234 + " is found at index: " + ls.linearSearch(myArray, 234));
    }
}
