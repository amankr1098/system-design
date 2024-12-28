package observerpattern.java.weatherstation.WSObservable;

import java.util.LinkedList;
import java.util.List;

import observerpattern.java.weatherstation.WSObserver.WSObserver;

public class WSObservable implements WSObservableInterface{
    private List<WSObserver> wsObservers = new LinkedList<>();
    private Double temp;

    @Override
    public void add(WSObserver observer) {
       wsObservers.add(observer);
    }

    @Override
    public void remove(WSObserver observer) {
        wsObservers.remove(observer);
    }

    @Override
    public void notifyy() {
        for (WSObserver observer : wsObservers){
            observer.Update();
        }
    }

    @Override
    public void setTemp(Double temp){
        this.temp = temp;
        notifyy();
    }

    public Double getTemp(){
        return this.temp;
    }


}
