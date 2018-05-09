
class Node<T>{
    private Node<T> next;
    private Object data;

    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
public class ElevenLab<T> {
    private Node<T> head;
    private Node<T> tail;
    public ElevenLab() {
    }

    public void add(Object data) {
        Node<T> node = new Node<T>();
        node.setData(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Object get(int index) {
        Node<T> current = head;
        if(current == null)
            return null;
        if(index > size()){
            return null;
        }
        for (int i=0; current!=null && i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean delete(int index) {
        Node<T> previous = null;
        Node<T> current = head;
        int i;
        for (i=1; current!=null && i <= index; i++){
            previous = current;
            current = current.getNext();
        }
        if (i-1 == index) {
            if (previous != null) {
                previous.setNext(current.getNext());
                if (current.getNext() == null) {
                    tail = previous;
                }
            }
            else {
                head = head.getNext();
                if (head == null) {
                    tail = null;
                }
            }
            return true;
        }
        return false;
    }

    public int size() {
        Node<T> current = head;
        int i = 0;
        for (; current!=null; i++){
            current = current.getNext();
        }
        return i;
    }
    public void clear(){
        head.setNext(null);
        head.setData(null);
        head = null;
    }
    public Object[] toArr(){
        Object arr[] = new Object[size()];
        Node<T> current = head;
        for (int i = 0; current!=null; i++){
            arr[i] = current.getData();
            current = current.getNext();
        }
        return arr;
    }
    @Override
    public String toString(){
        String str = "";
        Node<T> current = head;
        for (int i = 0; current!=null; i++){
            str += current.getData().toString();
            current = current.getNext();
        }
        return str;
    }

    public boolean isExist(Object value){
        Node<T> current = head;
        for (int i = 0; current!=null; i++){
            if(value.equals(current.getData()))
                return true;
            current = current.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        TradePoint firstPoint = new TradePoint("Adress", "Name", 123, "Programmer");
        TradePoint secondPoint = new TradePoint("strett", "Point Name", 456, "Lazier");
        ElevenLab<TradePoint> list = new ElevenLab<>();
        list.add(firstPoint);
        list.add(secondPoint);
        System.out.println(list.isExist(firstPoint));
        System.out.println(list);
        System.out.println(list.delete(1));
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
