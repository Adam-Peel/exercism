public enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL,
    UNKNOWN;

    public static LogLevel fromCode(String code) {
        switch (code) {
            case "TRC": return TRACE;
            case "DBG": return DEBUG;
            case "INF": return INFO;
            case "WRN": return WARNING;
            case "ERR": return ERROR;
            case "FTL": return FATAL;
            default: return UNKNOWN;
        }
    }

    
    public static int logCode(String code) {
        switch (code) {
            case "TRC": return 1;
            case "DBG": return 2;
            case "INF": return 4;
            case "WRN": return 5;
            case "ERR": return 6;
            case "FTL": return 42;
            default: return 0;
        }
    }
}
