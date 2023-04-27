package arreglos;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class Operacion {
    public int entrada(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public void suma(){
        System.out.println("Ingresa el valor de 'm'");
        int m=entrada();
        System.out.println("Ingresa el valor de 'n'");
        int n=entrada();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'a'["+i+"]["+j+"]");
                a[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'b'["+i+"]["+j+"]");
                b[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void resta(){
        System.out.println("Ingresa el valor de 'm'");
        int m=entrada();
        System.out.println("Ingresa el valor de 'n'");
        int n=entrada();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'a'["+i+"]["+j+"]");
                a[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'b'["+i+"]["+j+"]");
                b[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void multipicacion1(){
        System.out.println("ingresa el valor de x");
        int x=entrada();
        System.out.println("Ingresa el valor de 'm'");
        int m=entrada();
        System.out.println("Ingresa el valor de 'n'");
        int n=entrada();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'a'["+i+"]["+j+"]");
                a[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]=x*a[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void multipicacion2(){
        System.out.println("Ingresa el valor de 'm'");
        int m=entrada();
        System.out.println("Ingresa el valor de 'n'");
        int n=entrada();
        int aux;
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'a'["+i+"]["+j+"]");
                a[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("'b'["+i+"]["+j+"]");
                b[i][j]=entrada();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aux=0;
                for (int k = 0; k < m; k++) {
                    aux=aux+a[i][k]*b[k][j];
                }
                c[i][j]=aux;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
