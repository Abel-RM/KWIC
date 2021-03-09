public class Mastercontrol {
    private static final String ruta = "C:\\Users\\abely\\Desktop\\Maestria\\semestre 2\\Arquitectura\\Proyectos\\Proyecto1\\src\\input2.txt";

    public static void main(String[] args) {
        Line lines = new Line();
        Line linesAlphabetizer = new Line();

        CircularShift cs = new CircularShift(linesAlphabetizer);
        Alphabetizer alphabetizer = new Alphabetizer(linesAlphabetizer);

        lines.addObserver(cs);
        linesAlphabetizer.addObserver(alphabetizer);

        Input.leer(ruta, lines);

        Output.escribir(linesAlphabetizer);
    }
}
