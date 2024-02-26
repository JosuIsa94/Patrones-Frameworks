/*
 * Implementa la clase concreta Oracle_Connection, que es una implementación específica de la interfaz DB_Connection. 
 * @author Josué Zepeda
 */
package principal;

public class Oracle_Connection implements DB_Connection{

    @Override
    public void connect() {
        System.out.println("Conectado a Oracle Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectado de Oracle Database");
    }
    
}
