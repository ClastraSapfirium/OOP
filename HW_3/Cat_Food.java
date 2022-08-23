package HW_3;

public class Cat_Food extends Meal {
    private String pet_type;
    
    public Cat_Food(String sm, double sp, int pt) {
        super.meal_type = sm;
        super.price = sp;
        super.volume = pt;
        pet_type="Кот";
    }

    public String getPet_type() {
        return pet_type;
    }
    
}