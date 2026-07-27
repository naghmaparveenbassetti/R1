class A{
    void Student(String name, int id, String dept){
        System.out.println("name of first student is: "+name);
        System.out.println("id of first student is: "+id);
        System.out.println("dept of first student is: "+dept);
    }
}
interface I1{
    void Student(String name, int id, String dept);
}
interface I2{
    void Student(String name, int id, String dept);
}
public class Info extends A implements I1,I2{
    public void Student(String name, int id, String dept){
        super.Student("efgh", 20, "Finance");
        System.out.println("name of 2nd student: "+name);
        System.out.println("id of 2nd student is: "+id);
        System.out.println("dept of 2nd student is: "+dept);
    } 
    public static void main(String[] args) {
        Info i=new Info();
        i.Student("abcd", 10, "IT");
    }
}