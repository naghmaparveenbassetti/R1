import java.util.Arrays;
import java.util.Scanner;
class ArrayImplementation{
    void Array_decleration(){
        int arr1[]={10,20,30,40};
        //two dimensional array
        //int arr2[]= new int[4];
        //int a2[][]=new int[3][2];
        //arr2[0]=50; arr2[1]=60; arr2[2]=70; arr2[3]=80;
        //print length of an array
        System.out.println("The size of array: "+arr1.length);
        //read each element from an array
        for(int i=0;i<=arr1.length-1;i++){
            System.out.println(arr1[i]);//display each element
        }
        System.out.println("Print element from an specific position "+arr1[2]);
        int d1[][]={{100,200},{300,400},{500,600},{700,800}};
        System.out.println("Size of rows in 2d array: "+d1.length);
        System.out.println("Size of columns in 2d array: "+d1[0].length);
        //to find the length of column we have to mention particular row
        for(int r=0;r<4;r++){
            for(int c=0;c<2;c++){
                System.out.println("Display each element of an 2d array: "+d1[r][c]);
            }   
        }
        System.out.println("Print element from an specific position "+d1[2][1]);
    }
}
class Linear_Search{
    void Searching(){
        int a[]={100,200,500,300,800};//linear search
       int search_ele=700;
       boolean flag=false;
       for(int i=0;i<=4;i++){
        if(search_ele==a[i]){
            flag=true;
            System.out.println("Element found: "+a[i]);
            break;
        }
    }
        if(!flag){
        System.out.println("Element not found:");
       }
    }
}
class Duplicate_element{
    void Dup_ele(){
        //count the duplicate element
      int a[]={100,200,200,300,200,500};
      int num=200;
      int count=0;
      for(int i=0;i<=a.length-1;i++){
        if(num==a[i]){
            count++;  
        } 
      }
       System.out.println("Repetitive elements: "+count);
    }
}
class Hetrogeneous{
    void Hetro_data(){
        Object a[]={100,"Test",'A',true,50.23};
     for (Object x : a) {
         System.out.println("Hetrogenous type: "+x);
     }
    }
}
class Reverse{
    void Rev_element(){
        int num=12345;
        int rev=0;
        while(num>0){
        rev=rev*10+num%10;//0*10+12345%10=5,0*10+1234%10=4,....
        num=num/10;//12345/10=1234,....
        }
        System.out.println("Reverse number: "+rev);
        int a[]={100,200,300,400,500};
       for(int i=a.length-1;i>=0;i--){
        System.out.println("Reverse array: "+a[i]);
       }
    }
}
class UserInput{
    void Input(){
        //User Input : Array-->need to import [import java.util.Scanner;]
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of an array: ");
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=a.length-1;i++)
        {
            System.out.println("Enter element at position: " +i+ " of an array");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.println("Printing the elements of an array: "+a[i]);
        }
    }
}
class Sort_Array{
    void Sorting(){
        int a[]={500,900,200,8000,400};
        //for(int i=0;i<=a.length-1;i++){
        //sorting an array-->need to import[import java.util.Arrays;]
        System.out.println("Before sorting elements of an array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting elements of an array: "+Arrays.toString(a));
    }
}
class Max_Min_Element{
    void Max(){
        //Maximum & minimum element in an array
        int a[]={500,800,200,50,18000,600};
        int max=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Largest element in an array: "+max);
    }
    void Min(){
        int b[]={900,5000,700,200,1800};
        int min=b[0];
        for(int i=0;i<=b.length-1;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        System.out.println("Smallest element in an array: "+min);   
}
}
class Sum_Of_Elements{
    //Sum of elements in an array
    void Sum(){
        int arr[]={500,900,600,700,10,20,100};
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            count=count+arr[i];
        }
        System.out.println("Sum of elements in an array: "+count);
    }
}
public class Demoarray{
    public static void main(String[] args) {
        ArrayImplementation ad=new ArrayImplementation();
        ad.Array_decleration();
        Linear_Search ls=new Linear_Search();
        ls.Searching();
        Duplicate_element ele=new Duplicate_element();
        ele.Dup_ele();
        Hetrogeneous h=new Hetrogeneous();
        h.Hetro_data();
        Reverse r=new Reverse();
        r.Rev_element();
        UserInput i=new UserInput();
        i.Input();
        Sort_Array a=new Sort_Array();
        a.Sorting();
        Max_Min_Element m=new Max_Min_Element();
        m.Max();
        m.Min();
        Sum_Of_Elements a1=new Sum_Of_Elements();
        a1.Sum();
    }
}
  
    
      
  
 
     
        
      

    
    
        
    
    
    
        
    
   
    


