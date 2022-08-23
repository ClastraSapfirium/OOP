package HW_3;

public enum VolumeType {
    PACKAGE("Коробка"), BOTTLE("Стакан"), SPOON("Вилка");
    private String name;
    
    private VolumeType(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
   
}