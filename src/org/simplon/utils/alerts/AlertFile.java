package org.simplon.utils.alerts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AlertFile implements IAlert {


    @Override
    public void doAlert(String rMsg) throws IOException {
        String fileName = "err_msg.log";
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.append(LocalDateTime.now().toString())
                .append(" : ")
                .append(rMsg)
                .append('\n');
        writer.close();
    }
}
