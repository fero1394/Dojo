package puntos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import puntos.Correo;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {

    private static final Logger log = LoggerFactory.getLogger(Filtro.class);
    private Correo correo = new Correo();

    public void distinct(){
        

        Flux.fromIterable(correo.listaCorreos())
                .distinct()
                .subscribe(p -> log.info(p.toString()));

        
        /*
        List<Correo> correosNoRepetidos = correo.listaCorreos();
        correosNoRepetidos = correosNoRepetidos.stream().distinct().collect(Collectors.toList());
        System.out.println(correosNoRepetidos);
    */
    }

    public void filtro(){

        Flux.fromIterable(correo.listaCorreos())
                .filter(p -> p.getCorreo().contains("outlook") && p.getCorreo().contains("gmail") && p.getCorreo().contains("hotmail"))
                .subscribe(p -> System.out.println(p));

    }











    public void correosRepetidos(){

      //Aqui lista de correos

     // Flux.fromIterable(correos.getListaCorreos())
      //.subscribe(c -> log.info(c.toString);
    }

}
