public class Main {
    interface Volador {
        void volar();
    }
    interface Cantante {
        void cantar();
    }
    // Clase Ave que va a  implementar las interfaces de Volador y Cantante
    class Ave implements Volador, Cantante {
    
        public void volar() {
            System.out.println("El ave está volando.");
        }
        public void cantar() {
            System.out.println("El ave está cantando.");
        }
    }
    public class PruebaAve {
        public static void main(String[] args) {
            Ave miAve = new Ave();
            miAve.volar();
            miAve.cantar();
        }
    }
    
    }