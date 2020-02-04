import java.util.Objects;

public class BoardPlot implements Plot{

    private int abscisse;
    private int ordonnee;

    public BoardPlot(int abscisse, int ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    @Override
    public int getAbscisse() {
        return this.abscisse;
    }

    @Override
    public int getOrdonnee() {
        return this.ordonnee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardPlot boardPlot = (BoardPlot) o;
        return abscisse == boardPlot.abscisse &&
                ordonnee == boardPlot.ordonnee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(abscisse, ordonnee);
    }

    @Override
    public BoardPlot getPlotTo(Direction direction) {
        // throw new UnsupportedOperationException();
        switch (direction){
            case NORD:
                return new BoardPlot(this.abscisse - 1, this.ordonnee);
            case SUD:
                return new BoardPlot(this.abscisse + 1, this.ordonnee);
            case EST:
                return new BoardPlot(this.abscisse, this.ordonnee - 1);
            case OUEST:
                return new BoardPlot(this.abscisse, this.ordonnee + 1);
            default:
                return new BoardPlot(0,0);
        }
    }

    @Override
    public String toString() {
        return "BoardPlot{" +
                "abscisse=" + abscisse +
                ", ordonnee=" + ordonnee +
                '}';
    }
}
