/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents attribute entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attribute {
    private String type;
    private String url;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
