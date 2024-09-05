package src.multithreading.syncro;

public class Counter {
    private int count =0;


    public   void  increaseCount(){
        synchronized (this){
            count++;
        };
    }

    public Integer getCount(){
        return count;
    }

    ///call same as synchronized
}
