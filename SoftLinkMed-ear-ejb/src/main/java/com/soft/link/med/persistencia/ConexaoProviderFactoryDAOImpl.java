package com.soft.link.med.persistencia;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import com.soft.link.med.model.iinterface.ConexaoProviderDAO;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

/**
 * @author jakson wilson bonfim de lima
 */
public class ConexaoProviderFactoryDAOImpl implements ConexaoProviderDAO {

    public final static String CONNETIONPROPERTIES = "src/main/resources/META-INF/Connection.properties";

    @Override
    public Connection getConnection() {
        try {
            String propertyURL = getConnectionProperties().getProperty("url");
            return DriverManager.getConnection(propertyURL, getConnectionProperties());
        } catch (IOException | SQLException ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

    private static Properties getConnectionProperties() throws IOException {
        FileInputStream file = new FileInputStream(CONNETIONPROPERTIES);

        Properties props = null;
        if (Objects.nonNull(file)) {
            props = new Properties();
            props.load(file);
        }

        return props;
    }

}
