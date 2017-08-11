package de.lukweb.helloworld;

public enum Planet {

    MERCURY,
    VENUS,
    EARTH("World"),
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE;

    private String nickname;

    Planet() {
        nickname = capitalizeFirst(name());
    }

    Planet(String nickname) {
        this.nickname = nickname;
    }

    private String capitalizeFirst(String string) {
        return string.substring(0, 1) + string.substring(1).toLowerCase();
    }

    public String getNickname() {
        return nickname;
    }

    public static Planet getPlanetByName(String name) {
        try {
            return valueOf(name.trim().toUpperCase());
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }
}
