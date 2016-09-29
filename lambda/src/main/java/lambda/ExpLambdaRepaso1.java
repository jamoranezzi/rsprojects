package lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by amorales on 22/09/16.
 */
interface Ejecutable {
    int ejecutar(int a);
}

class Ejecutador {
    protected static Logger log = LogManager.getLogger(Ejecutador.class);

    public void ejecutar(Ejecutable e) {
        // Ejecuta una funcion especifica
        log.info("Resultado " + e.ejecutar(12));
    }
}

public class ExpLambdaRepaso1 {

    protected static Logger log = LogManager.getLogger(ExpLambdaRepaso1.class);

    public static void main(String[] args) {

        Ejecutador run=  new Ejecutador();
        run.ejecutar(a -> {
            log.info("Se ejecuta la funcion ======= param [" + a + "]");
            return a + 7;

        });


    }

}

