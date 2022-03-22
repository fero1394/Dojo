package puntos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Correo {

    private String correo;
    private List<Correo> listaCorreos = new ArrayList<>();
    private boolean correoRecibido = false;

    public Correo(String correo, boolean correoRecibido) {
        this.correo = correo;
        this.correoRecibido = correoRecibido;
    }

    public Correo(){
        
    }

    public boolean isCorreoRecibido() {
        return correoRecibido;
    }

    public void setCorreoRecibido(boolean correoRecibido) {
        this.correoRecibido = correoRecibido;
    }

    public List<Correo> listaCorreos(){

        //eddi.garcia@outlook.com
        listaCorreos.add(new Correo("eddi.garciaoutlook.com",correoRecibido));
        listaCorreos.add(new Correo("sara310105@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("naranjobenavidesd@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("gerald.e2309@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("kamilaa.mena@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("juanlondonoierml@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("echavarria11josedavid@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("juanpos1234@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("jefryzarateruiz@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("claudiaa2343@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("yesidmenapersonal@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("davidibarguen2015@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("juandeveloper19@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("olme.orozco@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("veronicapava@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("maurozac123@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("luisdeiko@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("lumonje12@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("mariana.lopez.docs221@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("santiago.ci9619@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("alvaro16a@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("viquigiardino@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("mevere66@outlook.com",correoRecibido));
        listaCorreos.add(new Correo("santiago.barrerae@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("whenao86@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("felipemunevarn@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("mcym_1995@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("zairmass@hotmail.com",correoRecibido));
        listaCorreos.add(new Correo("martinezmayra605@gmail.com",correoRecibido));
        listaCorreos.add(new Correo("martinezmayra605@gmail.com",correoRecibido));

        return listaCorreos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correo correo1 = (Correo) o;
        return correoRecibido == correo1.correoRecibido && Objects.equals(correo, correo1.correo) && Objects.equals(listaCorreos, correo1.listaCorreos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, listaCorreos, correoRecibido);
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                ", listaCorreos=" + listaCorreos +
                ", correoRecibido=" + correoRecibido +
                '}';
    }
}