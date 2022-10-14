package Interview_type_question;

public class Binary1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};

        int last = arr.length-1;
        int key = 4;
        binarySearch(arr, 0, last, key);


    }
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}
