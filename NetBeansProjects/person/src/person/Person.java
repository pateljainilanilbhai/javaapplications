package person;
public class Person {
int age;
String name;
float salary;
    public Person(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public Person() {
    }

    @Override
    public String toString() {
       String a=" name= "+name+" age= "+age+" salary= "+salary;
        return a; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person(18,"patel",100000);
        Person q = new Person(19,"jainil",200000);
        Person r = new Person(20,"Anilbhai",300000);
       System.out.println(p.toString());
       System.out.println(q.toString());
       System.out.println(r.toString());
        
    }
    
}
