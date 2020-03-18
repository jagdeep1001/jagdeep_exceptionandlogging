package area;
import org.apache.logging.log4j.LogManager;
import java.util.Scanner;
public class App {
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(org.homeTask.App.class);
    public static Scanner obj = new Scanner(System.in);
    public static int getMaterial() {
        Logger.info("Choose your material type:\npress 1 for standard material\npress 2 for medium standard material\npress 3 for high standard material\n");
        Logger.info("Enter your material choice:");
        int material = obj.nextInt();
        return material;
    }
    public static void main(String[] args) {
        double area;
        int material;
        String choice;
        boolean automation = false;

        Logger.info("Enter the area of the house: ");
        area = obj.nextDouble();
        material = getMaterial();
        constructionCost c = new constructionCost();
        if (material == 3) {
            Logger.info("Do you want automation:(yes/no)");
            choice = obj.next();
            if (choice.toLowerCase().equals("yes"))
                automation = true;
            else
                automation = false;
        }

        try {
      Logger.info(c.calculateArea(area,material,automation));
        } catch (InvalidMaterialSelect e) {
            Logger.error(e);
        }
    }
}
