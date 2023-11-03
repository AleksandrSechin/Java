// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

public class Prefix {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" }; // fl префикс
        String maxPrefix = getMaxPrefix(str);
        System.out.println(maxPrefix);
    }

    public static String getMaxPrefix(String[] str){
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1); // substring метод для строк возвращает часть слова с 0 до послед.символа
            }
        }
        return prefix;
    }
}
