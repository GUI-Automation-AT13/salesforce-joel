/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.assets;

import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.login.LoginTest;

public class CreateAssetTest extends LoginTest {

    @Test
    public void test1() {
        System.out.println("Successful");
        Assert.assertTrue(assetPage.getCreateAssetBtn() != null);
    }
}
