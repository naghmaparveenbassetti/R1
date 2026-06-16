class Electronics{
        String screenSize;
        String screenColor;
        int Cost;
    }
class Mobile extends Electronics{
    void M1(String Msize, String Mcolor ,int Mcost){
        this.screenSize=Msize;
        this.screenColor=Mcolor;
        this.Cost=Mcost;
        System.out.println("The size of the mobile screen is: "+screenSize);
        System.out.println("The color of the mobile screen is: "+screenColor);
        System.out.println("The cost of the mobile is: "+Cost);
    }
}
class TV extends Electronics{
    void T1(String Tsize, String Tcolor,int Tcost){
        this.screenSize=Tsize;
        this.screenColor=Tcolor;
        this.Cost=Tcost;
        System.out.println("The size of the tv screen is: "+screenSize);
        System.out.println("The color of the tv screen is: "+screenColor);
        System.out.println("The cost of the tv is: "+Cost);
    }
}
class Laptop extends Electronics{
    void L1(String Lsize, String Lcolor, int Lcost){
        this.screenSize=Lsize;
        this.screenColor=Lcolor;
        this.Cost=Lcost;
        System.out.println("The size of the laptop screen is: "+screenSize);
        System.out.println("The color of the laptop screen is: "+screenColor);
        System.out.println("The cost of the laptop is: "+Cost);
    }
}
public class ElectronicsMain{
    public static void main(String[] args) {
        Mobile mob=new Mobile();
        mob.M1("small","white",20000);
        TV tv=new TV();
        tv.T1("big","white",15000);
        Laptop lp=new Laptop();
        lp.L1("medium","white",60000);   
    }
}