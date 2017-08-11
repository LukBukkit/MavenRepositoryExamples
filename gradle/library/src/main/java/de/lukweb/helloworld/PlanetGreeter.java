package de.lukweb.helloworld;

public class PlanetGreeter {

    private Planet planet;

    public PlanetGreeter() {
        this(Planet.EARTH);
    }

    public PlanetGreeter(Planet planet) {
        this.planet = planet;
    }

    public void greet() {
        System.out.println("Hello " + planet.getNickname());
    }
}
