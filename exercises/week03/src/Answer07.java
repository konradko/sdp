/**
 Using the java.util.Observable and java.util.Observer classes/interfaces show how one object
 can be informed of updates to another object.
 */

import java.util.Observable;
import java.util.Observer;

class ObservableExample extends Observable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObservers();
    }
}

class ObserverExample implements Observer {

    private ObservableExample messageUpdate ;

    @Override
    public void update(Observable observable, Object arg)
    {
        messageUpdate = (ObservableExample) observable;
        System.out.println("Message updated: " + messageUpdate.getMessage());
    }
}

public class Answer07 {
    public static void main(String[] args) {
        ObservableExample observable = new ObservableExample();
        ObserverExample observer = new ObserverExample();
        observable.addObserver(observer);
        observable.setMessage("Hello world!");
        observable.setMessage("It's you again?");
    }
}
