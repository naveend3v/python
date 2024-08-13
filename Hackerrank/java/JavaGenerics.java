// https://www.hackerrank.com/challenges/java-generics/problem
// Ref- https://docs.oracle.com/javase/tutorial/java/generics/methods.html

// Change below class name "javaGenerics" to "Solution" when running this code in HackerRank submission
public class JavaGenerics {
    static <T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"Hello","World"};
        printArray(integerArray);
        printArray(stringArray);
    }
}
