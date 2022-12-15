package org.simplon.utils.alerts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AlertMe {
    @Deprecated
    public void doAlert(String rMsg, int rLevel) throws IOException {
        switch (rLevel) {
            case 1 -> System.out.println(rMsg);
            case 2 -> {
                String fileName = "err_msg.log";
                BufferedWriter writer = null;
                FileWriter fw = new FileWriter(fileName, true);
                writer = new BufferedWriter(fw);
                writer.append(LocalDateTime.now().toString()).append(" : ");
                writer.append(rMsg);
                writer.append('\n');
                writer.close();
            }
            default -> System.out.println("Unexpected level");
        }
    }
}
