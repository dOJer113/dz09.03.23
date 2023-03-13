import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    int wordsInSurname;

    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getSurName().split(" ").length < wordsInSurname && o2.getSurName().split(" ").length < wordsInSurname) ||
                (o1.getSurName().split("-").length < wordsInSurname && o2.getSurName().split("-").length < wordsInSurname)) {
            if (o1.getSurName().length() > o2.getSurName().length()) {
                return 1;
            }
            if (o1.getSurName().length() < o2.getSurName().length()) {
                return -1;
            }
            if (o1.getSurName().length() == o2.getSurName().length()) {
                return o1.getAge() - o2.getAge();
            }
            return 0;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }

    public PersonComparator(int wordsInSurname) {
        this.wordsInSurname = wordsInSurname;
    }
}
