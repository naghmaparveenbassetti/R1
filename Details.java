class Student{
    String sName;
    int sId;
    int sRoll;
    String sDepart;
    public void Secondary(String name, int id){
        this.sName=name;
        this.sId=id;
        System.out.println("The name of the student is: "+sName);
        System.out.println("The id of the student is: "+sId);
    }
    public void HigherSecondary(String name, int id,int roll){
        this.sName=name;
        this.sId=id;
        this.sRoll=roll;
        System.out.println("The name of the student is: "+sName);
        System.out.println("The id of the student is: "+sId);
        System.out.println("The roll number of the student is: "+sRoll);
    }
    public void College(String name, int id, int roll, String dept){
        this.sName=name;
        this.sId=id;
        this.sRoll=roll;
        this.sDepart=dept;
        System.out.println("The name of the student is: "+sName);
        System.out.println("The id of the student is: "+sId);
        System.out.println("The roll number of the student is: "+sRoll);
        System.out.println("The department of the student is: "+sDepart);
    }
    public void TotalStudent(int sCount, int hCount, int cCount){
        int totalCount=(sCount+hCount+cCount);
        System.out.println("Total Students: "+totalCount);
    }
    
}
public class Details{
    public static void main(String []args){
        Student s=new Student();
        s.Secondary("ABCD",1);
        s.HigherSecondary("EFGH", 2, 10);
        s.TotalStudent(200, 100,50);
        s.College("New", 5, 22, "commerce");
    }
}