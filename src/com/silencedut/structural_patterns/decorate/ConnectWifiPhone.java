package com.silencedut.structural_patterns.decorate;

/**
 * Created by SilenceDut on 16/6/28.
 */

final class ConnectWifiPhone extends PhoneDecorate {
    ConnectWifiPhone(Phone phone) {
        this.mPhone = phone;
    }
    @Override
    String getFunction() {
        return mPhone.getFunction()+" ,can connect wifi";
    }
}
