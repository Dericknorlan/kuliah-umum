public class Zuko {
    String name;
    String birthday;
    String biography;

    public Zuko() {
    }

    public Zuko(String name, String birthday, String biography) {
        this.name = name;
        this.birthday = birthday;
        this.biography = biography;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
