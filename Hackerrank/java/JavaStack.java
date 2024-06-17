// https://www.hackerrank.com/challenges/java-stack/problem?
// Java Stack
// Ref - https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

import java.util.*;
class JavaStack {

    public static boolean isBalanced(String inputStr){

        char[] inputStrArr = inputStr.toCharArray();

        Stack<Character> chStack= new Stack();

        Map<Character, Character> matchingPair = new HashMap<>();
        matchingPair.put(')', '(');
        matchingPair.put('}', '{');
        matchingPair.put(']', '[');

        for(char ch: inputStrArr){
            if(ch == '{' || ch == '(' || ch == '['){
                chStack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']'){
                if(chStack.isEmpty()){
                    return false;
                }
                if(chStack.pop() != matchingPair.get(ch)){
                    return false;
                }
            }
        }

        return chStack.isEmpty();
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String inputStr = scan.next();
            System.out.println(isBalanced(inputStr));
        }
        scan.close();
    }
}
