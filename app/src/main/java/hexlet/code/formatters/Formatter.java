package hexlet.code.formatters;

import java.util.Map;
import java.util.TreeMap;

public interface Formatter {

    static Formatter createFormatter(String style) {
        switch (style) {
            case "stylish" -> {
                return new Stylish();
            }
            case "plain" -> {
                return new Plain();
            }
            case "json" -> {
                return new Json();
            }
            default -> throw new RuntimeException("Unsupported format");
        }
    }

    String format(TreeMap<String, Map<String, Object>> data);
}
