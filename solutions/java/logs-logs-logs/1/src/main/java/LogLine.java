public class LogLine {

    private final String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String code = logLine.substring(1, 4);
        return LogLevel.fromCode(code);
    }

    public String getOutputForShortLog() {
        String code = logLine.substring(1, 4);
        int logCode = LogLevel.logCode(code);

        return logCode + ":" + logLine.substring(7);
    }
}
