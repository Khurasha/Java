public class StringClassifier {

    // Declaring Attributes
    private String string;
    private int keyStrokes;
    private int digits;
    private int odds;
    private int evens;
    private int letters;
    private int uppers;
    private int lowers;
    
    // Creating the Constructor
    public StringClassifier(String string) {
        setString(string);
    }

    // Getters for string
    public String getString() {
        return string;
    }

    // Setter for string
    public void setString(String string) {
        if (string != null && !string.isEmpty()) {
            this.string = string;
            classify();
        }
    }

    //The method to classify the string
    public void classify() {
        keyStrokes = string.length();
        digits = 0;
        odds = 0;
        evens = 0;
        letters = 0;
        uppers = 0;
        lowers = 0;

        // Checking if character has digits 
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c))  {
                digits++;
                if (Character.getNumericValue(c) % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
                
        // Checking each character of string
            } else if (Character.isLetter(c)) {
                letters++;
                if (Character.isUpperCase(c)) {
                    uppers++;
                } else {
                    lowers++;
                }
                
            }
        }
    }
    
    //  Display the information about the string
    public String toString() {
        return "  String: " + string +
                "\nKeystrokes: " + keyStrokes +
                "\nDigits: " + digits +
                "\nEven Digits: " + evens +
                "\nOdd Digits: " + odds +
                "\nLetters: " + letters +
                "\nLowercase Letters: " + lowers +
                "\nUppercase Letters: " + uppers;
                
    }



    public static void main(String[] args) {
        StringClassifier classifier = new StringClassifier("Shabd khurana 987");
        System.out.println( classifier.toString());

    }
}