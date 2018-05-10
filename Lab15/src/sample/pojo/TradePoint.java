package sample.pojo;
import java.util.*;
class Name {
    public String name;
    Name(String name){
        this.name = name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Adress{
    public String adress;
    Adress(String adress){
        this.adress = adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return adress;
    }
}
class Number{
    public ArrayList<Integer> numbers;
    Number(int number){
        this.numbers = new ArrayList<>();
        numbers.add(number);
    }
    public void addNumbers(int newNumber){
        numbers.add(newNumber);
    }
    public ArrayList getNumbers(){
        return numbers;
    }
    @Override
    public String toString(){
        return numbers.toString();
    }
}
class Specialization{
    public String specialization;
    Specialization(String specialization){
        this.specialization = specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
}
class Schedule{
    public HashMap<String,String> schedule;
    Schedule(String day, String time){
        this.schedule = new HashMap<>();
        schedule.put(day,time);
    }
    public void addNewWorkingDay(String day, String time){
        schedule.put(day,time);
    }
    public void setSchedule(String day, String time){
        schedule.replace(day,time);
    }
    public void ShowSchedule(){
        for(Map.Entry<String, String> x : schedule.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    public  HashMap<String, String> getSchedule() {
        return schedule;
    }
    @Override
    public String toString(){
        return schedule.toString();
    }
}

public class TradePoint{
    String str = "fdf";
    Name name;
    Adress adress;
    Specialization specialization;
    Number number;
    Schedule schedule;
    public TradePoint( String name1, String adress1, int number1, String specialization1, String day, String time, String str){
        this.str = str;
        this.name = new Name(name1);
        this.adress = new Adress(adress1);
        this.specialization = new Specialization(specialization1);
        this.number = new Number(number1);
        this.schedule = new Schedule(day,time);
    }

    public String ShowAllData(){
        String str = name.getName() + " " + adress.getAdress() + " " + specialization.getSpecialization() + " " + number + " " + schedule;
        return str;
    }
    @Override
    public String toString(){
        return ShowAllData();
    }
}