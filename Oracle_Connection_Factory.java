/**
 * Se implementa la clase concreta Oracle_Connection_Factory, que es una implementación específica de la interfaz DB_Connection_Factory.
 * @author Josué Zepeda
 */

package principal;

public class Oracle_Connection_Factory implements DB_Connection_Factory{

    @Override
    public DB_Connection createConnection() {
        return new Oracle_Connection();
    }
    
}
