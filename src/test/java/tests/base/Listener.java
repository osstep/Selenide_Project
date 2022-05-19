package tests.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Listener implements TestWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);




    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String screenshotName = context.getTestMethod().get().getName() + String.valueOf(System.currentTimeMillis()).substring(9, 13);
        Selenide.screenshot(screenshotName);
        attachScreenshotToAllure();
    }

    @Attachment
    public byte[] attachScreenshotToAllure() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs((OutputType.BYTES));
        } else {
            return null;
        }
    }
}

