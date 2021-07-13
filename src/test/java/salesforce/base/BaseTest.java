/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.base;

import config.EnvironmentVariable;
import core.Manager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import salesforce.ui.pages.LoginPage;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected Manager manager;

    @BeforeSuite
    public void init() {
        manager = Manager.getInstance();
        driver = manager.getDriver();
        driver.get(EnvironmentVariable.PROPERTIES
                .getProperty("Login_url"));
        loginPage = new LoginPage(manager);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
