package Lectures.Interface.Exercise;

public class Pc implements Apparatus {

    @Override
    public void screen() {
        System.out.println("screen");
    }

    @Override
    public void keyboard() {
        System.out.println("keyboard");
    }

    @Override
    public void poweron(boolean on) {
        if (on==true)
        System.out.println("powerON");
    }

    @Override
    public void wide() {
        System.out.println("wide");
    }
}
