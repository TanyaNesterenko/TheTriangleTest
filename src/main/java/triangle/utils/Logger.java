package triangle.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс логирования
 */
public class Logger {
    public static Logger logger = new Logger();
    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
    FileWriter writer;

    public Logger() {
        try {
            writer = new FileWriter("log.txt", true);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
        try {
            Date dateNow = new Date();
            writer.write(date.format(dateNow) + ": [INFO] " + message + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void startTest(String message) {
        System.out.println("[TEST] " + message);
        try {
            Date dateNow = new Date();
            writer.write(date.format(dateNow) + ": [TEST] " + message + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void fail(String message) {
        System.out.println("[FAIL] " + message);
        try {
            Date dateNow = new Date();
            writer.write(date.format(dateNow) + ": [FAIL] " + message + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

