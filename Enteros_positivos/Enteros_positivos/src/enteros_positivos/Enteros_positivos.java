package enteros_positivos;

import java.util.Scanner;
public class Enteros_positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,comparador=0,numvelas=0;
        Scanner numero = new Scanner(System.in);
        System.out.println("¿Cuántos años cumple la persona?    ");
        n= Integer.parseInt(numero.nextLine());
        if (n<0){
            n=n*-1;
        }
     int A[]= new int [n];
     System.out.println("¿De qué tamaños son las velas?    ");
     for(i=0;i<n;i++){
         A[i]=Integer.parseInt(numero.nextLine());
         if (A[i]<0){
         A[i]=A[i]*-1;
         }
     }
     for (i=0;i<n;i++){
         if(A[i]>comparador){
             comparador=A[i];
         }
     }
     for (i=0;i<n;i++){
         if(comparador==A[i]){
             numvelas=numvelas+1;
         }
     }
     System.out.println("La cantidad de velas que serán apagadas es:  "+ numvelas);         
     }
    }
