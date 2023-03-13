public class Person {
    private String name;
    private String surname;
    private int age;
    public Person(String name,String surname,int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return name + ' ' + surname + ' ' + age;
    }

}