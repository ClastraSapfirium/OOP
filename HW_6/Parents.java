package HW_6;

public class Parents extends Relatives {
    Person father;
    Person mother;

    public Parents(Person father, Person mother) {
        super();
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        String f = father==null ? "Нет отца": father.toString();
        String m = mother==null ? "Нет матери": mother.toString();
        return String.format("%s\n%s", f, m);
    }
}
