import java.util.ArrayList;
import java.util.Queue;

public class Queuing <T> {
    private int capacity;
    private ArrayList<T> queue = new ArrayList<T>();

    public  Queuing(){
        capacity = 1;
    }

    public  Queuing(int capacity){
        this.capacity = capacity;
    }

    public  int GetCapacity(){
        return  capacity;
    }

    public void add(T value){
        if(queue.size()<capacity)
            queue.add(value);
        else
            System.out.println("Queue Capacity Full");
    }

    public void remove(){
        if(queue.size()>0)
            queue.remove(0);
        else
            System.out.println("Queue Capacity already empty");
    }

    public ArrayList<T> GetQueue(){
        return  queue;
    }

    public static void main(String[] args) {
        Queuing forDefaultSize = new Queuing();
        Queuing forSuppliedSize = new Queuing(5);
        System.out.println("Default size:" + forDefaultSize.GetCapacity());
        System.out.println("Supplied size:" + forSuppliedSize.GetCapacity());
        for(int i=0; i<5; i++){
            forSuppliedSize.add(i);
        }
        for (int i=0; i<3; i++)
            forSuppliedSize.remove();

        for(Object items: forSuppliedSize.GetQueue()){
            System.out.println(items);
        }
        for (int i=0; i<3; i++)
            forSuppliedSize.remove();
        for(int i=0; i<6; i++){
            forSuppliedSize.add(i);
        }

    }
}
