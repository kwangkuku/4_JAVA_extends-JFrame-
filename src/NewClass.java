import javax.swing.*;
/**
 *
 * @author Kwanrudee
 */
public class NewClass extends JFrame{
    public static void main(String[] args) {
        NewClass  frameTabel = new NewClass();
    }
    
    JLabel welcome = new JLabel("Welcome to Java");
    JPanel panel = new JPanel();
    
    NewClass() {
        super("Java");
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout(null);
        
        welcome.setBounds(70, 50, 150, 60);
        
        panel.add(welcome);
        
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

