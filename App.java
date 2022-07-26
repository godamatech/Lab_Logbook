import javax.swing.*;

public class App extends JFrame {
    JPanel panel;

    JLabell lblName;
    JTextField txtName;

    JButton btnSubmit;

    public App() {

        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        this.add(panel);

        this.setVisible(true);
        this.setSize(200, 120);
        // this.setLocationRelative(null);

    }

    public static void main(String args[]) {

    }
}

/*
 * System.out.println("Assalam");
 * System.out.println("Assalam");
 * System.out.println("Assalam");
 * System.out.println("Assalam");
 * 
 * String str[] = "ABBA ALI";
 * 
 * for (int i = 0; i < 3; i++) {
 * if (str[i].equalsIgnoreCase('a') || str[i].equalsIgnoreCase('e') ||
 * str[i].equalsIgnoreCase('i') || str[i].equalsIgnoreCase('o') ||
 * str[i].equalsIgnoreCase('u')) {
 * continue;
 * } else {
 * // String newStr[]= str.a
 * System.out.println(i);
 * }
 * }
 * // System.out.println(str.substring(0,3) );
 * 
 */