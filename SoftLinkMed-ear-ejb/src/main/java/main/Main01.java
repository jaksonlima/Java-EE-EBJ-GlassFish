package main;

import com.soft.link.med.conexao.dao.ConnectionDAO;
import com.soft.link.med.conexao.dao.ConsultorioDAO;
import com.soft.link.model.dao.Consultorio;
import java.sql.Connection;

/**
 * @author jakson wilson bonfim de lima
 */
public class Main01 {

    public static void main(String[] args) throws Exception {
        ConsultorioDAO consultorioDAO = ConnectionDAO.getConsultorioDAO();

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(contextClassLoader);

        Connection connection = consultorioDAO.getConnection();
        System.out.println(connection);

        Consultorio litarv2 = consultorioDAO.litarv2();
        
        System.out.println(litarv2);
    }

}
