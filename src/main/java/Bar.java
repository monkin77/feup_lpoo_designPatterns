import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    private boolean happyHour;
    private List<BarObserver> observers;

    public Bar(){
        this.happyHour = false;
        this.observers = new ArrayList<BarObserver>();
    }

    public boolean isHappyHour(){
        return this.happyHour;
    };

    public void startHappyHour(){
        this.happyHour = true;
        this.notifyObservers();
    };

    public void endHappyHour(){
        this.happyHour = false;
        this.notifyObservers();
    };

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
