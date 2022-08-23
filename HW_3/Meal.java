package HW_3;

public abstract class Meal {
    String meal_type;
    double price;
    int volume;

    @Override
    public String toString() {
        
        return String.format("Наименование корма: %s, цена: %f, количетво: %d\n", meal_type,price,volume);
    }

}