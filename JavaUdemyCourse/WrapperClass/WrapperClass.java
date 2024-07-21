package code.JavaUdemyCourse.WrapperClass;

public class WrapperClass {
    public static void main(String[] args){
        String a = "ABC";
        StringBuffer b = new StringBuffer("CDE");
        StringBuilder c= new StringBuilder("CDE");
        a.concat("CDE");
        b.append(a);
        c.append(a);

        System.out.println(a + "\n" + b + "\n" + c);
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println(b.equals(c)); // False - because for stringBuffer it check for reference and due to its list like nature and inconsistent size.

    }
}
