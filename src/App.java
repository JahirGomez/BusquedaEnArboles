import Controller.MainController;

public class App {
    public static void main(String[] args) throws Exception {
        MainController controller = new MainController();
        controller.toTreeByGrade(controller.listaEgresadosPorPromedio);
        System.out.println("");
        System.out.println("Hola\n");
        controller.arbolPromedios.inOrden();
        System.out.println("");
        System.out.println("Hola2\n");
        controller.arbolNombres.inOrden();
        System.out.println("");
        System.out.println("Hola3\n");
        controller.arbolProfesiones.inOrden();
    }
}
