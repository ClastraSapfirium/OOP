package HW_3;

public class Person implements Interaction{
   
    @Override
    public String callPet(Pets pet) {
        if(pet instanceof Cat) System.out.println("Кис-Кис");
        return pet.ifWantPlay() ? pet.answer : (pet.name + " не отзывается");
    }

    @Override
    public String playPet(Pets pet) {
        String res="";
        if(!pet.ifWantPlay()) return pet.name + " не хочет играть";
        if(pet instanceof Cat) res = "Играем с игрушкой";
        if(pet instanceof Dog) res = "Играем с игрушкой";
        return res;
    }

    @Override
    public String FeedPet(Pets pet, Meal ml, Volume vl) {
        String res="";
        if(!pet.ifWantEat()) return pet.name + " не хочет кушать";
        if(pet instanceof Cat && ml instanceof Cat_Food) {
            res = ml.toString()+" "+vl.toString(); 
        }
        if(pet instanceof Dog) res = "Кормим собаку";
        return res;
    }
}