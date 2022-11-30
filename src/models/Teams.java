package models;

public class Teams {
    String name;
    String jerseyColour;
    int fifaPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJerseyColour() {
        return jerseyColour;
    }

    public void setJerseyColour(String jerseyColour) {
        this.jerseyColour = jerseyColour;
    }

    public int getFifaPosition() {
        return fifaPosition;
    }

    public void setFifaPosition(int fifaPosition) {
        this.fifaPosition = fifaPosition;
    }

    public Teams(String name, String jerseyColour, int fifaPosition) {
        this.name = name;
        this.jerseyColour = jerseyColour;
        this.fifaPosition = fifaPosition;
    }
}
