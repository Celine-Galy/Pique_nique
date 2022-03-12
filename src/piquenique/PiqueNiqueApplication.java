package piquenique;

import piquenique.services.PanierService;
import piquenique.utils.ConsoleManager;

public class PiqueNiqueApplication {

    public static void main(String[] args) {

        PanierService panier = new PanierService();
        panier.run();

    }
}
