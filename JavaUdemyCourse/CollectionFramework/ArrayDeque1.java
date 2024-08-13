package code.JavaUdemyCourse.CollectionFramework;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args){
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();
        for(int i=0;i<=10;i++){
            if((i%2)==0)
                dq1.offerFirst(i);
            else
                dq1.offerLast(i);
        }
        dq1.forEach(x->System.out.print(x + " "));
    }
}
