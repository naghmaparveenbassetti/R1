import java.util.ArrayList;
class ArraylistImplementation{
    ArrayList <Object> list=new ArrayList<>();
    ArrayList <Object> list1=new ArrayList<>();
    void Add_Element(){
        list.add(10);
        list.add('a');
        list.add("hello");
        list.add(null);
        list.add("hello");//duplicate allowed
        list.add(null);//repeat null
        list.add(true);
        System.out.println("Size of arraylist: "+list.size());
        System.out.println("After adding, display elements of arraylist: "+list);
    }
    void Add_Element_Index(){ 
        list.add(2,"welcome");
        System.out.println("Adding element(using index: at any place): "+list);
        list.addFirst("First");
        System.out.println("Adding first element in arraylist: "+list);
        list.addLast("Last");
        System.out.println("Adding last element in arraylist: "+list);
    }
    }
    class Arraylist extends ArraylistImplementation{
        void Remove_Element(){
        list.remove(0);
        System.out.println("Remove element using index from arraylist: "+list);
        list.remove("null");
        System.out.println("Remove element directly: "+list);
        }
    }
    class usingforloop extends ArraylistImplementation{
        void forloop(){
        list1.add("First");
        list1.add("Second");
        list1.add("Third");
        list1.add("Fourth");
        for(int i=0;i<=list1.size()-1;i++){
            System.out.println(list1.get(i));
        }
    }
        void foreachloop(){
            for(Object x:list1){
                System.out.println(x);
            }
        }
    }
public class Demoarraylist{
    public static void main(String[] args) {
        Arraylist al=new Arraylist();
        al.Add_Element();
        al.Add_Element_Index();
        al.Remove_Element();
        usingforloop fl=new usingforloop();
        fl.forloop();
        fl.foreachloop();
    }
}
