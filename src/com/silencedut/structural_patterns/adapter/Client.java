package com.silencedut.structural_patterns.adapter;

/**
 * Created by SilenceDut on 16/6/30.
 */

 class Client {
     static void chargePhone(TwoPinPlug twoPinPlug) {
        twoPinPlug.useTwoPin();
    }
}
