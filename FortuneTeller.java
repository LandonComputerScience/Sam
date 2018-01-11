
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;


    public class FortuneTeller extends JFrame
            implements ActionListener
    {
        private static final EasySound ding = new EasySound("/Users/samueltaishoff/IdeaProjects/FortuneTeller/src/ding.wav");

        String[] fortunes = {"You dumb", "CS LUL", "Press \"Next\" to see your fortune...Lul","You suck","Carter's pretty cool","Nikola is playing video games", "League sucks","I wanna play dota", "Computers will take over the world"};

        private JTextField display;

        public FortuneTeller()
        {
            super("Fortune Teller");

            display = new JTextField("  Press \"Next\" to see your fortune...", 25);
            display.setBackground(Color.RED);
            display.setEditable(false);

            JButton go = new JButton("Next");
            go.addActionListener(this);

            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            c.add(display);
            c.add(go);
        }

        public void actionPerformed(ActionEvent e)
        {
            double x = Math.random()*fortunes.length;
            int y= (int)(x);
            display.setText("  " + fortunes[y]);
            ding.play();
        }

        public static void main(String[] args)
        {
            JFrame window = new FortuneTeller();
            window.setBounds(300, 300, 300, 100);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setResizable(false);
            window.setVisible(true);
        }
    }
