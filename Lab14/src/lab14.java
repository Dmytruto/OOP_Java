
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
public class lab14 implements Serializable {
    private static  LinkedList<Object> list =  new LinkedList<Object>();
    private static int find(Object value){
        return list.indexOf(value);
    }
    private static void remove(Object value){
        list.remove(value);
    }
    private static void add(Object value){
        list.add(value);
    }
    public static void main(String[] args) throws IOException {
        Integer number = 2;
        Integer number1 = 15;
        Integer number2 = 1;
        Integer number3 = 7;
        add(number);
        add(number1);
        add(number2);
        add(number3);
        remove(number2);
       for (Object i: list)
           System.out.println(i);
        System.out.println(find(number3));
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        lab14 ts = new lab14();
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}
