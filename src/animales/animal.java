package animales;

public class animal {
    private String nombre;
    private int edad;

    public animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void comer(){
        System.out.println("Comer");
    }
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
}
