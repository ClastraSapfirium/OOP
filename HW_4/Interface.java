package HW_4;

import java.util.ArrayList;
import java.util.List;


public class Interface<T extends Task> {
    List<T> db;

    public Interface() {
        this.db = new ArrayList<>();
    }

    public void addTask(T task) {
        db.add(task);
    }

    public void removeTask(int index) {
        db.remove(index - 1);
    }

    public int count() {
        return db.size();
    }

    public T get(int index) {
        return db.get(index - 1);
    }
    
    public void PrintTaskList() {
        for (int i = 0; i < db.size(); i++) {
            System.out.printf("Номер: %d, %s", (i + 1), db.get(i));
        }
    }
}
