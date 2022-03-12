package piquenique.models;

public class PiqueNique {

    private Integer id;
    private String name;
    private static Double price;

    public PiqueNique() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Double getPrice() {
        return price;
    }

    public static void setPrice(Double price) {
        PiqueNique.price = price;
    }

    @Override
    public String toString() {
        return "PiqueNique{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
