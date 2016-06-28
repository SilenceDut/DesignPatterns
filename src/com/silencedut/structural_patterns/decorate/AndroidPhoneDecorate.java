package com.silencedut.structural_patterns.decorate;

/**
 * Created by SilenceDut on 16/6/28.
 */

class AndroidPhoneDecorate extends PhoneDecorate {

    AndroidPhoneDecorate(Phone phone) {
        this.mPhone = phone;
    }

    @Override
    String getFunction() {
        return "A Android system ,"+mPhone.getFunction();
    }

     String getVersion() {
        return "6.0 marshmallow";
    }
}
