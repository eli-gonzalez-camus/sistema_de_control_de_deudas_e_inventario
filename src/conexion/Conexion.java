package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexion {

        private static final String URL =
                "jdbc:mysql://localhost:3306/sistema_deudas_inventario";

        private static final String USUARIO;

        private static final String PASSWORD ;

        public static Connection conectar() {

            try {
                Connection conexion = DriverManager.getConnection(
                        URL,
                        USUARIO,
                        PASSWORD
                );

                System.out.println("¡Conexión exitosa a MySQL!");

                return conexion;

            } catch (SQLException e) {

                System.out.println("Error al conectar con MySQL:");
                e.printStackTrace();

                return null;
            }
        }
    }

