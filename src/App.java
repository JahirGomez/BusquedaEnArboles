import Controller.CSVController;

public class App {
    public static void main(String[] args) throws Exception {
        CSVController controller = new CSVController();
        controller.toTree(controller.listaEgresados);
        System.out.println("");
        System.out.println("Hola");
        controller.arbol.inOrden();
    }
}
