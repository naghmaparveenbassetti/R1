class Student{
    String sName;
    int sId;
    int sRoll;
    public void Secondary(String sName, int sId){
        this.sName=sName;
        this.sId=sId;
        System.out.println("The name of the student is: "+this.sName);
        System.out.println("The id of the student is: "+this.sId);
    }
    public void HigherSecondary(String sName, int sId,int sRoll){
        this.sName=sName;
        this.sId=sId;
        this.sRoll=sRoll;
        System.out.println("The name of the student is: "+this.sName);
        System.out.println("The id of the student is: "+this.sId);
        System.out.println("The roll number of the student is: "+this.sRoll);
    }
    public void TotalStudent(int sCount, int hCount){
        int totalCount=(sCount+hCount);
        System.out.println("Total Students: "+totalCount);
    }
}
public class Details{
    public static void main(String []args){
        Student s=new Student();
        s.Secondary("ABCD",1);
        s.HigherSecondary("EFGH", 2, 10);
        s.TotalStudent(200, 100);
    }
}