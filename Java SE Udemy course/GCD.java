import java.util.*;

public class GCD {

    static void gcd(int n1, int n2){

        while(n1!=n2){

            if(n1>n2){
                n1=n1-n2;
            } else if(n2>n1){
                n2=n2-n1;
            }
        }
        System.out.println("GCD is:" + n1);
    }

    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        gcd(number1,number2);
    }
}
