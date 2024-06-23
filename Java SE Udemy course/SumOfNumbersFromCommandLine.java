public class SumOfNumbersFromCommandLine {

	public static void main(String[] args){
		double temp = 0;
		for(String str: args){
			if(str.matches("[0-9.]+"))
				temp = temp + Double.parseDouble(str);
		}
		System.out.println("Sum of given numbers : " + temp);
	}
}