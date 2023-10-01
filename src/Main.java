import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> actions = new ArrayList<>();
        int R = 2500;
        int t = 5; //Pressing time limit
        int deltaTime = R/100;

        // An array of the time when the button was pressed.
        // NEGATIVE number is the time of pressing to open
        // POSITIVE number is the time of pressing to close
        actions.add(15 * deltaTime);
        actions.add(-2 * deltaTime);
        actions.add(20 * deltaTime);
        actions.add(10 * deltaTime);
        actions.add(-2 * deltaTime);

        Window window = new Window(actions, R, t, deltaTime);
        Open open = new Open(window);
        Close close = new Close(window);
        new Thread(open).start();
        new Thread(close).start();
    }
}