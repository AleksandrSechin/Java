// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

public class Row {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 100_000;

        long start = System.currentTimeMillis();
        String sb = rowCharactersSb(n, c1, c2);
        // System.out.println(sb);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        String str = rowCharactersStr(n, c1, c2);
        // System.out.println(str);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static String rowCharactersSb(int count, char c1, char c2) {

        StringBuilder sb = new StringBuilder(count);
        // sb.length();
        // sb.capacity();

        for (int i = 0; i < count / 2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
    }

    public static String rowCharactersStr(int count, char c1, char c2) {

    String str = "";

        for (int i = 0; i < count / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

    return str;
    }
}