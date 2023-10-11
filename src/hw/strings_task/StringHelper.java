package hw.strings_task;

public class StringHelper implements hw.strings_task.IStringHelper {

    public static void main(String[] args) {
        new StringHelper();
    }

     /*
        [abc] - matches only one of symbols (a, b or c)
        [^abc] - matches only one symbol except for a, b or c
        [a-z] - matches all symbols between a and z

        . - any symbol, only one
        ^ - beginning of a string
        $ - end of a string

        \d - any digit
        \s - whitespace character
        \b - beginning of the word
        \w - symbols that are suitable for identifier
        \\u XXXX - unicode character, where XXXX is its numeric value in hex

        () - exact phrase, if need to use any of operators below on it
        n+ - matches one or more letters n
        n* - matches zero or more letters n
        n? - matches zero or one letters n

        n{x} - contains "n" x times
        n{x,y} - contains "n" x to y times
        n{x,} - contains "n" at least x times
     */



    public StringHelper() {
        //System.out.println(incrementString("foo000"));
    }

    @Override
    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    @Override
    public boolean isPangram(String sentence) {
        boolean[] letters = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letters[c - 'a'] = true;
            }
        }
        for (boolean letterSeen : letters) {
            if (!letterSeen) {
                return false;
            }
        }
        return true;
    }


    @Override
    public byte[] parseIp(String ip) {
        return new byte[0];
    }

    @Override
    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()){
            sb.append((char) (c + 3));
        }
        return sb.toString();
    }

    @Override
    public String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()){
            sb.append((c - 3));
        }
        return sb.toString();
    }

    @Override
    public int countOccurencies(String text, char letter) {
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmail(String text) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return text.matches(emailRegex);
    }

    @Override
    public String reverse(String s) {
        StringBuilder reverse = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }

    @Override
    public String wordReverse(String s) {
        return null;
    }

    @Override
    public String toCamelCase(String s) {

        return null;
    }
}
