import java.io.PrintStream;

public class DieTest { public DieTest() {}

    public static void main(String[] args) { Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
    }
}
