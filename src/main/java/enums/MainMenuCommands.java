package enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands {
    PLAY_REQUEST("\\{request game\\(username<(?<username>[^<>]*)>\\)\\}"),
    NOT_ACCEPT("not accept")
    ;

    private final String pattern;

    MainMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        if (matcher.matches()) return matcher;
        return null;
    }
}
