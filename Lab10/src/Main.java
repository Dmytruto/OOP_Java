import java.util.*;

class TradePoint{
    public static HashMap<String,String> schedule = new HashMap<>();
    private static String adress;
    private static String name;
    public static ArrayList<Integer> numbers = new ArrayList<>();
    private static String specialization;
    public TradePoint(String adress, String name, int number, String specialization){
        this.adress = adress;
        this.name = name;
        numbers.add(number);
        this.specialization = specialization;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public void  setName(String name){
        this.adress = adress;
    }
    public void addNumbers(int newNumber){
        numbers.add(newNumber);
    }
    public void setSchedule(String day, String time){
        schedule.replace(day,time);
    }
    public static void addNewWorkingDay(String day, String time){
        schedule.put(day,time);
    }
    public void ShowSchedule(){
        for(Map.Entry<String, String> x : schedule.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    public void ShowAllData(){
        System.out.println("Adress: " + adress + "\nnumber:" + numbers.toString() + "\nname: " + name + "\nspecialization: " + specialization);
    }
}
public class Main {
    public static void main(String args[]) {
        TradePoint tradePoint = new TradePoint("Adress", "Name", 123, "Programmer");
        TradePoint.addNewWorkingDay("Monday", "8a.m - 6p.m");
        tradePoint.ShowSchedule();
        System.out.println();
        tradePoint.ShowAllData();
    }
}