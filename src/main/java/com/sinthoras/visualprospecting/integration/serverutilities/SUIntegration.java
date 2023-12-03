package com.sinthoras.visualprospecting.integration.serverutilities;

import com.sinthoras.visualprospecting.Utils;
import com.sinthoras.visualprospecting.integration.serverutilities.proxy.SUProxyBase;
import com.sinthoras.visualprospecting.integration.serverutilities.proxy.SUProxyCommon;

public class SUIntegration {

    public static final SUProxyBase proxy = createProxy();

    private static SUProxyBase createProxy() {
        if (Utils.isServerUtilitiesInstalled()) {
            return new SUProxyCommon();
        } else {
            return new SUProxyBase();
        }
    }
}
