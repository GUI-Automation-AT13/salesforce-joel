/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import core.Manager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents login page.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameTxtBox;

    @FindBy(id = "password")
    private WebElement passwordTxtBox;

    @FindBy(id = "Login")
    private WebElement loginBtn;

    public LoginPage(Manager manager) {
        super(manager);
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
    }

    private LoginPage setUserName(final String userName) {
        userNameTxtBox.sendKeys(userName);
        return this;
    }

    private LoginPage setPassword(final String password) {
        passwordTxtBox.sendKeys(password);
        return this;
    }

    private void clickLoginBtn() {
        loginBtn.click();
    }

    /**
     * Sets login page with correct values.
     *
     * @param userName of a valid account.
     * @param password of the same account.
     * @return a home page entity.
     */
    public HomePage loginSuccessful(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginBtn();
        Manager manager = Manager.getInstance();
        return new HomePage(manager);
    }
}
