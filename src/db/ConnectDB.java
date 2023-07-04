package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
    public static void main(String[] args) {

        try {
            // Establecer la conexión
            String jdbcUrl = "jdbc:mysql://localhost:3306/dbescuela";
            String usuario = "root";
            String contraseña = "4166";
            Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            // Realizar la consulta SELECT
            String consulta = "SELECT * FROM alumnos";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            // Procesar los resultados
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nombres") + " " + resultSet.getString("apellidos"));
            }

            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
