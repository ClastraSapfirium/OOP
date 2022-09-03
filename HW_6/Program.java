package HW_6;

import java.time.LocalDate;
import java.time.Month;

public class Program {
    public static void main(String[] args) {
        Person Marina = new Person("Марина", LocalDate.of(1964, Month.AUGUST, 9), Gender.FEMALE);
        Person Ihar = new Person("Игорь", LocalDate.of(1970, Month.DECEMBER, 13), Gender.MALE);
        Person Petya = new Person("Пётр", LocalDate.of(1824, Month.MAY, 7), Gender.MALE);
        Person Masha = new Person("Маша", LocalDate.of(1817, Month.JULY, 17), Gender.FEMALE);
        Person Vlad = new Person("Владислав", LocalDate.of(2002, Month.APRIL, 25),Gender.MALE);
        Parents parIhar = new Parents(Petya, Masha);
        Parents parVlad = new Parents(Ihar, Marina);
        Parents parMarina = new Parents(null, null);
        
        Vlad.setPapamama(parVlad);
        Ihar.setPapamama(parIhar);
        Marina.setPapamama(parMarina);
        System.out.println(Vlad.getGrandParents());
    }
}