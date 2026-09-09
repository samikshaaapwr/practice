class Student {
    private int age;

    //Getter
    public int getAge(){
        return age;
    }

    //Setter
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println(s.getAge());

    }
}