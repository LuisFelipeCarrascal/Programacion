import java.sql.*;

public class DatabaseConnectionExample {

    // URL de la base de datos, usuario y contraseña
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mi_base_de_datos";
    private static final String USER = "root";
    private static final String PASS = "mi_contraseña";

    public static void main(String[] args) {
        // Declaramos las variables para la conexión y los objetos de la base de datos
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conexión exitosa a la base de datos.");

            // Crear una sentencia (Statement) para ejecutar una consulta
            statement = connection.createStatement();
            String sql = "SELECT * FROM mi_tabla";
            resultSet = statement.executeQuery(sql);

            // Procesar los resultados de la consulta
            while (resultSet.next()) {
                // Ejemplo de cómo imprimir los datos de una columna
                System.out.println("Columna1: " + resultSet.getString("columna1"));
            }

        } catch (SQLException e) {
            // Manejo de excepciones SQLException
            System.out.println("Se produjo un error al conectarse a la base de datos.");
            System.out.println("Código de error: " + e.getErrorCode());
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();  // Para detalles adicionales

        } finally {
            // Cerramos los recursos de la base de datos de forma segura
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                // Manejo de excepciones al cerrar los recursos
                System.out.println("Error al cerrar los recursos de la base de datos.");
                e.printStackTrace();
            }
        }
    }
}