/*# kalatabank4.java
#permet la gestion d une banque*/

package fr.insandji.groupe4;
import java.util.*;

 class KALATAbank4
 {
   public static Scanner touch= new Scanner (System.in ); 
   public static int n1=0, k1=0, n=0, i=0,j=0, element=0, fin=2;
   public static String m;
   
   public static void main(String args[])
   { 
     Menu_de_demarrage();
       
   }
   
   
   public static void Menu_de_demarrage (){
  
      System.out.println("\n$$$$$$$$$$$$$$$$ KALATA  Bank $$$$$$$$$$$$$$$$\n");
      System.out.println("              A. Gestion  des  clients        ");
      System.out.println("              B. Gestion  des  comptes        ");
      System.out.println("              C. Gestion  des  operations     ");
      System.out.println("              D. Quitter                    \n");
      do{
         System.out.println("         VEUILLEZ CHOISIR UNE OPTION       ");
         String h=touch.next();
         m=h;
         if(m=="A" && m!="a" && m!="B" && m!="b" && m!="C" && m!="c" && m!="D" && m!="d" ){
           System.out.println("desole mais ce choix n est pas defini");
           System.out.println("========================================================1");
         }
       }while(m=="A" || m=="a" || m=="B" || m=="b" || m=="C" ||m=="c" || m=="D" || m=="d");
       switch(m){
         case "A":
           System.out.println("=================================================================");
           Gestion_des_clients();
           break;
         case "a":
           System.out.println("=================================================================");
           Gestion_des_clients();
           break;
         case "B":
           System.out.println("=================================================================");
           Gestion_des_comptes();
           break;
         case "b":
           System.out.println("=================================================================");
           Gestion_des_comptes();
           break;
         case "C":
           System.out.println("=================================================================");
           Gestion_des_operations();
           break;
         case "c":
           System.out.println("=================================================================");
           Gestion_des_operations();
           break;
         case "D":
           System.out.println("=================================================================");
           System.out.println("             A BINETOT CHER CLIENT               \n");
           break;
         case "d":
           System.out.println("=================================================================");
           System.out.println("             A BINETOT CHER CLIENT               \n");
           break;
         default :
           System.out.println("choix non defini");
       }
         System.out.println("=================================================================");
        
   }
   
   
   public static void Gestion_des_clients(){ 
     
        System.out.println("\n$$$$$$$$$$$$$$$$ GESTION DES CLIENTS $$$$$$$$$$$$$$$$\n");
        System.out.println("              1. Ajout  client         ");
        System.out.println("              2. Modification          ");
        System.out.println("              3. Suppression           ");
        System.out.println("              4. Recherche             ");
        System.out.println("              5. Afficher les  clients ");
        System.out.println("              6. MENU  GENERAL       \n");
     do{
       System.out.println("    que voulez vous faire ?");
       int n=touch.nextInt();
       n1=n;
       if(n1<1 || n1>6){
         System.out.println("desole mais ce choix n est pas defini");
           System.out.println("=================================================================");
       }
        }while(n1<1 || n1>6);
       switch(n1){
        case 1:
          System.out.println("=================================================================");
          Gestion_des_clients();
          break;
        case 2:
           System.out.println("=================================================================");
           Gestion_des_clients();
           break;
        case 3:
            System.out.println("=================================================================");
            Gestion_des_clients();
            break;
        case 4:
            System.out.println("=================================================================");
            Gestion_des_clients();
            break;
        case 5:
            System.out.println("=================================================================");
            Gestion_des_clients();
            break;
        case 6:
            System.out.println("=================================================================");
            Menu_de_demarrage();
            break;
        default :
            System.out.println("choix non defini");
           }
     }
      
   
     public static void Gestion_des_comptes(){
        
        System.out.println("\n$$$$$$$$$$$$$$$$ GESTION DES COMPTES $$$$$$$$$$$$$$$$\n");
        System.out.println("              1. Retrait           ");
        System.out.println("              2. Virement          ");
        System.out.println("              3. Fermeture  du compte           ");
        System.out.println("              4. Afficher les  comptes             ");
        System.out.println("              5. MENU  GENERAL       \n");
     do{
       System.out.println("    que voulez vous faire ?");
       int n=touch.nextInt();
       n1=n;
       if(n1<1 || n1>5){
         System.out.println("desole mais ce choix n est pas defini");
           System.out.println("=================================================================");
       }
        }while(n1<1 || n1>5);
       switch(n1){
        case 1:
          System.out.println("=================================================================");
          Gestion_des_comptes();
          break;
        case 2:
           System.out.println("=================================================================");
           Gestion_des_comptes();
           break;
        case 3:
            System.out.println("=================================================================");
            Gestion_des_comptes();
            break;
        case 4:
            System.out.println("=================================================================");
            Gestion_des_comptes();
            break;           
        case 5:
            System.out.println("=================================================================");
            Menu_de_demarrage();
            break;
        default :
            System.out.println("choix non defini");
           }
     }
     
     public static void Gestion_des_operations(){
        
        System.out.println("\n$$$$$$$$$$$$$$$$ GESTION DES OPERATIONS $$$$$$$$$$$$$$$$\n");
        System.out.println("              1. Retrait            ");
        System.out.println("              2. Virement           ");
        System.out.println("              3. MENU  GENERAL    \n");
     do{
       System.out.println("    que voulez vous faire ?");
       int n=touch.nextInt();
       n1=n;
       if(n1<1 || n1>3){
         System.out.println("desole mais ce choix n est pas defini");
         System.out.println("=================================================================");
       }
        }while(n1<1 || n1>3);
       switch(n1){
        case 1:
          System.out.println("=================================================================");
          Gestion_des_operations();
          break;
        case 2:
          System.out.println("=================================================================");
          Gestion_des_operations();
          break;
        case 3:
          System.out.println("=================================================================");
          Menu_de_demarrage();
          break;
        default :
            System.out.println("choix non defini");
           }
     }
 }
    
