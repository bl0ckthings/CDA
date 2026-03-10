package model;

import interfaces.Boostable;

public class Supercar extends Car implements Boostable {
        private String maxSpeed;


    public Supercar(int maxSpeed) {

    }

    public void startSupercar() {
            System.out.println("Supercar has been started. Let the engine warmup before pushing hard.");
        }

        public void addTune(int stage) {
        System.out.println("Stage " + stage + " Tune has been added to your ECU");
        }

}
