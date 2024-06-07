public class Main {
    public static void main(String[] args) {
        BubbleSortExm bubbleSortExm = new BubbleSortExm();
        int[] myArray = {3,50,65,2,30,7};
        System.out.println("Before Sorting the array");
        for(int i = 0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
            }
        System.out.println();

        bubbleSortExm.bubbleSort(myArray);
        System.out.println("After Bubble sort ");
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
