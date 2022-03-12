package piquenique.services;

import piquenique.models.Panier;

public enum PanierActions implements ServiceAction {

    ADD_NBR_PERS("1","Indiquer pour combien de personnes doit être crée le panier pique-nique:"),
    SELECT_PIQUENIQUE("2","Veuillez sélectionner un pique-nique dans la liste suivante:"),
    OPTION_BOTTLE("3","Souhaitez-vous ajouter une bouteille de vin ou de champagne (o/n) ?"),
    CHOICE_BOTTLE("4","Entrez le numéro de la bouteille choisie"),
//    MODIFY_TITLE("5","Modifier le titre d'un film"),
   /* LIST_UNSEEN_FILMS("6","Lister les films non-vus"),
    LIST_SEEN_FILMS("7","Lister les films vus"),
    ORDER_FILMS("8","Trier les films par ordre alphabétique"),*/
    EXIT(ActionConstants.EXIT_ID, ActionConstants.EXIT_ACTION);;

    private String value;
    private String title;

    PanierActions(String value, String title) {
        this.value = value;
        this.title = title;
    }
    public static boolean containsAction(String value) {
        PanierActions[] actions = PanierActions.values();

        for (PanierActions action : actions) {
            if (action.getValue().equalsIgnoreCase(value)) {
                return true;
            }
        }

        return false;
    }


    public String getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return value + " - " + title;
    }

}
