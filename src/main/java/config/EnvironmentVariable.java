/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class reads the properties file.
 */
public class EnvironmentVariable {
    private static final String CONFIG_FILE_PATH = "config.properties";
    public static Properties PROPERTIES;

    static {
        try {
            PROPERTIES = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets an object with all environment variables and their values within properties file.
     *
     * @return a property entity.
     */
    public static Properties readFile() throws IOException {
        Properties properties = new Properties();
        File file = new File(CONFIG_FILE_PATH);
        if (file.exists()) {
            InputStream reading = new FileInputStream(file);
            properties.load(reading);
        }
        return properties;
    }
}
