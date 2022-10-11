public class StrongPassword {
    public static void main(String[] args) {
        //System.out.println(minimumNumber(3, "Ab1"));
        //System.out.println(minimumNumber(11, "#HackerRank"));
        System.out.println(minimumNumber(4, "&+^&")); // 3 try agin once more
    }

    public static int minimumNumber(int n, String password) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digitCase = false;
        boolean specialCase = false;
        int minimumNumber = 0;
        int checkNumber = 4;
        String numbers = "0123456789";
        String special_characters = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char localChar = password.charAt(i);
            if (Character.isUpperCase(localChar) && !upperCase) {
                upperCase = true;
                checkNumber--;
            } else if (Character.isLowerCase(localChar) && !lowerCase) {
                lowerCase = true;
                checkNumber--;
            } else if (numbers.contains(String.valueOf(localChar)) && !digitCase) {
                digitCase = true;
                checkNumber--;
            } else if (special_characters.contains(String.valueOf(localChar)) && !specialCase) {
                specialCase = true;
                checkNumber--;
            }
        }
        if ((n < 6)) {
            minimumNumber = 6 - n;
            minimumNumber = Math.max(minimumNumber, checkNumber);
        } else {
            minimumNumber = checkNumber;
        }
        return minimumNumber;
    }
}
