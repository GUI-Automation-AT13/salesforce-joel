/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.base;

import core.selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.PageTransporter;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DriverManager driverManager;
    protected PageTransporter pageTransporter;

    @BeforeSuite
    public void init() {
        driverManager = DriverManager.getInstance();
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.navigateToLoginPage();
    }

    @AfterSuite
    public void tearDown() {
        DriverManager.getInstance().getDriver().quit();
    }
}
