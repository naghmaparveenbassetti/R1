class Time{
    private int Hours;
    private int Minutes;
    private int Seconds;
    void setDay(int hr, int min, int sec){
        this.Hours=hr;
        this.Minutes=min;
        this.Seconds=sec;
    }
    int getDayHour(){
        return Hours;
    } 
    int getDayMinute(){
        return Minutes;
    } 
    int getDaySecond(){
        return Seconds;
    } 
}
public class TimeMain{
    public static void main(String[] args) {
        Time t=new Time();
        t.setDay(24, 1440, 86400);
        System.out.println("Total hours in a day: "+t.getDayHour());
        System.out.println("Total minutes in a day: "+t.getDayMinute());
        System.out.println("Total seconds in a day: "+t.getDaySecond());
        
    }
}
