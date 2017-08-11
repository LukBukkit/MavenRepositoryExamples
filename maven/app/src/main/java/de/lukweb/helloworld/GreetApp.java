package de.lukweb.helloworld;

import java.util.Scanner;

public class GreetApp {

    public static void main(String[] args) {
        System.out.print("Which planet do you want to greet (EARTH): ");

        Scanner scanner = new Scanner(System.in);
        String planetName = scanner.nextLine();

        Planet planet = planetName.trim().isEmpty() ? Planet.EARTH : Planet.getPlanetByName(planetName);
        if (planet == null) {
            System.err.printf("A planet with the name %s doesn't exists", planetName);
            return;
        }

        PlanetGreeter greeter = new PlanetGreeter(planet);
        greeter.greet();
    }

}
