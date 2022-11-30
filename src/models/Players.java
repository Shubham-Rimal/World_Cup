package models;

public class Players {
    public Players(String name, int age, int rating, int id) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.id = id;
    }

    String name;
    int age;
    int rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
