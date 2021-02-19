import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CircularShift implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Circular shift fue notificado");
    }
}
