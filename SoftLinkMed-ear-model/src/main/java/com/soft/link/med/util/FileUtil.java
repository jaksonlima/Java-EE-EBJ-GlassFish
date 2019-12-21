package com.soft.link.med.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * @author jakson wilson bonfim de lima
 */
public class FileUtil {

    public static Properties getConnectionProperties(String string) throws IOException {
        FileInputStream file = new FileInputStream(string);

        Properties props = null;
        if (Objects.nonNull(file)) {
            props = new Properties();
            props.load(file);
        }

        return props;
    }
}
