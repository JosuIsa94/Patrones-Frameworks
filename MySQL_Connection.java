/**
 * Se implementa la clase concreta MySqlConnection, que es otra implementación específica de la interfaz DB_Connection.
 * Contiene la lógica de conexión y desconexión para MySQL Database.
 * @author Josué Zepeda
 */

package principal;

public class MySQL_Connection implements DB_Connection{

    @Override
    public void connect() {
        System.out.println("Conectado a MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectado de MySQL Database");
    }
    
}
