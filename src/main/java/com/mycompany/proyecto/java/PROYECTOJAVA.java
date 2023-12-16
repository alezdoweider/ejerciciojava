/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.java;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale12Rada
 */
public class PROYECTOJAVA {

    public static void main(String[] args) {
        
        
            Random randomnum = new Random();
        
        int num1,i=0;
        int numrandom = randomnum.nextInt(100);
        String usuario;
        int regalo;
        
        JOptionPane.showMessageDialog(null,"Adivina el numero¡¡");
        
        usuario = JOptionPane.showInputDialog("Digite su nombre " );
        
        JOptionPane.showMessageDialog(null," Usted sera medido en un rango de puntuación, sera premiado si el numero de intentos es menor que 40 ");
              
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que usted crea que es, esta entre 0 y 100"));//pido numero
        
        while (num1>0 && num1<101){// condicion
            
            if (num1>0){ //iterador que suma cada vez que se digite un numero
                i++;
                
            }
            
            if (num1>numrandom){
                 JOptionPane.showMessageDialog(null,"Su numero se paso, debe ser menor");
            }else{
                 JOptionPane.showMessageDialog(null,"Su numero es muy pequeño, subale mas");
            }
            if (num1==numrandom && i<40){
             JOptionPane.showMessageDialog(null,"Exelente, acerto con el numero en menos de 40 intentos, aqui tiene su regristro total:" + "\n----> Nombre : " +usuario+  "\n----> Su numero total de intentos fue " +i+ " \nFelicidades Campeón, Aqui tienes tu premio : "     );
             
             //AQUI ES DONDE EL USUARIO GANADOR OBTIENE SU PREMIO.
             
             regalo = Integer.parseInt(JOptionPane.showInputDialog("Son 5 regalos randoms,elige bien... \n [1]-->regalo numero 1 \n [2]-->regalo numero 2 \n [3]-->regalo numero 3 \n [4]-->regalo numero 4 \n [5]-->regalo numero 5 " ));
             
             switch (regalo){
                 case 1: JOptionPane.showMessageDialog(null,"EL DON DE SER MARICA");
                 break;
                 case 2: JOptionPane.showMessageDialog(null,"!FELICIDADES¡ GANASTE 500 ROBUX");break;                 case 3: JOptionPane.showMessageDialog(null,"!FELICIDADES¡ GANASTE LA HABILIDAD DE VOLAR"); break;
                 case 4: JOptionPane.showMessageDialog(null,"¡UPS!... AHORA TE ROBO TU DINERO"); break;
                 case 5: JOptionPane.showMessageDialog(null,"SIN PENA NI GLORIA EJJEJE"); 
             break;
             
             
             
             }
             break;

            }
            
            
            
            
            if (num1==numrandom){
             JOptionPane.showMessageDialog(null,"Usted ha logrado acertar con el numero, muy bien, pero con un total de " +i+ "Intentos, no ha sido galardonado pero realizo un exelente trabajo");
            break;
            }
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero porfa"));//pido numero
            
                        }
              
    
    
    
    
    
    
    
      }
    }

