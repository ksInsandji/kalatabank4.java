/*# kalatabank4.java
#permet la gestion d une banque*/

package fr.insandji.devoir;
import java.util.*;
import java.io.*;



 class kalatabank
 {
   public static Scanner touch= new Scanner (System.in ); 
   public static int n1=0,jour=1,mois=1,annee=2000,nk=0, k1=0, n=0, i=0,j=0, element=0, fin=2,nombrealeatoire=0,telephone=0;
   public static String m,nn,nom,prenom,metier;
   
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
          Ajout_client();
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
            recherche();
            System.out.println("avec vous terminer votre recherche alors taper 1");
            int j=touch.nextInt();
            if (j==1) {
              Gestion_des_clients();
            }
            else {
              recherche();
            }
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
     public static void ecrirefichier(int matri,String nom,String prenom,String job,int number,int j,int m,int an){
       File folder =new File (" devoir_groupe_4/");
        File file=new File (" devoir_groupe_4/Base_De_Donnee_Client.txt");
       
       if (!folder.exists()){
         folder.mkdir();
       }
         
       if (!file.exists()){
         try{
           file.createNewFile();         
         }catch (IOException k){
           k.printStackTrace();
         }
         try{
           FileWriter ecrire = new FileWriter(file);
           BufferedWriter bw=new BufferedWriter(ecrire);
           bw.newLine();
           bw.write("A"+matri+nom+prenom+job+number+j+m+an);
           bw.newLine();
           bw.close();
           ecrire.close();
         }catch (IOException k){
           k.printStackTrace();
         }
       } 
       else {
         try{
           FileWriter ecrire = new FileWriter(file);
           BufferedWriter bw=new BufferedWriter(ecrire);
           bw.newLine();
           bw.write("A"+matri+nom+prenom+job+number+j+m+an);
           bw.newLine();
           bw.close();
           ecrire.close();
         }catch (IOException k){
           k.printStackTrace();
         }
                }
     }
     
   public static void Ajout_client(){
         
         System.out.println("le matricule genere pour ce client est "+nombrealeatoire);
         System.out.println("enter le nom du client");
         String nn=touch.next();
         nom=nn;
         System.out.println("enter le prenom du client");
         String pn=touch.next();
         prenom=pn;
         metier();
         do {
           System.out.println("enter le numero de telephone du client(il doit avoir maximun 10 chiffre)");
             int j=touch.nextInt();
             if(j<699999999 && j>611111111) {
               telephone=j;
             }
             else {
               System.out.println("veuillez entrer une telephone valide(il doit avoir maximun 10 chiffre)");
             }
         }while(j>=699999999 && j<=611111111);
        
    do {
       System.out.println("enter le mois d enregistrement du client");
           int k1=touch.nextInt();
             if(k1>=1 && k1<=12) {
               mois=k1;
               if(mois==2) {
                 do {
                       System.out.println("enter le jour d enregistrement du client");
                       int i=touch.nextInt();
                         if(i>=1 && i<=29) {
                           jour=i;
                           do {
                               System.out.println("enter l annee d enregistrement du client");
                               int l=touch.nextInt();
                                 if(l>=1950 && l<=2100) {
                                   annee=l;
                                 }
                                 else {
                                   System.out.println("veuillez entrer une annee valide");
                                 }
                             }while(i<1950 && i>2100);
                         }
                         else {
                           System.out.println("veuillez entrer un jour valide");
                         }
                     }while(i<1 && i>29);
               }
               else if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12) {
                 do {
                       System.out.println("enter le jour d enregistrement du client");
                       int i=touch.nextInt();
                         if(i>=1 && i<=31) {
                           jour=i;
                           do {
                               System.out.println("enter l annee d enregistrement du client");
                               int l=touch.nextInt();
                                 if(l>=1950 && l<=2100) {
                                   annee=l;
                                 }
                                 else {
                                   System.out.println("veuillez entrer une annee valide");
                                 }
                             }while(i<1950 && i>2100);
                         }
                         else {
                           System.out.println("veuillez entrer un jour valide");
                         }
                     }while(i<1 && i>31);
               }
               else {
                 do {
                       System.out.println("enter le jour d enregistrement du client");
                       int i=touch.nextInt();
                         if(i>=1 && i<=30) {
                           jour=i;
                           do {
                               System.out.println("enter l annee d enregistrement du client");
                               int l=touch.nextInt();
                                 if(l>=1950 && l<=2100) {
                                   annee=l;
                                 }
                                 else {
                                   System.out.println("veuillez entrer une annee valide");
                                 }
                             }while(i<1950 && i>2100);
                         }
                         else {
                           System.out.println("veuillez entrer un jour valide");
                         }
                     }while(i<1 && i>30);
               }
             }
             else {
               System.out.println("veuillez entrer un mois valide");
             }
         }while(k1<1 && k1>31);
                 
         ecrirefichier( nombrealeatoire,nom, prenom,metier,telephone,jour,mois,annee);

     }
   public static String metier (){
         System.out.println("choisissez le metier du client");
         System.out.println("1-chanteur\t 2-homme d affaire\t 3- avocat\t 4-comptable\t 5-informaticien\t 6- chauffeur\t 7- menuissier\t");
         int pn=touch.nextInt();
         nk=pn;
         switch (nk){
           case 1:
             System.out.println("je suis chanteur");
             metier="chanteur";
             break;
           case 2:
             System.out.println("je suis homme d affaire");
             metier="homme d affaire";
             break;
           case 3:
             System.out.println("je suis avocat");
             metier="avocat";
             break;
           case 4:
               System.out.println("je suis comptable");
               metier="comptable";
               break;
           case 5:
              System.out.println("je suis informaticien");
              metier="informaticien";
              break;
            case 6:
              System.out.println("je suis chauffeur");
              metier="chauffeur";
              break;
            case 7:
                System.out.println("je suis menuissier");
                metier="menuissier";
                break;
         }
         return metier;
     }
   public static void recherche (){
       System.out.println("identifiant\t NOM\t PRENOM\t  metier\t  telephone\t  temps d enregistrement");
       System.out.println( "    "+"A"+nombrealeatoire+"       "+ nom +"      "+ prenom +"      "+ metier +"    "+telephone+"    "+jour+"-"+mois+"-"+annee);
     }
   public static int Id_client() {
       Random choix= new Random();
       int nombrealeatoire =choix.nextInt(100-10+1)+0;
       return nombrealeatoire;
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
    
