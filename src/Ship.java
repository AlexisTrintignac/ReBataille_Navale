import java.util.List;

public class Ship {
    Plot coordonnee;
    ShipModel model;
    Direction direction;

    List<Plot> listeCases;

    public Ship(Plot c, ShipModel m, Direction d){
        this.coordonnee = c;
        this.model = m;
        this.direction = d;
    }

    public boolean isOnPlot(Plot plot){
        if (this.listeCases.contains(plot)){
            return true;
        } else {
            return false;
        }
    }
}
