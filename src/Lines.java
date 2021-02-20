import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Lines extends Observable {
    ArrayList<String> lineas = new ArrayList<>();

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    public void insert(String linea){
        lineas.add(linea);
        setChanged();
        notifyObservers(linea);
    }
    public void delete(String linea){
        lineas.remove(linea);

    }
}
