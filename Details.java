class Student{
    String sName;
    int sId;
    int sRoll;
    public void Secondary(String sName, int sId){
        this.sName=sName;
        this.sId=sId;
        System.out.println("The name of the student is: "+sName);
        System.out.println("The id of the student is: "+sId);

    }
    public void HigherSecondary(String sName, int sId,int sRoll){
        this.sName=sName;
        this.sId=sId;
        this.sRoll=sRoll;
        System.out.println("The name of the student is: "+sName);
        System.out.println("The id of the student is: "+sId);
        System.out.println("The roll number of the student is: "+sRoll);
    }
}
public class Details{
    public static void main(String []args){
        Student s=new Student();
        s.Secondary("ABCD",1);
        s.HigherSecondary("EFGH", 2, 10);
    }
}