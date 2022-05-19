package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {



    public final SelenideElement authWidgetP24New = $x("//div[@class='wrapper_YCBKCowIhQ']");

    public void goToUrl(String url){
        open(url);
    }
    protected void clearAndType(SelenideElement element, String value){
        while (!element.getAttribute(value).equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    public void isAuthWudgetPresent(){
        authWidgetP24New.shouldBe(Condition.visible);

    }
    public void checkMessage(String message){
        $(byText(message)).shouldBe(Condition.visible);
    }
}
