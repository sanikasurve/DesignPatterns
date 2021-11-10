package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public EmailTopic(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if(observer== null) throw new NullPointerException("Null object/observer");

        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to my topic: "+msg);
        this.message = msg;
        notifyObserver();
    }
}
