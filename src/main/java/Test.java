import computer.Ecran;
import computer.UniteCentre;
import computer.VideoProjecteur;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre= new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");
    }

}
