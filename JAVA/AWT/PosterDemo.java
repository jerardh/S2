
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Poster extends Frame {//defining a class that extends Frame

    Label title;

    public Poster() throws HeadlessException {
        setSize(500, 500);//1.Defining size 
        setLayout(new FlowLayout());//2. defining Layout
        setVisible(true);//3. Defining visibility
        title = new Label("Welcome to AWT");//defining and adding elements
        add(title);
        addWindowListener(new WindowManger());
    }

}

class WindowManger extends WindowAdapter {

    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}

class PosterDemo {

    public static void main(String[] args) {
        Poster poster = new Poster();
    }
}
