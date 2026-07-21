import java.util.Arrays;
public class Demoarray{
    /*public static void main(String[] args) {
        int arr1[]={10,20,30,40};
        //two dimensional array
        int a1[][]={(100,200),(300,400),(500,600),(700,800)}
        int arr2[]= new int[4];
        int a2[][]=new int[3][2];
        arr2[0]=50; arr2[1]=60; arr2[2]=70; arr2[3]=80;
        //print length of an array
        System.out.println("The size of array: "+arr1.length);
        //read each element from an array
        for(int i=0;i<=arr1.length-1;i++){
            System.out.println("Display each element of an array: "+arr1[i]);
        }
        System.out.println("Print element from an specific position "+arr1[2]);
    }*/
    /*  public static void main(String[] args) {
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
}*/

 /*public static void main(String[] args) {//count the duplicate element
      int a[]={100,200,200,300,200,500};
      int num=200;
      int count=0;
      for(int i=0;i<=a.length-1;i++){
        if(num==a[i]){
            count++;  
        } 
      }
       System.out.println("Repetitive elements: "+count);
  }*/
 /*public static void main(String[] args) {
     Object a[]={100,"Test",'A',true,50.23};
     for (Object x : a) {
         System.out.println("Hetrogenous type: "+x);
     }
     
 }*/
    /*public static void main(String[] args) {
        int num=12345;
        int rev=0;
        while(num>0){
        rev=rev*10+num%10;//0*10+12345%10=5,0*10+1234%10=4,....
        num=num/10;//12345/10=1234,....
        }
        System.out.println("Reverse number: "+rev);
    }*/
   /*public static void main(String[] args) {
       int a[]={100,200,300,400,500};
       for(int i=a.length-1;i>0;i--){
        System.out.println(a[i]);
       }
   }*/
  /*public static void main(String[] args) {
    //User Input : Array-->need to import [import java.util.Scanner;]
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array: ");
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
      
  }*/
 //sorting an array-->need to import[import java.util.Arrays;]
    public static void main(String[] args) {
        int a[]={500,900,200,8000,400};
        //for(int i=0;i<=a.length-1;i++){
        System.out.println("Before sorting elements of an array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting elements of an array: "+Arrays.toString(a));
        }
    }


