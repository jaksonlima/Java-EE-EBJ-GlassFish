package main;

import com.soft.link.med.conexao.dao.ConnectionDAO;
import com.soft.link.med.conexao.dao.ConsultorioDAO;
import com.soft.link.model.dao.Consultorio;
import java.util.List;

/**
 * @author jakson wilson bonfim de lima
 */
public class Main02 {

    public static void main(String[] args) {
        ConsultorioDAO consultorioDAO = ConnectionDAO.getConsultorioDAO();

        List<Consultorio> listar = consultorioDAO.litar();

        System.out.println(listar);
    }
}
