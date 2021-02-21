import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CircularShift implements Observer {
    private final Lines lines;

    public CircularShift(Lines lines){
        this.lines = lines;
    }
    @Override
    public void update(Observable o, Object arg) {
        String linea=arg.toString();
        ArrayList<String> st = new ArrayList<>(Arrays.asList(linea.split(" ")));
        ArrayList<String> resultado= new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        for (String item : st){
            temp.append(item).append(" ");
        }
        resultado.add(temp.toString());
        for(int i = 0; i< st.size()-1; i++){
            temp = new StringBuilder(cambiar(st));
            resultado.add(temp.toString());
        }

        for (String item: resultado){
            lines.insert(item);
        }

    }
    public static String cambiar(ArrayList<String> palabras){
        String primera = palabras.get(0);
        palabras.remove(0);
        palabras.add(primera);
        StringBuilder res = new StringBuilder();
        for (String p: palabras){
            res.append(p).append(" ");
        }
        return res.toString();
    }

}
