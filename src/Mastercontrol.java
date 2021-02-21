public class Mastercontrol {
    private static final String ruta = "C:\\Users\\abely\\Desktop\\Maestria\\semestre 2\\Arquitectura\\Proyectos\\Proyecto1\\src\\input.txt";

    public static void main(String[] args) {
        Lines lines = new Lines();
        Lines linesAlphabetizer = new Lines();

        CircularShift cs = new CircularShift(linesAlphabetizer);
        Alphabetizer alphabetizer = new Alphabetizer(linesAlphabetizer);

        lines.addObserver(cs);
        linesAlphabetizer.addObserver(alphabetizer);

        Input.leer(ruta, lines);

        Output.escribir(linesAlphabetizer);
    }
}
