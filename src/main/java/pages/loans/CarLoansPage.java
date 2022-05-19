package pages.loans;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CarLoansPage {


    public final SelenideElement tabAgreements = $x("//div[@class='item_ryTYvf_Qfl']");
    public CarLoansPage selectAgreementsTab(){
        tabAgreements.shouldBe(Condition.visible).click();
        return this;
    }
}
