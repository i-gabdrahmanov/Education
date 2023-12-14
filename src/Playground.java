import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class Playground {
    public static void main(String[] args) {
        var b = 5.0F;
        var result = b/0;

        System.out.println(result);
        /*try {
            System.out.println("1");
            int a = 2 / 0;
            System.out.println("2");
        } catch (IllegalArgumentException e) {
            System.out.println("3");
        } catch (NullPointerException e) {
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
        } finally {
            System.out.println("6");
        }*/

    }
}



