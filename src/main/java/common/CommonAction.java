package common;

import com.codeborne.selenide.Selenide;

import static common.Config.CLEAR_COOKIES;

public class CommonAction {


    public static void clearBrowserCookieAndStorage(){
        if(CLEAR_COOKIES){
            try {


                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.sessionStorage.clear()");
            } catch (Exception e){
                e.getMessage();
            }
        }
    }
}
