package Laba27;

public class Person {
    final private String name;
    final private String secondName;
    final private String lastName;

    public Person(String name, String secondName, String lastName) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringBuffer(lastName).append(" ")
                .append(!name.isEmpty() ? name.charAt(0) + "." : "")
                .append(!secondName.isEmpty() ? secondName.charAt(0) + ".": "").toString();
    }
}