package org.simplon.utils.alerts;

import java.time.LocalDateTime;

public class AlertLog implements IAlert {
    @Override
    public void doAlert(String rMsg) {
        System.out.printf("%s : %s%n", LocalDateTime.now().toString(), rMsg);
    }
}
