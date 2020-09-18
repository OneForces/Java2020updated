package Laba2;

public class Dog {
    private String name;
    private int age;

    Dog(String n, int a){
    setName(n);
    setAge(a);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public int pesAgeSeven() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
