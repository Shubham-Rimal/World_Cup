package models;

import java.util.ArrayList;

public class Groups {
    String name;

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    String teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Groups(String name, String teams) {
        this.name = name;
        this.teams = teams;
    }

    ArrayList<Teams> team;
}
