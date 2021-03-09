import java.util.*;

@SuppressWarnings("deprecation")
public class Alphabetizer implements Observer {
    class Ordenamiento implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.toLowerCase().compareTo(o2.toLowerCase());
        }
    }

    private final Line lineas;

    public Alphabetizer(Line lineas) {
        this.lineas = lineas;
    }

    @Override
    public void update(Observable o, Object arg) {
        lineas.getAll().sort(new Ordenamiento());
    }

}
