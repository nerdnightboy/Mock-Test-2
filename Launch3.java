/*
 * 3. Create a class called Person with private properties like name, age, and address. Provide public getter and setter methods for these properties. Write a program that creates an instance of the Person class, sets values for its properties using the setter methods, and displays the values using the getter methods.
 */

class Person{
    private String name;
    private int age;
    private String address;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}

public class Launch3 {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Satyam");
        p.setAge(21);
        p.setAddress("Jhansi, India");

        System.out.println("My name is : " + p.getName());
        System.out.println("My Age is : " + p.getAge());
        System.out.println("I am from : " + p.getAddress());
    }
}
