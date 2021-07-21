/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;

/**
 * Represents response entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedResponse {
    private String id;
    private boolean success;
    private ArrayList<String> errors = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(final ArrayList<String> errors) {
        this.errors = errors;
    }
}
