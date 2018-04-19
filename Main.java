import java.awt.*;
import java.util.Iterator;

class SelfCollection {
    private static int arrSize = 15;
    private static String arr[] = new String[arrSize];
    private static int end = 0;
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < end; i++)
            string.append(arr[i]);
        return string.toString();
    }
    public void add(String string){
        if(end == arrSize - 1){
            arrSize *= 2;
            String newArr[] = new String[arrSize];
            for(int i = 0; i < end; i++)
                newArr[i] = arr[i];
            newArr[end] = string;
            arr = newArr;
        }
        else
        arr[end++] = string;
    }
    public void clear(){
        for(int i = 0; i < end; i++){
            arr[i] = null;
        }
    }
    public boolean remove(String string){
        for(int i = 0; i < end; i++){
            if(string.equals(arr[i])){
                for(;i + 1 < end; i++){
                    arr[i] = arr[i+1];
                }
                arr[--end] = null;
                return true;
            }
        }
        return false;
    }
    public Object[] toArray(){
        return arr;
    }
    public int size(){
        return end;
    }
    public boolean contains(String string){
        for(int i = 0; i < end; i++){
            if(string.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
    public boolean ContainsAll(Container container){
        for(String x : arr){
            if(!contains(x))
                return false;
        }
        return true;
    }
    public Iterator<String> iterator(){

        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}



public class Main {
    public static void main(String[] args) {
        SelfCollection var = new SelfCollection();
        var.add("dsds ");
        var.add("second ");
        var.add("third");
        System.out.println(var);
    }
}
