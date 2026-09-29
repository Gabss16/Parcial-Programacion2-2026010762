public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Gabriela Michelle Perez Portillo", 2000.0, new ComisionPersonalizada("Gabriela"));
        v.mostrarDetalle();
    }
}
