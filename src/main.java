public class main {

    public static void main(String[] args){

        Lista obj = new Lista();

        obj.carroentra(1,"Toyota");
        obj.carroentra(2,"Chevrolet");
        obj.carroentra(3,"Lamborghini");
        obj.carroentra(4,"Ferrari");


        System.out.println("El numero de vehiculos es: "+obj.va());
        System.out.println("El vehiculo en esa posicion es: "+obj.vercarro(1));

    }



}
