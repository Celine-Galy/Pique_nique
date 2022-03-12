package piquenique.models;

public enum Cadeau {

    PANIER(1,"Panier pique-nique en osier"),
    COUVERTS(2, "Couverts en bambou"),
    NAPPE(3, "Nappe");

    private Integer id;
    private String value;

    Cadeau(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
