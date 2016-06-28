package com.silencedut.structural_patterns.decorate;

/**
 * Created by SilenceDut on 16/6/28.
 */

class IosPhoneDecorate extends PhoneDecorate {
    IosPhoneDecorate(Phone phone) {
        this.mPhone = phone;
    }
    @Override
    String getFunction() {
        return "A ios system ,"+mPhone.getFunction();
    }

    String getSystem() {
        return "ios";
    }
}
