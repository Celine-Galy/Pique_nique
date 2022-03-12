package piquenique.models;

import java.util.UUID;

public class Panier {
    private final UUID id;
    private final Double basePrice;
    private Integer peopleNbr;
    private String piqueNique;
    private String cadeau;

    public Panier(Double basePrice, UUID id, Integer peopleNbr, String piqueNique, String cadeau) {
        this.id =  UUID.randomUUID();;
        this.basePrice = Double.valueOf(10);
        this.peopleNbr = peopleNbr;
        this.piqueNique = piqueNique;
        this.cadeau = cadeau;
    }

    public UUID getId() {
        return id;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public Integer getPeopleNbr() {
        return peopleNbr;
    }

    public void setPeopleNbr(Integer peopleNbr) {
        this.peopleNbr = peopleNbr;
    }

    public String getPiqueNique() {
        return piqueNique;
    }

    public void setPiqueNique(String piqueNique) {
        this.piqueNique = piqueNique;
    }

    public String getCadeau() {
        return cadeau;
    }

    public void setCadeau(String cadeau) {
        this.cadeau = cadeau;
    }

    @Override
    public String toString() {
        return "Panier{" +
                "id=" + id +
                ", basePrice=" + basePrice +
                ", peopleNbr=" + peopleNbr +
                ", piqueNique='" + piqueNique + '\'' +
                ", cadeau='" + cadeau + '\'' +
                '}';
    }
}
