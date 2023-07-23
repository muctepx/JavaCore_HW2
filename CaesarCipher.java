package JavaCore.HW2;

public class CaesarCipher {
    public static String cipher(String message, int offset, boolean action) {
        if (action) {
            StringBuilder result = new StringBuilder();
            for (char character : message.toCharArray()) {
                if (character != ' ') {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result.append(newCharacter);
                } else {
                    result.append(character);
                }
            }
            return result.toString();
        } else {
            return cipher(message, 26 - (offset % 26), true);
        }
    }
}
