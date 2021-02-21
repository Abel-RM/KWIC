import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Alphabetizer implements Observer {
    private final Lines lineas;

    public Alphabetizer(Lines lineas) {
        this.lineas = lineas;
    }

    @Override
    public void update(Observable o, Object arg) {
        Collections.sort(lineas.getAll());
    }

}
