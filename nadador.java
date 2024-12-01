public class {
    interface Nadador {
        void nadar(); 
    }
    interface Respirador {
        void respirar(); 
    }
    class Pez implements Nadador, Respirador {
    
        public void nadar() {
            System.out.println("El pez está nadando en el agua.");
        }
    
        public void respirar() {
            System.out.println("El pez está respirando a través de sus branquias.");
        }
    }
    
    public class PruebaPez {
        public static void main(String[] args) {
            Pez miPez = new Pez();
            miPez.nadar();
            miPez.respirar();
        }
    }
    
    }
    