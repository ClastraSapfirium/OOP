package HW_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.nonNull;

public class Person {
    
    private String fullName;
    private LocalDate birthdate;
    private List<Person> children = new ArrayList<>();
    private Parents papamama;
    private Gender gender;

    public Person(String fullName, LocalDate birthdate, Gender gn) {
        this.fullName = fullName;
        this.birthdate = birthdate;
        gender = gn;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<Person> getChildren() {
        return children;
    }
    public Parents getParents() {
        return papamama;
    }
    public GrandParent getGrandParents(){  
        return new GrandParent(papamama.mother.getParents(), papamama.father.getParents());
    }

    public Gender getGender() {
        return gender;
    }

    public void appendToFamily(Person p) {
        if (nonNull(p) && !p.equals(this) && birthdate.isBefore(p.getBirthdate()))
            children.add(p);
    }

    public void setPapamama(Parents papamama) {
        this.papamama = papamama;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", fullName,birthdate,gender);
    }
}