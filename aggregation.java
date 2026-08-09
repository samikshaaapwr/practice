public class aggregation {
    String street;
    String city;
    aggregation(String street, String city){
        this.street = street;
        this.city= city;
    }
    public static void main(String[] args) {

        aggregation a = new aggregation("MG Road", "Mumbai");

        Person p = new Person("Sam", a);

        System.out.println(p.name);
        System.out.println(p.aggregation.street);
        System.out.println(p.aggregation.city);
    }
}
    

class Person{
    String name;
    aggregation aggregation;

    Person( String name,aggregation aggregation){
        this.name = name;
        this.aggregation = aggregation;
    }
}
