package observerpattern.java.weatherstation;

import java.util.Scanner;

import observerpattern.java.weatherstation.WSObservable.WSObservable;
import observerpattern.java.weatherstation.WSObserver.WSObserver;

public class WSMain {
    public void main(String[] args) {
        WSObservable wsObservable = new WSObservable();
        WSObserver tv = new WSObserver("TV", wsObservable);
        WSObserver mobile = new WSObserver("Mobile", wsObservable);
        WSObserver watch = new WSObserver("Watch", wsObservable);

        wsObservable.add(tv);
        wsObservable.add(mobile);
        wsObservable.add(watch);
        Scanner scn = new Scanner(System.in);
        boolean isExit = false;
        do {
            System.out.println(" Please enter the current temp ");
            if (!scn.hasNextDouble()) {
                isExit = true;
                break;
            }
            Double temp = scn.nextDouble();
            wsObservable.setTemp(temp);
            isExit = false;
        } while (!isExit);
        scn.close();
    }
}
