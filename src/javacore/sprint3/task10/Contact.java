package javacore.sprint3.task10;

public abstract class Contact {

    String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sendMessage();

    abstract void print();
}
