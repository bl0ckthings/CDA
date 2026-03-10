import model.Car;
import model.Patient;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setFirstName("Kolu");
        System.out.println(patient.getFirstName());
        Patient patient1 = new Patient();
        patient1.setFirstName("Clara");

        Vehicle vehicle = new Car();

    }
}
