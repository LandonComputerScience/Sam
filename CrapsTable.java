import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

public class CrapsTable
        extends JPanel
        implements ActionListener
{
    private RollingDie die1;
    private RollingDie die2;
    private final int delay = 20;

    private Timer clock;
    private CrapsGame game;
    private DisplayPanel display;

    public CrapsTable(DisplayPanel displ)
    {
        setBackground(Color.green);
        setBorder(new LineBorder(Color.ORANGE.darker(), 3));
        display = displ;
        game = new CrapsGame();
        die1 = new RollingDie();
        die2 = new RollingDie();
        clock = new Timer(20, this);
    }



    public void rollDice()
    {
        RollingDie.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
        die1.roll();
        die2.roll();
        clock.start();
    }


    public void actionPerformed(ActionEvent e)
    {
        if (diceAreRolling())
        {
            if (!clock.isRunning())
                clock.restart();
            if (die1.isRolling()) {
                die1.avoidCollision(die2);
            } else if (die2.isRolling()) {
                die2.avoidCollision(die1);
            }
        }
        else {
            clock.stop();
            int total = die1.getNumDots() + die2.getNumDots();
            int result = game.processRoll(total);
            int point = game.getPoint();
            display.update(result, point);
        }

        repaint();
    }



    public boolean diceAreRolling()
    {
        return (die1.isRolling()) || (die2.isRolling());
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        die1.draw(g);
        die2.draw(g);
    }
}
