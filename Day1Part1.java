import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// part 1: new Day1().getCalibrationValues().sumUpCalibrationValues()

class Day1 {
    File file;
    Scanner scan;
    String[] lines;
    int[] calibrationValues;

    Day1 getPuzzleInput() throws FileNotFoundException {
        int lineCount = 0;
        int index = 0;
        file = new File("input-day1.txt");  // scan puzzle input file 
        scan = new Scanner(file);
        while (scan.hasNextLine()) {            // count lines in input-day1.txt
            scan.nextLine();
            lineCount++;
        }
        lines = new String[lineCount]; // create String[] for lines
        scan = new Scanner(file);               // restart scanner
        while (scan.hasNextLine()) {            // add lines to String[] array
            lines[index++] = scan.nextLine();
        }
        return this;
    }

    Day1 getCalibrationValues() throws FileNotFoundException {
        int index = 0;
        calibrationValues = new int[2 * (getPuzzleInput().lines.length)];
        for (int i = 0; i <= getPuzzleInput().lines.length - 1; i++) {
            char[] digits = lines[i].toCharArray();
            for (char c : digits) {
                if (Character.isDigit(c)) {
                    calibrationValues[index++] = Character.getNumericValue(c) * 10; // first number = 4, last number = 2, result = 42
                    break;
                }
            }
            for (int j = digits.length - 1; j >= 0; j--) {
                if (Character.isDigit(digits[j])) {
                    calibrationValues[index++] = Character.getNumericValue(digits[j]);
                    break;
                }
            }
        }
        return this;
    }
    
    int sumUpCalibrationValues() {
        int sum = 0;
        for (int i = 0; i <= calibrationValues.length - 1; i++) {
            sum += calibrationValues[i];
        }
        return sum;
    }
}