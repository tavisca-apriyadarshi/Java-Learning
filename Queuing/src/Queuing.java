import java.util.ArrayList;

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

    public String remove(){
        if(queue.size()>0)
            return ""+queue.remove(0);
        else
            return "Queue Capacity already empty";
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
        System.out.println();
        for (int i=0; i<3; i++)
            System.out.println(forSuppliedSize.remove());

        System.out.println();

        for(Object items: forSuppliedSize.GetQueue()){
            System.out.println(items);
        }

        System.out.println();
        for (int i=0; i<3; i++)
            System.out.println(forSuppliedSize.remove());

        System.out.println();

        for(int i=0; i<6; i++){
            forSuppliedSize.add(i);
        }

    }
}
