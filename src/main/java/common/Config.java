package common;

import com.codeborne.selenide.Configuration;

public class Config {
    public static final String BROWSER_AND_PLATFORM = "chrome";
    // очищение кукиес
    public static final Boolean CLEAR_COOKIES = false;
    // закрытие браузера после теста или оставлять
    public static final Boolean HOLD_BROWSER_OPEN = true;
    // очистить деректорию скриншотов перед запуском
    public static final Boolean CLEAR_REPORTS_DIR = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests/";
        Configuration.browser = BROWSER_AND_PLATFORM;
    }
}
