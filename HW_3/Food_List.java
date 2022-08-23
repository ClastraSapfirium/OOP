package HW_3;

import java.util.ArrayList;
import java.util.List;

public class Food_List<F> {
    List<F> ls = new ArrayList<>();

    public void addFood(F ml){
        ls.add(ml);
    }

    public List<F> getLs(){
        return ls;
    }

    public int size() {
        return ls.size();
    }

    public F get(int i) {
        return ls.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ls.size(); i++) {
            sb.append(ls.get(i).toString() + "\n");
        }
        return sb.toString();
    }
}