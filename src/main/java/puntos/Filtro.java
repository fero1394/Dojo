package puntos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import puntos.Correo;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class Filtro {

    private static final Logger log = LoggerFactory.getLogger(Filtro.class);
    private Correo correo = new Correo();

    public void dojo1(){
        Flux.fromIterable(correo.listaCorreos())
                .distinct()
                .subscribe(p -> log.info(p.toString()));
    }

    public void correosRepetidos(){

      //Aqui lista de correos

     // Flux.fromIterable(correos.getListaCorreos())
      //.subscribe(c -> log.info(c.toString);
    }

}
