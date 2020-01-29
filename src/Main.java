public class Main {

    public static void main(String[] args) {
        Joueur j1 = new Joueur("J1");
        Joueur j2 = new Joueur("J2");
        Ship Porte_Avion1 = new Ship(new BoardPlot(2,3),ShipModel.PORTE_AVION,Direction.SUD);
        Ship Porte_Avion2 = new Ship(new BoardPlot(1,1),ShipModel.PORTE_AVION,Direction.EST);
        Ship Torpilleur1 = new Ship(new BoardPlot(9,1),ShipModel.TORPILLEUR,Direction.NORD);
        Ship Torpilleur2 = new Ship(new BoardPlot(1,7),ShipModel.TORPILLEUR,Direction.OUEST);
        j1.ajouterBateaux(Porte_Avion1);
        j1.ajouterBateaux(Torpilleur1);
        j2.ajouterBateaux(Porte_Avion2);
        j2.ajouterBateaux(Torpilleur2);
    }
}
