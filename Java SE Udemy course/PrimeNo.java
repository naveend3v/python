import java.util.*;
public class PrimeNo{
    static boolean checkPrime(int number){

        if(number==1)
            return false;

        for(int i=2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int a = scan.nextInt();
            System.out.println(checkPrime(a));
        }

        scan.close();
    }

}