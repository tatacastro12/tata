
public class get {
    public static void main(String[] args) {

        Nombre minombre = new Nombre();
        minombre.setNombre("Lorena" );
        minombre.setEdad(22);
        minombre.setNumero("5555555555");

        System.out.println("Mi nombre es " + minombre.getNombre());
        System.out.println("Tengo " + minombre.getEdad() + " años");
        System.out.println("Mi teléfono es " + minombre.getNumero());
    }
}

class Nombre{
    private int edad;
    private String nombre;
    private String numero;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}