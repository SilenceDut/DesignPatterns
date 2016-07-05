package com.silencedut.structural_patterns.adapter;

/**
 * Created by SilenceDut on 16/6/30.
 */

 class TwoPlugAdapter extends TwoPinPlug {
    private ThreePinPlug mThreePinPlug;
     TwoPlugAdapter(ThreePinPlug threePinPlug) {
        mThreePinPlug = threePinPlug;
    }

    @Override
    void useTwoPin() {
        mThreePinPlug.useThreePlug();
    }
}
