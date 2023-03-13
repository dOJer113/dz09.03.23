import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list,new PersonComparator(2));
        System.out.println(list);
    }
}