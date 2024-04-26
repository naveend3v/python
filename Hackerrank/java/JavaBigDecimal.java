// https://www.hackerrank.com/challenges/java-bigdecimal/problem
import java.math.BigDecimal;
import java.util.*;
// Change below class name "JavaBigDecimal" to "Solution" when running this code in HackerRank submission
class JavaBigDecimal {

    public static void main(String []args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		//Write your code here
		for (int i = 0; i < s.length-2; i++) {
			for (int j = 1; j < (n-i); j++) {
				BigDecimal sj = new BigDecimal(s[j]);
				BigDecimal sj1 = new BigDecimal(s[j-1]);
				if(sj.compareTo(sj1) == 1){
					String temp = s[j];
					s[j] = s[j-1];
					s[j-1] = temp;
				}
			}
		}
		//Output
		for (int i = 0; i < n; i++) {
			{
				System.out.println(s[i]);
			}
		}
	}
}
