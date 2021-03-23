
package com.mycompany.andrespena_johangomez;
import java.util.Scanner;
/**
 * @author Andrés Peña
 * @author Johan Gómez
 */
public class Reto2 {
    public static void main(String[] args){    
    punto1();
    punto2();    
    punto3();
    punto4();
    punto5();
    }



  
static void punto1(){
    Scanner lea=new Scanner(System.in);
    int M,N;
    System.out.println("Ingrese hasta que  número desea mostrar las tabla");            
    M = lea.nextInt();       
    System.out.println("Ingrese hasta que número desea multiplicar");            
    N = lea.nextInt(); 
        for (int i = 1; i < M+1; i++) {
            for (int j = 1; j < N+1; j++) {
                System.out.println(i+" x "+j+"="+i*j);
            }
        }
} 

static void punto2(){
    int suma=0;
    int impar=1;
    Scanner lea=new Scanner(System.in);
    System.out.println("Ingrese el número al que desea hallar el cuadrado");
            
        int M = lea.nextInt();
        for (int i = 0; i < M; i++) {
            suma=impar+suma;
            System.out.println("El cuadrado de "+(i+1)+" es "+suma);
            impar=impar+2;
        }
    }
    
static void punto3(){
    Scanner lea = new Scanner(System.in);
    int n, impar=-1,i,suma=0;
    System.out.println("Ingrese el número que desea el cubo : ");
    n = lea.nextInt();    
        for (i = 0; i < n; i++) {
         impar = impar +2;
          suma = impar;
            for (int j = 0; j < i; j++) {
                impar = impar + 2;
                suma = suma + impar;            
                   
            }
        System.out.println((i+1)+"^3"+ " = " + suma); 
        }
}

static void punto4(){   
        
    Scanner readme = new Scanner(System.in);   
    int cociente, precio, divisor = 100000;
    System.out.println("Ingrese valor a retirar: ");
    precio = readme.nextInt();       
    
    if (precio >= divisor){
        cociente = precio/divisor;        
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 100.000 ");
    
    }
    divisor = 50000;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 50.000 ");
    }    
        
    divisor = 20000;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 20.000 ");
    }
    divisor = 5000;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 5000 ");
    }
    divisor = 2000;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 2000 ");
    }    
    divisor = 1000;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  billetes de 1000 ");
    }    
    divisor = 500;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + " monedas de 500 ");
    }    
    divisor = 100;
    if (precio >= divisor){
        cociente = precio/divisor;
        precio = precio%divisor;
        System.out.println("recibirá " + cociente + "  monedas de 100 ");
    }

}

static void punto5(){
    int n,m,mfac,nfac,resta,restafac;
    Scanner lea = new Scanner(System.in);    
    System.out.println("Ingrese n: ");
    n= lea.nextInt(); 
    System.out.println("Ingrese m: ");
    m= lea.nextInt();
    nfac=n;
    mfac =m;
    resta = n-m;
    restafac=resta;
    for (resta=(n-m); resta>2; resta--) {
        restafac=restafac*(resta-1);
    }
    for (n = nfac; n>2; n--){
        nfac=nfac*(n-1);    
    }
        
    for (m = mfac; m>2; m--){
        mfac=mfac*(m-1);    
    }
    m=mfac*restafac;
    n=nfac/m;
        System.out.println("El resultado  de la combinatoria es : " + n );

}
    
}
