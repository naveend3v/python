import java.util.*;

public class ArrayMaxElement {

    static void maxElement(ArrayList<Integer> array1){
        int maxElem = 0;
        for(int i: array1){
            if(maxElem > i) {
                maxElem = maxElem;
            } else {
                maxElem = i;
            }
        }
        System.out.println("The Maximum Element is: " + maxElem);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        int arrLength = scan.nextInt();
        while(arrLength-- > 0){
            testArray.add(scan.nextInt());
        }

        System.out.println("The Array is : " + testArray.toString());
        maxElement(testArray);

    }
}
