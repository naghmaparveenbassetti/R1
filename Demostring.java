import java.util.Arrays;
class Diff_methods{
    String A="Tom";
    String B="Jerry";
    String C="Fight";
    void Length(){
        int len=C.length();
        System.out.println("Length of string: "+len);//5
    }
    void Concat(){
        String Con=A.concat(B).concat(C);
        System.out.println("Concat String: "+Con);//TomJerryFight
    }
    void Repeat(){
        String Rep=A.repeat(3);
        System.out.println("Repeat method: "+Rep);//TomTomTom
    }
    void Case(){
        String LCase=B.toLowerCase();
        String UCase=A.toUpperCase();
        System.out.println("Lower Case: " +LCase+ " "+ "Upper Case: "+UCase);//JERRY//tom
    }
    void Compare(){
        int Comp=A.compareTo(B);
        System.out.println("Compare method: "+Comp);
    }
    void Sub_string(){
        String Sub1=A.substring(1);
        String Sub2=B.substring(0, 3);
        System.out.println("SubString BeginIndex method: "+Sub1);//om
        System.out.println("Sub_String_StartIndex_EndIndex: "+Sub2);//Jer
    }
    void Contains(){
        boolean Content_True=A.contains("om");
        boolean Content_False=A.contains("Om");
        System.out.println("Contains method: "+Content_True);//true
        System.out.println("Contains method (case sensitive): "+Content_False);//false
    }
    void Trim(){
        //remove space from start and end
        String str=" Welcome ";
        String T=str.trim();
        System.out.println("Trim method: "+T);//Welcome
    }
    void Equals(){
        String str1="Laptop";
        System.out.println("Equal method: "+str1.equals("Laptop"));//true
        System.out.println("Equal method (case sensitive): "+str1.equals("LAPtop"));//false
        System.out.println("EqualIgnore method: "+str1.equalsIgnoreCase("LAPtop"));//true
    }
}
class Reverse_string{
    void Reverse(){
        //Reverse String-->Concat+charatindex
        String str="TomJerryFight";
        int len=str.length()-1;
        String rev="";
        for(int i=len;i>=0;i--){
            rev=rev+str.charAt(i);//=null+index12-->t,//=null+index11-->h,
            //rev=t+h+g+i+f......
        }
        System.out.println("Reverse String: "+rev);//thgiFyrreJmoT
    }
}
class No_Repetitive_Char_Instring{
    void Repetitive(){
        //Count number of repetitive char in String
        String RepChar="Repetitive";
        int count=0;
        char matched='e';
        for(int i=0;i<=RepChar.length()-1;i++){
            if(RepChar.charAt(i)==matched)
            count++;
        }
        System.out.println("Repetitive char in string: "+count);//3
    }
}
class Vis_Char{
    void Visibility_char(){
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
            }
        }
        System.out.println("Lowest visibilty char value in array: "+min);
    } 
    }
class Splituses{
    void Split_method(){
        String str="abcd@gmail.com";
        String str1="java,code#26";
        String arr[]=str.split("@");
        String arr1[]=str1.split(",");
        String arr2[]=str1.split("#");
        System.out.println("Split string using delimeters: "+(Arrays.toString(arr)));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
public class Demostring {
    public static void main(String[] args) {
        Diff_methods method=new Diff_methods();
        method.Length();
        method.Concat();
        method.Repeat();
        method.Case();
        method.Compare();
        method.Sub_string();
        method.Contains();
        method.Trim();
        method.Equals();
        Reverse_string revs=new Reverse_string();
        revs.Reverse();
        No_Repetitive_Char_Instring repchar=new No_Repetitive_Char_Instring();
        repchar.Repetitive();
        Vis_Char vc=new Vis_Char();
        vc.Visibility_char();   
        Splituses s=new Splituses();
        s.Split_method();   
    }
    }

