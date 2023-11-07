// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.FileWriter;

public class WriteStringToFile {
    public static String createString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(str);
            // fileWriter.write(System.lineSeparator());
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл" + "\n" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String str = createString("TEST ", 100);
        writeToFile(str, "file.txt");
    }
}