package Lectures.ReferenceObjectInstanceClass;

public class Main {
    public static void main(String[] args) {
        House bluehouse= new House("blue");
        System.out.println("Blue House1 "+ bluehouse.getColor());

        House anotherHouse = bluehouse;
        System.out.println("another House1 " + anotherHouse.getColor());

        anotherHouse.setColor("red");
        System.out.println("Blue House2 "+ bluehouse.getColor());
        System.out.println("another House2 " + anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println("Blue House3 "+ bluehouse.getColor());
        System.out.println("another House3 " + anotherHouse.getColor());
        System.out.println("green House3 " + greenHouse.getColor());
    }
}
