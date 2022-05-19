package pages.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePage {


    private final SelenideElement buttonWallet = $x("//div[@data-qa-node='debitSourceSource']");
    private final SelenideElement inputPhoneAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputPhoneButtonSubmitToTheCard = $x("//button[@data-qa-node='submit']");
    private final SelenideElement paymentDetails = $x("//div[@data-qa-node='details']");




    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){

        inputPhoneNumber.setValue(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardNumber(String number){

        inputCardFrom.setValue(number);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardExpDate(String date) {

        inputCardExpDate.setValue(date);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardCvv(String Cvv) {

        inputCardCvv.setValue(Cvv);
        return this;
    }
    public MobilePhoneReplenishmentPage enterAmount(String amount) {

        inputPhoneAmount.setValue(amount);
        return this;
    }
    public MobilePhoneReplenishmentPage submitToTheCard() {
        inputPhoneButtonSubmitToTheCard.shouldBe(Condition.visible).click();
        return this;
    }
    public MobilePhoneReplenishmentPage checkPaymentCardInfo(String text) {
        paymentDetails.shouldBe(Condition.visible);

        Assertions.assertEquals(text, paymentDetails.getText());

        return this;
    }
}
