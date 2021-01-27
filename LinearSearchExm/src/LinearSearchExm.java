public class LinearSearchExm {
    //Let's create a method first for linear search
    //The method will have an array integer and int key as which we want to search
    public int linearSearch(int[] arr, int key ){
        for(int i =1; i<arr.length; i++){
            if(arr[i] == key){
                return i; // Note we are going to print index, therefore i
                //If we want to print out the array position then  return i+1
            }
        }
        return -1;
    }
}
