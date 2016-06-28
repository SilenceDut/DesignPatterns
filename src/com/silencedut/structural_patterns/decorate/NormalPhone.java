package com.silencedut.structural_patterns.decorate;

/**
 * Created by SilenceDut on 16/6/28.
 */

final class NormalPhone extends Phone {
    @Override
    String getFunction() {
        return "Can call,send message";
    }
}
