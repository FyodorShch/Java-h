import java.util.Scanner;

public class laptop {
    public static void main(String[] args) {
        Ram rom = new Ram();
        rom.displayInfo();

        HDC hdc = new HDC();
        hdc.displayInfo();

        OS os = new OS();
        os.displayInfo();

        Col color = new Col();
        color.displayInfo();
    }
}