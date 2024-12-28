package observerpattern.java.weatherstation.WSObserver;

import observerpattern.java.weatherstation.WSObservable.WSObservable;

public class WSObserver {
    private WSObservable wsObservable;
    private String name;

    public WSObserver(String name, WSObservable wsObservable) {
        this.name = name;
        this.wsObservable = wsObservable;
    }

    public void Update() {
        System.out.println("Display on " + name + " today's current temp is " + wsObservable.getTemp().toString() + " C");
    }
}
