class Time{
    private int Hours;
    private int Minutes;
    private int Seconds;
    void setHour(int hr){
        this.Hours=hr;
    }
    int getHour(){
        return Hours;
    }
    void setMinute(int min){
        this.Minutes=min;
    }
    int getMinute(){
        return Minutes;
    }
    void setSecond(int sec){
        this.Seconds=sec;
    }
    int getSecond(){
        return Seconds;
    }

}
public class TimeMain{
    public static void main(String[] args) {
        Time t=new Time();
        t.setHour(24);
        t.setMinute(1440);
        t.setSecond(86400);
        System.out.println("Total hours in a day: "+t.getHour());
        System.out.println("Total minutes in a day: "+t.getMinute());
        System.out.println("Total seconds in a day: "+t.getSecond());
    }
}
