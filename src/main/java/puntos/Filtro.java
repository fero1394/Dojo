package puntos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import puntos.Correo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Filtro {

    private static final Logger log = LoggerFactory.getLogger(Filtro.class);
    private Correo correo = new Correo();

    public void distinct(){

        Flux.fromIterable(correo.listaCorreos())
                .distinct()
                .subscribe(p -> log.info(p.toString()));

    }

    public void filtro(){

        Flux.fromIterable(correo.listaCorreos())
                .filter(p -> p.getCorreo().contains("outlook") && p.getCorreo().contains("gmail") && p.getCorreo().contains("hotmail"))
                .subscribe(p -> log.isDebugEnabled());

    }

    public void correoValido(){

        String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regx);


        List<Correo> correos = new ArrayList<>(correo.listaCorreos());
        Flux.fromIterable(correos)
                .filter(p -> {
                    Matcher matcher  = pattern.matcher(p.getCorreo());
                    return matcher.matches();
                })
                .map(p -> {
                    return p;
                })
                .subscribe(p -> log.info(p.toString()));

        Flux.fromIterable(correos)
                .filter(p -> {
                    Matcher matcher  = pattern.matcher(p.getCorreo());
                    return matcher.matches();
                })
                .map(p -> {
                    return p;
                })
                .count()
                .subscribe(p -> log.info("Cantidad de Correos Validos: " + p));

    }
    public void cantidadTotalCorreos(){
        Flux.fromIterable(correo.listaCorreos())
                .count()
                .subscribe(p -> log.info("Cantidad Total Correos: " + p));
    }
    
    public void cantidadCorreosGmail() {
        Flux.fromIterable(correo.listaCorreos())
                .filter(p -> p.getCorreo().contains("gmail"))
                .count()
                .subscribe(p -> log.info("Cantidad correos Gmail: " + p));


    }

    public void cantidadCorreosOutlook(){

        Flux.fromIterable(correo.listaCorreos())
                .filter(e -> e.getCorreo().contains("outlook"))
                .count()
                .subscribe(e -> log.info("Cantidad correos Outlook: " + e));

}

    public void cantidadCorreosHotmail(){
        Flux.fromIterable(correo.listaCorreos())
                .filter(f -> f.getCorreo().contains("hotmail"))
                .count()
                .subscribe(f -> log.info("Cantidad correos Hotmail: " + f));
        
    }

















    public void correosRepetidos(){

      //Aqui lista de correos

     // Flux.fromIterable(correos.getListaCorreos())
      //.subscribe(c -> log.info(c.toString);
    }

}
