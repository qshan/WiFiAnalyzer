package com.vrem.wifianalyzer.wifi.scanner;

import android.support.annotation.NonNull;

import com.vrem.wifianalyzer.wifi.model.WiFiData;

public interface UpdateNotifier {
    void update(@NonNull WiFiData wiFiData);
}