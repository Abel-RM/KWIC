import java.util.Scanner;

public class Mastercontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lines lines = new Lines();
        CircularShift circularShift = new CircularShift();

        System.out.println("Escribe algo:");
        String g = sc.nextLine();
        lines.addObserver(circularShift);
        lines.insert(g);
    }
}
