import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom;
    private List<Ship> listeBateaux = new ArrayList<>();

    public Joueur(String nom) {
        this.nom = nom;
    }

    public void ajouterBateaux(Ship bateau){
        this.listeBateaux.add(bateau);
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", listeBateaux=" + listeBateaux +
                '}';
    }
}
