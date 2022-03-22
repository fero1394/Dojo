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
                .filter(p -> p.getCorreo().contains("outlook"))
                .subscribe(p -> log.info("Si hay correos con dominio outlook"));

        Flux.fromIterable(correo.listaCorreos())
                .filter(p -> p.getCorreo().contains("gmail"))
                .subscribe(p -> log.info("Si hay correos con dominio gmail"));

        Flux.fromIterable(correo.listaCorreos())
                .filter(p -> p.getCorreo().contains("hotmail"))
                .subscribe(p -> log.info("Si hay correos con dominio hotmail"));

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

    public void correoRecibido(){
        boolean correoEnviado = true;

        List<Correo> correos = new ArrayList<>(correo.listaCorreos());
        List<Correo> correosEnviados = new ArrayList<>();

        correos.get(1).setCorreoRecibido(true);
        correos.get(2).setCorreoRecibido(true);
        correos.get(3).setCorreoRecibido(true);
        correos.get(4).setCorreoRecibido(true);
        correos.get(5).setCorreoRecibido(true);

        Flux.fromIterable(correos)
                .filter(p -> {
                    return p.isCorreoRecibido();
                })
                .subscribe(p -> log.info(p.toString()));
    }
}


