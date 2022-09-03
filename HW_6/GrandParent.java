package HW_6;

public class GrandParent extends Relatives {
    Parents momParents;
    Parents dadParents;

    public GrandParent(Parents momParents, Parents dadParents) {
        super();
        this.momParents = momParents;
        this.dadParents = dadParents;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", momParents,dadParents);
    }
}
