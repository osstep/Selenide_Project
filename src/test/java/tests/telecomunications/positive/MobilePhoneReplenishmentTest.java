package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestDate.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWudgetPresent();

    }
    @Test
    public void checkMinimumReplenishmentAmount(){
    basePage.goToUrl(MOBILE_PAYMENT_URL);
    mobilePhoneReplenishmentPage
            .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
            .enterAmount("50")
            .enterCardNumber(MOBILE_PAYMENT_CARD)
            .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
            .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
            .submitToTheCard()
            .checkPaymentCardInfo("Mobile payment. Phone number +380686979712");
    }

}
