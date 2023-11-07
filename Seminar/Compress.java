// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// результат a4b3c1d2

public class Compress {
    public static String compressString(String input) {
        StringBuilder output = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                output.append(currentChar);
                output.append(count);
                count = 1;
                currentChar = input.charAt(i);
            }
        }
        output.append(currentChar).append(count);
        return output.toString();
    }

    public static void main(String[] args) {
        String inputString = "aaaabbbcddteeeeooop";
        System.out.println(compressString(inputString));
    }
}