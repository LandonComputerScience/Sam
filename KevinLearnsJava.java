import java.util.Scanner;

public class KevinLearnsJava
{
    public static int getMonth()
    {
        double knowledgeGrowth = 0.10;
        int months = 0;
        double knowledge = 0;

        while(knowledge < 0.95)
        {
        knowledge = knowledge + (1-knowledge)*knowledgeGrowth;
        months++;
    }
        return months;
    }
    public static void main(String [] args)
    {
        int months=getMonth();
        int years = months/12;
        months -= 12*years;

        System.out.println("It will take Kevin " + years + " years & "+ months+ " months to learn Java.");
    }

}