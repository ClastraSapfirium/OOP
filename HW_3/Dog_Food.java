package HW_3;

public class Dog_Food extends Meal{
    private String pet_type;
    
    public Dog_Food(String tp, double pr, int vl) {
        super.meal_type = tp;
        super.price = pr;
        super.volume = vl;
        pet_type="Собака";
    }

    public String getPet_type() {
        return pet_type;
    }
    
}