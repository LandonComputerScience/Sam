import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayPanel extends javax.swing.JPanel
{
    private JTextField wonText;
    private JTextField lostText;
    private JTextField pointText;
    private int wonCount;
    private int lostCount;

    public DisplayPanel()
    {
        super(new java.awt.GridLayout(2, 3, 10, 0));
        setBorder(new javax.swing.border.EmptyBorder(0, 0, 5, 0));

        add(new JLabel("    Won:"));
        add(new JLabel("    Lost:"));
        add(new JLabel("    Point:"));

        java.awt.Font displayFont = new java.awt.Font("Monospaced", 1, 16);

        wonText = new JTextField("  0", 5);
        wonText.setFont(displayFont);
        wonText.setEditable(false);
        wonText.setBackground(Color.WHITE);
        add(wonText);

        lostText = new JTextField("  0", 5);
        lostText.setFont(displayFont);
        lostText.setEditable(false);
        lostText.setBackground(Color.WHITE);
        add(lostText);

        pointText = new JTextField(5);
        pointText.setFont(displayFont);
        pointText.setEditable(false);
        pointText.setBackground(Color.DARK_GRAY);
        add(pointText);
    }



    public void update(int result, int point)
    {
        if (result > 0)
        {
            wonCount += 1;
            wonText.setText("  " + wonCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        }
        else if (result < 0)
        {
            lostCount += 1;
            lostText.setText("  " + lostCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        }
        else
        {
            pointText.setText("  " + point);
            pointText.setBackground(Color.YELLOW);
        }
    }
}
