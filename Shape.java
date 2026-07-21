class C1{
    void Triangle(double base, double height){
        double area=(0.5*base*height);
        System.out.println("The area of the triangle: "+area);
    }
}
interface I1{
    void Rectangle(int len, int br);//methods are abstract & public by default..only decleration 
}
interface I2{
    default void Square(int side){//default method
        int area1=(side*side);
        System.out.println("The area of the square is: "+area1);
    }
    static void Cube(int len, int wd, int h){//static method
        int volume=(len*wd*h);
        System.out.println("The volume of the cube is: "+volume);
    }
    }
public class Shape extends C1 implements I1 , I2{
    public void Rectangle(int len, int br){//implementation of abstract method..we make it public
    //because in class methods are default and in interface public..from public to default reduce visibility
        int area2=(len*br);
        System.out.println("The area of the rectangle is: "+area2);
    }
    public static void main(String[] args) {
        Shape s=new Shape();
        I2 i=new Shape();//interface can't be instantiated but we can create referece variable
        s.Rectangle(20, 10);
        s.Triangle(5, 7);
        i.Square(10);
        I2.Cube(12, 6, 8);//static method directly by using interfce I2
    }
}

