
import java.awt.*;
import java.awt.event.*;

class Login extends Frame implements ActionListener {

    TextField userName;
    Label textLabel;
    Button click;

    Login() {
        setLayout(new GridLayout(3,1));
        setSize(800, 800);
        setVisible(true);
        userName = new TextField(20);
        textLabel = new Label("");
        click = new Button("Click me");
        click.addActionListener(this);
        add(userName);
        add(textLabel);
        add(click);
        addWindowListener(new MyWindowManger());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textLabel.setText(userName.getText());
    }

}

class MyWindowManger extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class LoginDemo {

    public static void main(String[] args) {
        Login login = new Login();
    }
}
