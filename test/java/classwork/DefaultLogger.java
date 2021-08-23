package classwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DefaultLogger {

    private static final Logger LOGGER =
            Logger.getLogger(DefaultLogger.class.getName());

    public static void main(String[] args) throws IOException {

        FileInputStream configFile = new FileInputStream("src/test/resources/log.config");
        LogManager.getLogManager().readConfiguration(configFile);
        LOGGER.setLevel(Level.ALL);


        LOGGER.log(Level.SEVERE,"сообщение с уровнем SEVERE");
        LOGGER.log(Level.WARNING, "Сообщение с уровнем Warning");
        LOGGER.log(Level.INFO,"сообщение с уровнем INFO");
        LOGGER.log(Level.CONFIG,"сообщение с уровнем CONFIG");
        LOGGER.log(Level.FINE,"сообщение с уровнем FINE");
        LOGGER.log(Level.FINER,"сообщение с уровнем FINER");
        LOGGER.log(Level.FINEST,"сообщение с уровнем FINEST");
        LOGGER.log(Level.ALL,"сообщение с уровнем ALL");





    }
}
