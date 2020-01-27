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
    public Plot getPlotTo(Direction direction) {
        throw new UnsupportedOperationException();
    }
}
