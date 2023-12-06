int[] calibrationValues() {
    String[] linesOfText = new String[4];
    int[] calibrationValues = new int[8];
    linesOfText[0] = "1abc2";
    linesOfText[1] = "pqr3stu8vwx";
    linesOfText[2] = "a1b2c3d4e5f";
    linesOfText[3] = "treb7uchet";
    for (int i = 0; i < linesOfText.length; i++) {
        char[] lineToCharArray = linesOfText[i].toCharArray();
        int currentIndex = 0;

        for (int j = 0; j < lineToCharArray.length; j++) {
            if (Character.isDigit(lineToCharArray[j])) {
                int firstNumber = Character.getNumericValue(lineToCharArray[j]);
                calibrationValues[currentIndex++] = firstNumber;
                break;
            }
        }

        for (int k = lineToCharArray.length - 1; k >= 0; k--) {
            if (Character.isDigit(lineToCharArray[k])) {
                int lastNumber = Character.getNumericValue(lineToCharArray[k]);
                calibrationValues[currentIndex++] = lastNumber;
                break;
            }
        }
    }
    return calibrationValues;
}







int getFirstDigit(String line) {
    int firstDigit = 0; // Initalisize firstDigit.
    char[] getParts = line.toCharArray(); // Create char-Array which contains each part of the line's word.
    for (int i = 0; i < getParts.length; i++) { // Iterates char-Array. As a result we are iterating through each part/symbol of the word in the line.
        if (Character.isDigit(getParts[i])) // If the party/symbol is a digit:
            firstDigit = Character.getNumericValue(getParts[i]); // we store its numeric value in the variable firstDigit
            break; // and break the for-loop.
    }
    return firstDigit; // In the end we return the firstDigit.
}


/*
 * int getLastDigit() {
    // Implementation here
    }

int formSingleTwoDigitNumber() {
    // Implementation here
}

int sumUpCakibrationValues() {
    // Implementation here
}
 */



