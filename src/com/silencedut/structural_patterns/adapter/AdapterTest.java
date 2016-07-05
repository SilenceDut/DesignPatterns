package com.silencedut.structural_patterns.adapter;

/**
 * Created by SilenceDut on 16/6/30.
 */

public class AdapterTest {
    public static void main(String[] args) {
        ThreePinPlug threePinPlug = new ThreePinPlug();
        TwoPlugAdapter twoPlugAdapter = new TwoPlugAdapter(threePinPlug);
        Client.chargePhone(twoPlugAdapter);
    }

}
