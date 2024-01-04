package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public NewsLetter(){
        this.observers=new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obj) {
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        if (!changed)
            return;
        for (Observer obj : observers) {
            obj.update();
        }
        changed = false;
    }

    @Override
    public String getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
