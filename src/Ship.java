import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ship {
    private BoardPlot coordonnee;
    private ShipModel model;
    private Direction direction;

    private List<BoardPlot> listeCases = new ArrayList<>();

    public Ship(BoardPlot c, ShipModel m, Direction d){
        this.coordonnee = c;
        this.model = m;
        this.direction = d;
        this.initListCoord();
    }

    public boolean isOnPlot(BoardPlot plot){
        return (listeCases.contains(plot));
    }

    private void initListCoord(){
        this.listeCases.add(this.coordonnee);
        for (int i = 1; i<this.model.getSize();i++){
            this.listeCases.add(this.listeCases.get(i-1).getPlotTo(this.direction));
        }
    }

    public String afficherPosition(){
        return (this.listeCases.toString());
    }

    @Override
    public String toString() {
        return "Ship{" +
                "coordonnee=" + coordonnee +
                ", model=" + model +
                ", direction=" + direction +
                ", listeCases=" + listeCases +
                '}';
    }
}
