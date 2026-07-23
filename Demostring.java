
import java.util.Scanner;
public class Demostring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A="Tom";
        String B="Jerry";
        String C="Fight";
        String Con=A.concat(B).concat(C);
        String Rep=A.repeat(3);
        String LCase=B.toLowerCase();
        String UCase=A.toUpperCase();
        int Comp=A.compareTo(B);
        String Sub_String_StartIndex=A.substring(1);
        String Sub_String_StartIndex_EndIndex=Con.substring(3, 13);
        System.out.println("Length of a string: "+Con.length());
        System.out.println("Concat String: "+Con);
        System.out.println("Repeat method: "+Rep);
        System.out.println("SubString BeginIndex method: "+Sub_String_StartIndex);
        System.out.println("Sub_String_StartIndex_EndIndex: "+Sub_String_StartIndex_EndIndex);
        System.out.println("Lower Case: " +LCase+ " "+ "Upper Case: "+UCase);
        System.out.println("Compare method: "+Comp);
        //Reverse String-->Concat+charatindex
        //Con=TomJerryFight
        /*int len=Con.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+Con.charAt(i);//=null+index12-->t,//=null+index11-->h,
            //rev=t+h+g+i+f......
        }
        System.out.println("Reverse String: "+rev);*/
        //Count number of repetitive char in String
       /*String RepChar="Repetitive";
        int count=0;
        System.out.println("Enter Character: ");
        char matched=sc.next().charAt(0);
        for(int i=0;i<=RepChar.length()-1;i++){
            if(RepChar.charAt(i)==matched)
            count++;
        }
        System.out.println("Repetitive char in string: "+count);*/
        String Test="ABGHRTZYU";
        int max=Test.charAt(0);
        int min=Test.charAt(0);
        for(int i=0;i<=Test.length()-1;i++){
            if(Test.charAt(i)>max){
                max=Test.charAt(i);
            }
        }
        System.out.println("Highest visibilty char value in array: "+max);
        for(int i=0;i<=Test.length()-1;i++){
            if(Test.charAt(i)<min){
                min=Test.charAt(i);
                System.out.println("Lowest visibilty char in array: "+Test.charAt(i));
            }
        }
        System.out.println("Lowest visibilty char value in array: "+min);
    }   
    }

