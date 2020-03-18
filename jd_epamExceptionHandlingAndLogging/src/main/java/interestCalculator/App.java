package interestCalculator;
import org.apache.logging.log4j.LogManager;
import java.util.*;
public class App {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(org.homeTask.App.class);
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        logger.info("Enter principal:");
        int principal=sc.nextInt();
        logger.info("Enter Rate:");
        double rate=sc.nextDouble();
        logger.info("Enter Time:");
        int time=sc.nextInt();
        logger.info("\npress 1 for calculating si\npress 2 for calculating ci\n");
        int choice=sc.nextInt();
        calculateInterest c=new calculateInterest();
            try {
                if(choice==1)
                logger.info(c.calculateSi(principal,rate,time));
                else if(choice==2)
                    logger.info(c.calculateCi(principal,rate,time));
            } catch (invalidException e) {
                logger.error(e);
            }

    }
}
