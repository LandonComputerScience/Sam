import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;



public class ControlPanel
        extends JPanel
        implements ActionListener
{
    private CrapsTable table;

    public ControlPanel(CrapsTable t)
    {
        table = t;
        JButton rollButton = new JButton("Roll");
        rollButton.addActionListener(this);
        add(rollButton);
    }


    public void actionPerformed(ActionEvent e)
    {
        if (!table.diceAreRolling()) {
            table.rollDice();
        }
    }
}
