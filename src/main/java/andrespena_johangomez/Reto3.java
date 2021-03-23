
 
package andrespena_johangomez;
import java.util.Scanner;
/**
 *
 * @author Johan Gómez
 * @author Andrés Peña
 * 
 */
public class Reto3 {
    public static void main (String[]args){
        
        punto1();
        punto2();
        punto3();
        punto4();
    
    
    }
    static  void punto1(){
    int n,m,i,j;
    Scanner leame = new Scanner(System.in);
        System.out.println("Ingrese el número de filas:");
        n= leame.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        m= leame.nextInt();
    float matriz[][] = new float[n][m];
    
        for (i = 0; i < n; i++) {
            for (j = 0; j <m; j++) 
            {
                System.out.println("Ingrese el numero");
                matriz[i][j]= leame.nextFloat();
            }
        }    
        System.out.println("La matriz resultante es : ");
        for (i = 0; i < n; i++) {            
            for (j = 0; j <m; j++) 
            {   
                System.out.print(matriz[i][j] + " " );
                
                
            }
            System.out.println();
        }
        
        
    
    } 
    
    static void punto2(){
    
    Scanner readme= new Scanner(System.in);
    int i=0;
    double mayor=-100000, varia =0,menor=10000;
    String numeros;    
    System.out.println("Escriba números enteros separados por coma:");
    numeros=readme.next();    
    String[] s = new String[i];   
    s = numeros.split(",");    
    i = s.length;    
    for (int m = 0; m < i; m++) {
        varia =varia+Integer.parseInt(s[m]);        
    }
    System.out.println("La suma del vector es: " + varia);    
    System.out.print("El promedio es: "+varia/i);
    System.out.println();
    
    for (int j = 0; j < i; j++) {
        if (Integer.parseInt(s[j])>mayor){
            mayor=Integer.parseInt(s[j]);
            
        }   
    }
    System.out.print("El mayor número es:  " + (int)mayor);
    for (int h = 0; h < i; h++) {
        if (Integer.parseInt(s[h])<menor){
            menor=Integer.parseInt(s[h]);
        }   
    }
    System.out.println();
    System.out.print("El menor es: "+ (int)menor);  
    System.out.println();   
    }
    
    static void punto3(){
    
        int vector[];int vector1[]; int m;int i=0;int suma=0; {
        Scanner leame = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los dos vectores a multiplicar");
        m= leame.nextInt();
        vector = new int [m];
        vector1 = new int [m];
        for ( i = 0; i < m; i++) {
            System.out.println("Ingrese el elemento en la posición "+(i+1)+" del primer vector");
            vector[i]=leame.nextInt();
        }
        for (int j = 0; j < m; j++) {
            System.out.println("Ingrese el elemento en la posición "+(j+1)+" del segundo vector");
            vector1[j]=leame.nextInt();
        }
        for (int k = 0; k < m; k++) {
            suma=vector[k]*vector1[k]+suma;
            
        }
        System.out.println("El resultado del producto de ambos vectores es: " + suma);
        }
    
    }
    
    static void punto4(){
        
         int n,m,i,j,suma;
    
    Scanner leame = new Scanner(System.in);   
        
    int vector[] = new int[3];
    int vector1[] = new int[3];
    int vectorresultante[]=new int[3];
        
          for (j = 0; j <3; j++){ 
            
             System.out.println("Ingrese los datos del primer vector en la posicion "+(j+1));
             vector[j]= leame.nextInt();
            }
          for (i = 0; i < 3; i++) {
             System.out.println("Ingrese los datos del segundo vector en la posicion "+(i+1));
             vector1[i]= leame.nextInt();
            
          }       
        
        for ( i = 0; i < 3; i++) {
            
            if (i==2) {
            j=0;
        }             
            
            else{
            j=i+1;    
        }            
            if (i==1){
                suma=(vector[j]*vector1[i])-(vector[i]*vector1[j]);
                vectorresultante[0]=suma*-1;
                
            }
            if (i==2){
                suma=(vector[j]*vector1[i])-(vector[i]*vector1[j]);
                vectorresultante[1]=suma*-1;
            }
            if (i==0){
                suma=(vector[i]*vector1[j])-(vector[j]*vector1[i]);
                vectorresultante[2]=suma;
            }
        }
        System.out.println("El vector resultante es");
        for (int k = 0; k < 3; k++) {
            
                System.out.println(vectorresultante[k]);
                  
        }
    }
    
    
    
    

}
