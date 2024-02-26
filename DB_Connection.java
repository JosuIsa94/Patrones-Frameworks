/**
 * Define la interfaz DB_Connection, que actúa como la interfaz común para las conexiones a bases de datos. 
  * @author Josué Zepeda
 */

package principal;


public interface DB_Connection {
    void connect();
    void disconnect();
}
