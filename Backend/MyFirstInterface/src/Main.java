import model.Motorcycle;
import model.Plane;
import model.Supercar;


public class Main {
    public static void main(String[] args) {

        Plane airplane = new Plane();
        airplane.fly(50);
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.fly(50);

        Supercar supercar = new Supercar(280);
        supercar.setBrand("Lamborghini");
        supercar.setModel("Huracan");
        supercar.getHasRearCamera(true);
        supercar.getWheelInch(20);
        supercar.addTune(2);
        supercar.startSupercar();


    }
}
