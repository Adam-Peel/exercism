public class LogLevels {
    
    public static String message(String logLine) {
        String[] returnMessage = logLine.split(":");
        String message = returnMessage[1];
        return message.trim();
    }

    public static String logLevel(String logLine) {
      String[] returnWords = logLine.split(":");
        String returnWord = returnWords[0];
        String cleanWord = returnWord.substring(1, returnWord.length() -1);
        return cleanWord.toLowerCase();   
        
    }

    public static String reformat(String logLine) {
        String returnMessage = message(logLine);
        String errorLevel = logLevel(logLine);
        String concatString = returnMessage + " (" + errorLevel + ")";
        return concatString;
    }
}
