package org.simplon;

import org.simplon.utils.alerts.AlertFile;
import org.simplon.utils.alerts.AlertLog;
import org.simplon.utils.alerts.IAlert;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("2 arguments needed");
        }
        int messageLevel = Integer.parseInt(args[0]);
        String messageToDisplay = args[1];
        IAlert alertUtil;
        switch (messageLevel) {
            case 1 -> {
                alertUtil = new AlertLog();
                try {
                    alertUtil.doAlert(messageToDisplay);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            case 2 -> {
                alertUtil = new AlertFile();
                try {
                    alertUtil.doAlert(messageToDisplay);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            default -> throw new IllegalStateException("Unexpected value for messageLevel : " + messageLevel);
        }
    }
}