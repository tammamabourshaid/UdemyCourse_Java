package lectures.interface_lec.exercise;

import lectures.interface_lec.DeskPhone;
import lectures.interface_lec.ITelephone;
import lectures.interface_lec.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Apparatus application;
        Pc pc = new Pc();
        pc.keyboard();
        pc.poweron(true);
        pc.screen();
        pc.wide();

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }

}
