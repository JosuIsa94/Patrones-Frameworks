/*
 * Se implementa la clase concreta MySQL_Connection_Factory, que es otra implementación específica de la interfaz DB_Connection_Factory. 
 * @author Josué Zepeda
 */
package principal;

public class MySQL_Connection_Factory implements DB_Connection_Factory{

    @Override
    public DB_Connection createConnection() {
        return new MySQL_Connection();
    }
    
}
