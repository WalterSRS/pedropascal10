public class Lista {
    private parqueadero raiz;

    public Lista() {

        this.raiz = null;

    }

    public int va() {

        int con = 0;
        parqueadero aux = this.raiz;
        while (aux != null) {
            aux = aux.getSig();
            con++;
        }

        return con;

    }

    public void carroentra(int pos, String p) {

        if (pos <= va() + 1) {

            parqueadero nuevo = new parqueadero();
            nuevo.setmarca(p);

            if (pos == 1) {

                nuevo.setSig(raiz);

                if (raiz != null) {

                    raiz.setAnt(nuevo);

                }
                raiz = nuevo;

            } else {

                if (pos == va() + 1) {

                    parqueadero aux = raiz;
                    while (aux.getSig() != null) {
                        aux = aux.getSig();
                    }
                    aux.setSig(nuevo);
                    nuevo.setAnt(aux);
                    nuevo.setSig(null);
                } else {

                    parqueadero aux1 = raiz;
                    for (int i = 1; i <= pos - 2; i++) {
                        aux1 = aux1.getSig();


                        parqueadero proximo = aux1.getSig();
                        aux1.setSig(nuevo);
                        nuevo.setAnt(aux1);
                        nuevo.setSig(proximo);
                        proximo.setAnt(nuevo);
                    }

                }
            }

        }

    }

    public String vercarro(int pos) {
        int con = 0;
        parqueadero aux = this.raiz;
        while (aux != null) {
            aux = aux.getSig();
            con++;
            if (pos == con) {
                return aux.getmarca();
            }
        }
        return null;
    }

    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

    /*public String imprimr (){

        for( int i = 0 ; i )
        {

        }

    }*/

}



