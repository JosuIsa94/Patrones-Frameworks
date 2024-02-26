/**
 * El programa principal (main method) donde se ejemplifica el uso del patrón Factory Method. 
 * creando instancias de fábricas para Oracle y MySQL, y se utilizan para obtener conexiones a las respectivas BD.
 * @author Josué Zepeda
 */

package principal;

public class Main {
    public static void main(String[] args) {
        // Utilizando el Factory Method para obtener una conexión a Oracle
        DB_Connection_Factory oracleFactory = new Oracle_Connection_Factory();
        DB_Connection oracleConnection = oracleFactory.createConnection();
        oracleConnection.connect();
        // ... trabajar con la conexión a Oracle
        oracleConnection.disconnect();

        // Utilizando el Factory Method para obtener una conexión a MySQL
        DB_Connection_Factory mysqlFactory = new MySQL_Connection_Factory();
        DB_Connection mysqlConnection = mysqlFactory.createConnection();
        mysqlConnection.connect();
        // ... trabajar con la conexión a MySQL
        mysqlConnection.disconnect();
        }
}
