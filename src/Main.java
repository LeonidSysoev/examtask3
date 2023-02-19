public class Main {
    public static void main(String[] args) {
        String str = "hhтоh";
        if (isPalindrom(str)) {
            System.out.println("Строка палиндром");
        } else {
            System.out.println("Строка не палиндром");
        }
    }

    public static boolean isPalindrom(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}