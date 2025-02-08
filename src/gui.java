import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class gui {
    private JButton BtGenerate;
    private JPanel panel1;
    private JTextField TfRandom;
    private JButton BtCopy;
    private JTextArea TaVypis;

    public gui() {
        BtGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randomNumber = random.nextInt(100); // Generuje náhodné číslo mezi 0 a 99
                TfRandom.setText(String.valueOf(randomNumber));
            }
        });

        BtCopy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = TfRandom.getText();
                TaVypis.append(text + "\n");
            }
        });

        TaVypis.setEditable(false);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
