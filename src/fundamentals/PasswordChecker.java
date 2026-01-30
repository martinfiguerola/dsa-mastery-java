package fundamentals;

public class PasswordChecker {

    public static void main(String[] args) {

        PasswordChecker solver = new PasswordChecker();

        String myPassword = "Java123";

        int totalDigits = solver.countNumbers(myPassword); // 3

        if (totalDigits >= 3) System.out.println("Password Secure ✅");
        else System.out.println("Password Weak ❌");

    }

    public int countNumbers (String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char currentCharacter = str.charAt(i);

            if(Character.isDigit(currentCharacter)) {
                count++;
            }
        }
        return count;
    }
}
