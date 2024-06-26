public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(){
        length = breadth = 1;
    }

    public Rectangle(int l, int b){
        setLength(l); setBreadth(b);
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setLength(int l){
        length = (l>0) ? l : 0;
    }

    public void setBreadth(int b){
        breadth = (b>0) ? b : 0;

    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2 * (length + breadth);
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle(10,5);
        System.out.println("Area : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());
    }

}
