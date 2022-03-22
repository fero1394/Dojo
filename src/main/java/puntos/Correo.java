package puntos;

import java.util.ArrayList;
import java.util.List;

public class Correo {

    private String correo;
    private List<Correo> listaCorreos = new ArrayList<>();

    public Correo(String correo) {
        this.correo = correo;
    }

    public Correo(){
        
    }

    public List<Correo> listaCorreos(){

        listaCorreos.add(new Correo("eddi.garcia@outlook.com"));
        listaCorreos.add(new Correo("sara310105@hotmail.com"));
        listaCorreos.add(new Correo("naranjobenavidesd@gmail.com"));
        listaCorreos.add(new Correo("gerald.e2309@outlook.com"));
        listaCorreos.add(new Correo("kamilaa.mena@gmail.com"));
        listaCorreos.add(new Correo("juanlondonoierml@hotmail.com"));
        listaCorreos.add(new Correo("echavarria11josedavid@gmail.com"));
        listaCorreos.add(new Correo("juanpos1234@outlook.com"));
        listaCorreos.add(new Correo("jefryzarateruiz@gmail.com"));
        listaCorreos.add(new Correo("claudiaa2343@hotmail.com"));
        listaCorreos.add(new Correo("yesidmenapersonal@gmail.com"));
        listaCorreos.add(new Correo("davidibarguen2015@hotmail.com"));
        listaCorreos.add(new Correo("juandeveloper19@outlook.com"));
        listaCorreos.add(new Correo("olme.orozco@gmail.com"));
        listaCorreos.add(new Correo("veronicapava@hotmail.com"));
        listaCorreos.add(new Correo("maurozac123@gmail.com"));
        listaCorreos.add(new Correo("luisdeiko@outlook.com"));
        listaCorreos.add(new Correo("lumonje12@gmail.com"));
        listaCorreos.add(new Correo("mariana.lopez.docs221@hotmail.com"));
        listaCorreos.add(new Correo("santiago.ci9619@outlook.com"));
        listaCorreos.add(new Correo("alvaro16a@gmail.com"));
        listaCorreos.add(new Correo("viquigiardino@gmail.com"));
        listaCorreos.add(new Correo("mevere66@outlook.com"));
        listaCorreos.add(new Correo("santiago.barrerae@hotmail.com"));
        listaCorreos.add(new Correo("whenao86@gmail.com"));
        listaCorreos.add(new Correo("felipemunevarn@gmail.com"));
        listaCorreos.add(new Correo("mcym_1995@hotmail.com"));
        listaCorreos.add(new Correo("zairmass@hotmail.com"));
        listaCorreos.add(new Correo("martinezmayra605@gmail.com"));
        listaCorreos.add(new Correo("martinezmayra605@gmail.com"));

        return listaCorreos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                '}';
    }
}