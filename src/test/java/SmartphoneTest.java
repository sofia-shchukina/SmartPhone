import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @org.junit.jupiter.api.Test
    void startRadio() {
        Smartphone testSmartphone = new Smartphone();
        boolean result = testSmartphone.startRadio();
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void stopRadio() {
        Smartphone testSmartphone = new Smartphone();
        boolean result = testSmartphone.stopRadio();
        Assertions.assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void getPosition() {
        Smartphone testSmartphone = new Smartphone();
        String result = testSmartphone.getPosition();
        Assertions.assertEquals("Mainz",result);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Contact acquaintance1 = new Acquaintance("Maria");
        Contact friend1 = new Friend("Peter","01763504857");
        Contact friend2 = new Friend("Lisa","01523500954");
        Contact [] contactBase = {acquaintance1, friend1, friend2};
        Smartphone testSmartphone = new Smartphone("Pixel", "Microsoft",contactBase);

        String result = testSmartphone.toString();
        Assertions.assertEquals("Smartphone{modelName='Pixel', manufacturerName='Microsoft', contacts=" +
                        "[Acquaintance{name='Maria'}, Friend{phoneNumber='01763504857', name='Peter'}, " +
                        "Friend{phoneNumber='01523500954', name='Lisa'}]}",
        result);

    }
}