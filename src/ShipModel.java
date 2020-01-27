public enum ShipModel {
    PORTE_AVION(5), CROISEUR(4), TORPILLEUR(3),CONTRE_TORPILLEUR(3),SOUS_MARIN(2);

    private final int taille;

    private ShipModel(int taille){
        this.taille = taille;
    }

    public int getSize(){
        return this.taille;
    }
}
