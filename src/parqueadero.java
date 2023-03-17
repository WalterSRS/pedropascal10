
// nodos conexion de los datos
public class parqueadero {

    private String marca;
    //este jala para adelante
    private parqueadero ant;
    //esta va para delnte
    private parqueadero sig;

    public parqueadero() {
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public parqueadero getAnt() {
        return ant;
    }

    public void setAnt(parqueadero ant) {
        this.ant = ant;
    }

    public parqueadero getSig() {
        return sig;
    }

    public void setSig(parqueadero sig) {
        this.sig = sig;
    }
}


