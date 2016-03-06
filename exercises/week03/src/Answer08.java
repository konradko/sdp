/**
 Question: “The Observer pattern supports the MVC pattern”. State if this statement is true or false
 and support your answer by use of an appropriate example.

 Answer: It's true, example provided below
 */
import java.util.Observable;
import java.util.Observer;

class Model extends Observable {
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

class View {
    public void displayMessage(String message) {
        System.out.println("Message: " + message);
    }
}

class Controller implements Observer {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.addObserver(this);
    }

    public void setModelMessage(String message) {
        model.setMessage(message);
    }

    public String getModelMessage() {
        return model.getMessage();
    }

    public void updateView() {
        view.displayMessage(getModelMessage());
    }

    @Override
    public void update(Observable observable, Object arg)
    {
        model = (Model) observable;
        updateView();
    }
}

public class Answer08 {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.setModelMessage("Hello world!");
        controller.setModelMessage("It's you again?");
    }
}
