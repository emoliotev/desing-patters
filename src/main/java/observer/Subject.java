package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void setStateChange(boolean state){
        if(state){
            notifyObservers();
        }
    }

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }
    public void unRegisterObserver(Observer observer){
        observerList.remove(observerList.indexOf(observer));
    }
    public void notifyObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }


}

