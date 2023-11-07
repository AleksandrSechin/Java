// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ContentFolder {
    private static Logger logger = Logger.getLogger(ContentFolder.class.getName());

    public static void main(String[] args) {
        initLogger();
        String[] listFolder = getContentFolder(".");
        System.out.println(Arrays.toString(listFolder));
        writeToFile(listFolder, ".");
    }

    public static void initLogger() {
        try {
            FileHandler fileHandler = new FileHandler("Log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getContentFolder(String folderPath) {
        File folder = new File(folderPath);
        return folder.list();
    }

    public static void writeToFile(String[] str, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (String file : str) {
                fileWriter.write(file);
                fileWriter.write(System.lineSeparator());
            }
            // fileWriter.write(System.lineSeparator());
            logger.info("Успешно записали информацию в файл");
        } catch (Exception e) {
            // logger.warning("Ошибка записи в файл");
            logger.log(Level.WARNING, "Ошибка записи в файл" + e.getMessage());
            // System.out.println("Ошибка записи в файл" + "\n" + e.getMessage());
        }
    }
}