package com.company.interfaces;

import com.company.model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();
}
