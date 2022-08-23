package HW_3;

public class Program {
    
    public static void main(String[] args) {
        Pets cat1 = new Cat("Musya");
        Person prs1 = new Person();

       Cat_Food catml1 = new Cat_Food("Филе", 200, 100);
       Cat_Food catml2 = new Cat_Food("Рыба", 150, 50);
       Cat_Food catml3 = new Cat_Food("Говядина", 400, 200);
       Dog_Food dogml1 = new Dog_Food("Каша",100, 300);
       Dog_Food dogml2 = new Dog_Food("Сухой корм", 250, 200);
       Dog_Food dogml3 = new Dog_Food("Говядина", 600, 500);
 
       Food_List<Cat_Food> mlc1 = new Food_List<>();
       mlc1.addFood(catml1);
       mlc1.addFood(catml2);
       mlc1.addFood(catml3);
       Food_List<Dog_Food> mld1 = new Food_List<>();
       mld1.addFood(dogml1);
       mld1.addFood(dogml2);
       mld1.addFood(dogml3);
       String r = prs1.FeedPet(cat1, mlc1.get(0), new Volume(VolumeType.PACKAGE,1));
       System.out.println(r);
    }  
}