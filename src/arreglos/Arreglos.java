package arreglos;
/**
 *
 * @author rafael
 */
public class Arreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op=new Operacion();
        int opc;
        System.out.println("1 suma \n2 resta \n3 multiplicacion 1\n4 multiplicacion 2 \n5 fin");
        boolean loop=true;
        while (loop) {
            opc=op.entrada();
            switch (opc){
                case 1:
                    op.suma();
                    break;
                case 2:
                    op.resta();
                    break;
                case 3:
                    op.multipicacion1();
                    break;
                case 4:
                    op.multipicacion2();
                    break;
                case 5:
                    loop=false;
                    break;
            }
        }
    }
    
}
