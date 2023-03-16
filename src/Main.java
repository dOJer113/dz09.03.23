import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> list  = new ArrayList<>();
        list.add(new Person("Саша","Иванов",23));
        list.add(new Person("Маша","Ярович",11));
        list.add(new Person("Паша","Синявко",4));
        list.add(new Person("Вася","Як Петров",10));
        list.add(new Person("Катя","Иванова-Водкина-Матыцина",9));
        System.out.println(list);
        Comparator<Person> comporator = (Person o1, Person o2)->{
            if ((o1.getSurName().split(" ").length < 2 && o2.getSurName().split(" ").length < 2) ||
                    (o1.getSurName().split("-").length < 2 && o2.getSurName().split("-").length < 2)) {
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
        };
        Collections.sort(list,comporator);
        System.out.println(list);
    }
}