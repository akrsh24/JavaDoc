package model;

public class Person {
private int name;

@Override
public String toString() {
	return "Person [name=" + name + "]";
}

public Person(int account) {
    this.name = account;
}

public int getName() {
    return name;
}

public void setName(int name) {
    this.name = name;
}

}