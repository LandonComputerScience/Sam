import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Craps
        extends JFrame
{
    public Craps()
    {
        super("Craps");

        DisplayPanel display = new DisplayPanel();
        CrapsTable table = new CrapsTable(display);
        ControlPanel controls = new ControlPanel(table);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new EmptyBorder(0, 5, 0, 5));
        panel.add(display, "North");
        panel.add(table, "Center");
        panel.add(controls, "South");

        Container c = getContentPane();
        c.add(panel, "Center");
    }

    public static void main(String[] args)
    {
        Craps window = new Craps();
        window.setBounds(100, 100, 320, 240);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
