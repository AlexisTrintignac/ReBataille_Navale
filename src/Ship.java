import java.util.List;

public class Ship {
    BoardPlot coordonnee;
    ShipModel model;
    Direction direction;

    List<BoardPlot> listeCases;

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
            this.listeCases.add(this.coordonnee.getPlotTo(this.direction));
        }
    }
}
