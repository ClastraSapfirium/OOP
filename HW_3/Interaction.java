package HW_3;

public interface Interaction {
    public String callPet(Pets name);
    String playPet(Pets name);
    String FeedPet(Pets name, Meal ml, Volume vl);
}