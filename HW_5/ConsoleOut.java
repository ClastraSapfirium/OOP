package HW_5;

public class ConsoleOut implements ConsoleOutFixer{

    @Override
    public void write(PhoneBook b) {
        for (Contact item : b.getLs()) {
            System.out.println(item);
        }
    }
}