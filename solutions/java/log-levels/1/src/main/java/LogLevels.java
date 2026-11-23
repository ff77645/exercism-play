public class LogLevels {
    
    public static String message(String logLine) {
        String[] strs = logLine.split(":");
        String msg = strs[1].trim();
        return msg;
    }

    public static String logLevel(String logLine) {
        String[] strs = logLine.split(":");
        String level = strs[0];
        return level.toLowerCase().substring(1,level.length() - 1);
    }

    public static String reformat(String logLine) {
        String[] strs = logLine.split(":");
        String msg = strs[1].trim();
        String oldLevel = strs[0].toLowerCase();
        String newLevel = oldLevel.replace('[','(').replace(']',')');
        return String.format("%s %s",msg,newLevel);
    }
}
