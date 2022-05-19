package tests.base;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.io.File;
import java.util.Objects;

import static common.Config.CLEAR_REPORTS_DIR;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {


    protected BasePage basePage = new BasePage();
    protected CarLoansPage carLoansPage = new CarLoansPage();
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new
            MobilePhoneReplenishmentPage();

    static {
//        File allureResults = new File("allure-results");
//        if (allureResults.isDirectory()){
//            for (File item : Objects.requireNonNull(allureResults.listFiles()))
//                item.delete();
//        }
        if(CLEAR_REPORTS_DIR) {
            File allureScreenshots = new File("build/reports/tests/");
            if (allureScreenshots.isDirectory()) {
                for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                    item.delete();
            }
        }
    }

}
