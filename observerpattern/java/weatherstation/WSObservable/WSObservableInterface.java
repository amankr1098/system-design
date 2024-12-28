package observerpattern.java.weatherstation.WSObservable;

import observerpattern.java.weatherstation.WSObserver.WSObserver;

public interface WSObservableInterface {
    public void add(WSObserver observer);
    public void remove(WSObserver observer);
    public void notifyy();
    public void setTemp(Double temp);
}
