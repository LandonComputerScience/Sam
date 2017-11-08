import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CrapsStats
        extends JFrame
        implements ActionListener
{
    private CrapsGame game;
    private JTextField numberIn;
    private JTextField statsOut;

    public CrapsStats()
    {
        super("Craps test");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Number of games to run:"));

        numberIn = new JTextField(5);
        numberIn.addActionListener(this);
        c.add(numberIn);

        statsOut = new JTextField(18);
        statsOut.setEditable(false);
        c.add(statsOut);

        game = new CrapsGame();
    }


    public void actionPerformed(ActionEvent e)
    {
        String s = numberIn.getText();
        int nGames = Integer.parseInt(s);
        int gameCount = 0;int winCount = 0;
        Die die1 = new Die();
        Die die2 = new Die();

        while (gameCount < nGames)
        {
            die1.roll();
            die2.roll();
            int total = die1.getNumDots() + die2.getNumDots();
            int result = game.processRoll(total);
            if (result != 0)
                gameCount++;
            if (result > 0)
                winCount++;
        }
        numberIn.setText("");
        statsOut.setText(" Games: " + gameCount + " Wins: " + winCount);
    }

    public static void main(String[] args)
    {
        CrapsStats window = new CrapsStats();
        window.setBounds(100, 100, 300, 100);
        window.setDefaultCloseOperation(3);
        window.setResizable(false);
        window.setVisible(true);
    }
}
