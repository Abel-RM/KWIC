import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CircularShift implements Observer {
    Lines lines = new Lines();
    Alphabetizer alphabetizer = new Alphabetizer();
    public CircularShift(){
        lines.addObserver(alphabetizer);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        String linea=arg.toString();
        ArrayList<String> st = new ArrayList<>(Arrays.asList(linea.split(" ")));
        ArrayList<String> resultado= new ArrayList<>();

        String temp = "";

        for (String item : st){
            temp += item + " ";
        }
        resultado.add(temp);
        for(int i = 0; i< st.size()-1; i++){
            temp = cambiar(st);
            resultado.add(temp);
        }

        for (String item: resultado){
            lines.insert(item);
        }

    }
    public static String cambiar(ArrayList<String> palabras){
        String primera = palabras.get(0);
        palabras.remove(0);
        palabras.add(primera);
        String res = "";
        for (String p: palabras){
            res += p + " ";
        }
        return res;
    }

    public Alphabetizer getAlphabetizer() {
        return alphabetizer;
    }
}
