/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.io.*;
import java.util.Properties;

/**
 * This class reads the properties file.
 */
public class Environment {
    private static final String CONFIG_FILE_PATH = "config.properties";
    public static Properties VARIABLES = readFile();

    /**
     * Gets an object with all environment variables and their values within properties file.
     *
     * @return a property entity.
     */
    public static Properties readFile() {
        Properties properties = new Properties();
        File file = new File(CONFIG_FILE_PATH);
        if (file.exists()) {
            InputStream reading = null;
            try {
                reading = new FileInputStream(file);
                properties.load(reading);
            } catch (IOException | NullPointerException e) {
                throw new RuntimeException("It was not possible to read file properties.");
            }

        }
        return properties;
    }
}
