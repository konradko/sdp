/*
Question: What is the value of a stub class like WindowAdapter which is composed of methods that do nothing?
Answer: It is a temporary substitute for unfinished code, allows using fully defined interfaces early.
*/

interface WindowListener {
    void windowOpened();
    void windowClosing();
    void windowClosed();
    void windowIconified();
    void windowDeiconified();
    void windowActivated();
    void windowDeactivated();
}

class WindowAdapter implements WindowListener {
    @Override
    public void windowOpened() {}
    @Override
    public void windowClosing() {}
    @Override
    public void windowClosed() {}
    @Override
    public void windowIconified() {}
    @Override
    public void windowDeiconified() {}
    @Override
    public void windowActivated() {}
    @Override
    public void windowDeactivated() {}
}

public class Answer04 {
    WindowAdapter windowAdapter =  new WindowAdapter();
}
