package com.weborders.utilities;

import com.weborders.pages.CalenderPage;
import com.weborders.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private CalenderPage calenderPage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;

    }

    public CalenderPage getCalenderPage() {
        if(calenderPage==null){
            calenderPage=new CalenderPage();
        }
        return calenderPage;
    }
}
