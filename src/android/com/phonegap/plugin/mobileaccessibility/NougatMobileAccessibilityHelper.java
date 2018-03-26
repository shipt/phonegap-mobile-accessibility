package com.phonegap.plugin.mobileaccessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

@TargetApi(Build.VERSION_CODES.N)
public class NougatMobileAccessibilityHelper extends
    MarshmallowMobileAccessibilityHelperBeanMobileAccessibilityHelper {

        @Override
        public void initialize(MobileAccessibility mobileAccessibility) {
            super.initialize(mobileAccessibility);
            mParent = mView.getParentForAccessibility();
        }
    }
