package com.silencedut.structural_patterns.decorate;

/**
 * Created by SilenceDut on 16/6/28.
 */

public class DecorateTest {
    public static void main(String[] args) {
        Phone phone = new NormalPhone();
        phone = new ConnectWifiPhone(phone);
        phone = new AndroidPhoneDecorate(phone);
        System.out.println(phone.getFunction());
        System.out.println(((AndroidPhoneDecorate) phone).getVersion());
        Phone phone2= new NormalPhone();
        phone2 = new IosPhoneDecorate(phone2);
        System.out.println(phone2.getFunction());
        System.out.println(((IosPhoneDecorate) phone2).getSystem());
    }
}
