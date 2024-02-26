/**
 * Se crea la interfaz DB_Connection_Factory,que actúa como la interfaz común para las fábricas de conexiones a bases de datos.
 * @author Josué Zepeda
 */

package principal;


public interface DB_Connection_Factory {
    DB_Connection createConnection();
}
