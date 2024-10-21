public class Customer2 {
    private String name;
    private int id;
    private char gender;

    public Customer2(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return name+"("+id+")";
    }
}
