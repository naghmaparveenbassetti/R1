 class Shape{
    double length,breadth,width;
    Shape(){
        length=breadth=width=0;
    }
    Shape (double len,double br){
        length=len;
        breadth=br;
    }
    Shape(double len,double br,double wd){
        length=len;
        breadth=br;
        width=wd;
    }
    void Volume(){
        double vol=(length*breadth*width);
        double area=(length*breadth);
        System.out.println("The area of the shape is: "+area);
        System.out.println("The volume of the shape is:" +vol);
    }
}
public class ShapeMain{
    public static void main(String[] args) {
     Shape s=new Shape();
    Shape s1=new Shape(40,20);
    Shape s2=new Shape(60,30,10);
    }
   
}