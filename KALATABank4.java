/*# kalatabank4.java
#permet la gestion d une banque*/

//package fr.insandji.devoir;
import java.util.*;
import java.io.*;


 class KALATABank4{
   public static Scanner touch= new Scanner (System.in ); 
   public static File folder =new File (" devoir_groupe_4/");
   public static File file = new File (" devoir_groupe_4/Base_De_Donnee_Client.txt");
   public static File file1=new File (" devoir_groupe_4/Base_De_Donnee_Compte.txt");
   public static File files=new File (" devoir_groupe_4/Base_De_Donnee_Client1.txt");
   public static int w=0,n1=0,jour=1,mois=1,annee=2000,nk=0,l=0, k1=0, n=0, i=0,j=0, element=0, fin=2,nombrealeatoire=1,telephone=0,r=0,el=0;
   public static ArrayList<String> choix =new ArrayList();
   public static ArrayList<String> choix1=new ArrayList();
   public static ArrayList<String> choix2=new ArrayList();
   public static ArrayList<String> choix3=new ArrayList();
   public static String g,Dernier_action, m,nn,nom,prenom,metier,ID_client,ID_compte,sms_mois,sms_jour,sms_annee;
   public static String mot="";
   
   public static void main(String args[]){ 
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
           System.out.println("========================================================");
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
			do{
			   Ajout_client(0);
			   System.out.print("voulez vous ajouter un autre client entre 1 si tel est votre choix ");
			   n=touch.nextInt();
			}while(n==1);
            Gestion_des_clients();
            break;
        case 2:
            System.out.println("=================================================================");
            modifier();
            Gestion_des_clients();
            break;
        case 3:
            System.out.println("=================================================================");
            Suppression();
            Gestion_des_clients();
            break;
        case 4:
            System.out.println("=================================================================");
            recherche(file,0);
            Gestion_des_clients();
            break;
        case 5:
            System.out.println("=================================================================");
            afficher(0);
			do{
				System.out.println("avec vous terminer alors taper 1");
                int j=touch.nextInt();
				i=j;
				if (i!=1) {
					afficher(0);
				}
			}while(i!=1);
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
    public static void ecrirefichier(String id ,String nom,String prenom,String job,int number,int j,int m,int an){
 
        if (!folder.exists()){
			folder.mkdir();
        }
         
        if (!file.exists()){
			try{
				file.createNewFile();         
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
        try(PrintWriter pw=new PrintWriter(new FileOutputStream(file,true))){
			pw.println( id +"  "+nom+"   "+prenom+"   "+job+"   "+number+"   "+j+"-"+m+"-"+an);
			System.out.println("\t LE CLIEN A ETE BIEN ENREGISTRER");
        }catch (IOException k){
           k.printStackTrace();
        } 
    }
    public static void ecrirefichier(String idco ,String idcl,int s,String fait){
         
       if (!file1.exists()){
			try{
				file1.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
        
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file1, true))){
			pw.println( idco +"   "+ idcl+"   "+ s +"FCFA"+"   "+fait);
			System.out.println("LE COMPTE DE CE CLIENT A ETE BIEN ENREGISTRER");
		}catch (IOException k){
           k.printStackTrace();
        } 
    }
    public static void Ajout_client(int u){
	   
	   if(u==0){
	       Id (0);
           ID_client=("A"+nombrealeatoire);
           System.out.println("l identifiant genere pour ce client est "+ID_client);
           System.out.println("enter le nom du client");
           String nn=touch.next();
           nom=nn;
           System.out.println("enter le prenom du client");
           String pn=touch.next();
           prenom=pn;
           metier();
           do {
		    	System.out.println("enter le numero de telephone du client(il doit avoir maximun 09 chiffre)");
		    	j=touch.nextInt();
                if(j<699999999 && j>611111111) {
                   telephone=j;
               }
               else {
               System.out.println("veuillez entrer une telephone valide(il doit avoir maximun 09 chiffre)");
               }
            }while(j>=699999999 || j<=611111111);
            date(0);  
            ecrirefichier( ID_client,nom, prenom,metier,telephone,jour,mois,annee);
            nouveau_compte(ID_client,0);
	   }
	   else if(u==1){
	       System.out.println("enter le nom du client");
           String nn=touch.next();
           nom=nn;
           System.out.println("enter le prenom du client");
           String pn=touch.next();
           prenom=pn;
           metier();
           do {
		    	System.out.println("enter le numero de telephone du client(il doit avoir maximun 09 chiffre)");
		    	j=touch.nextInt();
                if(j<699999999 && j>611111111) {
                   telephone=j;
               }
               else {
               System.out.println("veuillez entrer une telephone valide(il doit avoir maximun 09 chiffre)");
               }
            }while(j>=699999999 || j<=611111111);
	       date(0); 
	       ecrirefichier(choix.get(el),nom, prenom,metier,telephone,jour,mois,annee);
	   }
    }
	public static void date (int nb){
     if (nb==0){
       sms_mois="entrer le mois d enregistrement du client en chiffre";
       sms_jour="entrer le jour d enregistrement du client en chiffre";
       sms_annee="enter l annee d enregistrement du client en chiffre";
     }
     else if (nb==1){
       sms_mois="entrer le mois d enregistrement du compte en chiffre ";
       sms_jour="entrer le jour d enregistrement du compte en chifre";
       sms_annee="enter l annee d enregistrement du compte en chiffre";
     }
     do {
    	 System.out.println(sms_mois);
         k1=touch.nextInt();
         if(k1>=1 && k1<=12) {
               mois=k1;
               if(mois==2) {
                 do {
                       System.out.println(sms_jour);
                       i=touch.nextInt();
                       if(i>=1 && i<=29) {
                           jour=i;
                           do {
                               System.out.println(sms_annee);
                               l=touch.nextInt();
                                 if(l>=1900 && l<=2300) {
                                   annee=l;
                                 }
                                 else {
                                   System.out.println("veuillez entrer une annee valide entre 1900 et 2300");
                                 }
                             }while(l<1900 || l>2300);
                       }
                       else {
                           System.out.println("veuillez entrer un jour valide");
                         }
                    }while(i<1 || i>29);
              }
              else if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12) {
                 do {
                       System.out.println(sms_jour);
                       i=touch.nextInt();
                         if(i>=1 && i<=31) {
                           jour=i;
                           do {
                               System.out.println(sms_annee);
                               l=touch.nextInt();
                                 if(l>=1900 && l<=2300) {
                                   annee=l;
                                 }
                                 else {
                                   System.out.println("veuillez entrer une annee valide entre 1900 et 2300");
                                 }
                             }while(l<1900 || l>2300);
                         }
                         else {
                           System.out.println("veuillez entrer un jour valide");
                         }
                    }while(i<1 || i>31);
               }
               else {
                 do {
                       System.out.println(sms_jour);
                       i=touch.nextInt();
                        if(i>=1 && i<=30) {
                           jour=i;
                           do {
                               System.out.println(sms_annee);
                               l=touch.nextInt();
                                 if(l>=1900 && l<=2300) {
                                   annee=l;
                                 }
                                 else {
                                	 System.out.println("veuillez entrer une annee valide entre 1900 et 2300");
                                 }
                             }while(l<1900 || l>2300);
                        }
                        else {
                           System.out.println("veuillez entrer un jour valide");
                        }
                    }while(i<1 || i>30);
                 }
           }
           else {
               System.out.println("veuillez entrer un mois valide");
             }
        }while(k1<1 || k1>12);
   } 
    public static String metier (){
         System.out.println("choisissez le metier du client");
         System.out.println("1- acteur\t 2- artiste\t 3- architecte\t 4- avocat\t 5- athlete\t 6- accessoiriste\t 7- banquier\t 8- barman\t 9- bebesiste\t 10- bibliothecaire\n 11- bijoutier\t 12- biologiste\t 13- biostaticien\t 14- blanchisseur\t 15- botaniste\t 16- boucher\t 17- boulanger\t 18- cableur\t 19- cadreur\t 20- caissier\n 21- cameraman\t 22- canalisateur\t 23- carreleur\t 24- carrosier\t 25- cartographe\t 26- cavalier\t 27- chanteur\t 28- chauffeur\t 29- chercheur\t 30- chimiste\n 31- chirurgien\t 32- coiffeur\t 33- comedien\t 34- commercant\t 35- comptable\t 36- couturier\t 37- cuisinier\t 38- danseur\t 39- decorateur\n");
         int pn=touch.nextInt();
         nk=pn;
         switch (nk){
           case 1:
             System.out.println("je suis acteur");
             metier="acteur";
             break;
            case 2:
              System.out.println("je suis artiste");
              metier="artiste";
              break;
            case 3:
              System.out.println("je suis architecte");
              metier="architecte";
              break;
            case 4:
                System.out.println("je suis avocat");
                metier="avocat";
                break;
            case 5:
                System.out.println("je suis athlete");
                metier="athlete";
                break;
            case 6:
                System.out.println("je suis accessoiriste");
                metier="accesssoiriste";
                break;
            case 7:
                System.out.println("je suis banquier");
                metier="banquier";
                break;
            case 8:
                System.out.println("je suis bamran");
                metier="barman";
                break;
            case 9:
                System.out.println("je suis bebesiste");
                metier="bebesiste";
                break;
            case 10:
                System.out.println("je suis bibliothecaire"); 
				metier="bibliothecaire";
                break;
            case 11:
              System.out.println("je suis bijoutier");
              metier="bijoutier";
              break;
            case 12:
              System.out.println("je suis biologiste");
              metier="biologiste";
              break;
            case 13:
              System.out.println("je suis biostaticien");
              metier="biostaticien";
              break;
            case 14:
                System.out.println("je suis blanchisseur");
                metier="blanchisseur";
                break;
            case 15:
                System.out.println("je suis botaniste");
                metier="botaniste";
                break;
            case 16:
                System.out.println("je suis boucher");
                metier="boucher";
                break;
            case 17:
                System.out.println("je suis boulanger");
                metier="boulanger";
                break;
            case 18:
                System.out.println("je suis cableur");
                metier="cableur";
                break;
            case 19:
                System.out.println("je suis cadreur");
                metier="cadreur";
                break;
            case 20:
                System.out.println("je suis caissier");
                metier="caissier";
                break;
            case 21:
             System.out.println("je suis cameraman");
             metier="cameraman";
             break;
            case 22:
              System.out.println("je suis canalisateur");
              metier="canalisateur";
              break;
            case 23:
              System.out.println("je suis carreleur");
              metier="carreleur";
              break;
            case 24:
                System.out.println("je suis carrossier");
                metier="carrossier";
                break;
            case 25:
                System.out.println("je suis cartographe");
                metier="cartographe";
                break;
            case 26:
                System.out.println("je suis cavalier");
                metier="cavalier";
                break;
            case 27:
                System.out.println("je suis chanteur");
                metier="chanteur";
                break;
            case 28:
                System.out.println("je suis chauffeur");
                metier="chauffeur";
                break;
            case 29:
                System.out.println("je suis chercheur");
                metier="chercheur";
                break;
            case 30:
                System.out.println("je suis chimiste");
                metier="chimiste";
                break;
            case 31:
             System.out.println("je suis chirurgien");
             metier="chirurgien";
             break;
            case 32:
              System.out.println("je suis coiffeur");
              metier="coiffeur";
              break;
            case 33:
              System.out.println("je suis comedien");
              metier="comedien";
              break;
            case 34:
                System.out.println("je suis commercant");
                metier="commercant";
                break;
            case 35:
                System.out.println("je suis comptable");
                metier="comptable";
                break;
            case 36:
                System.out.println("je suis couturier");
                metier="couturier";
                break;
            case 37:
                System.out.println("je suis cuisinier");
                metier="cuisinier";
                break;
            case 38:
                System.out.println("je suis danseur");
                metier="danseur";
                break;
            case 39:
                System.out.println("je suis decorateur");
                metier="decorateur";
                break;
           

         }
         return metier;
    }
    public static void modifier(){
		int j =1;
        int i=1;
        String m; 
		if (!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try(FileInputStream fis=new FileInputStream(file)){
			Scanner sc = new Scanner(fis);
			System.out.println("voici les identifiant client contenu dans la base de donnee");
			while(sc.hasNextLine()){
              String mot=sc.nextLine();
              char c=mot.charAt(0);
              char c1=mot.charAt(1);
              char c2=mot.charAt(2);
              m=(c+""+c1+""+c2);
              choix.add(m);
              System.out.println(j+" "+m+"");
               j++;
			}
            System.out.println("pour modifier un client veuillez entre le numero ce trouvant devant l identifiant en question ");
            i=1;
            r=touch.nextInt();
            try(FileInputStream fiss=new FileInputStream(file)){
			  Scanner tc = new Scanner(fiss);
			  while(tc.hasNextLine()){
               String mot=tc.nextLine();
               if(i!=r){
                  System.out.println(mot);
                  try (PrintWriter pw=new PrintWriter(new FileOutputStream(files,true))){
                        pw.println (mot);
                   }catch (IOException e){
                        e.printStackTrace();
                   }
               }
               else {
                   el=r-1;
                   Ajout_client(1);
               }
               i++;
             }
            }catch(IOException e){
			e.printStackTrace();
		    }
		    files.renameTo(file);
    	}catch(IOException e){
			e.printStackTrace();
		}
	}
    public static void Suppression(){
        System.out.println("si vous voulez supprimer un client taper 1 sinon pour supprimer tout les clients taper 2");
        int h=touch.nextInt();
        j=h;
        if(j==2){
			System.out.println("voulez vous vraiment supprimer tout les clients si oui taper 1 ");
			int l=touch.nextInt();
			j=l;
			if(j==1){
				file.delete();
				file1.delete();
				System.out.println("la Suppression de tout les client a ete effectuer");
				try{
					file.createNewFile(); file1.createNewFile();
                }catch (IOException k){
                    k.printStackTrace();
                }
            }
            else{
               System.out.println("la Suppression n a pas ete effectue");
            }
        }
        else if(j==1){
           /*System.out.println("voulez vous vraiment supprimer un client si oui taper 1 ");
			int l=touch.nextInt();
			j=l;
			if(j==1){*/
			    int j =1;
                int i=1;
                String m; 
		        if (!file.exists()){
		         	try{
			         	file.createNewFile();
		            }catch(IOException e){
			            e.printStackTrace();
		            }
	        	}
	        	try(FileInputStream fis=new FileInputStream(file)){
			        Scanner sc = new Scanner(fis);
			        System.out.println("voici les identifiants contenu dans la base de donnee");
			       while(sc.hasNextLine()){
						String mot=sc.nextLine();
						char c=mot.charAt(0);
						char c1=mot.charAt(1);
						char c2=mot.charAt(2);
						m=(c+""+c1+""+c2);
						System.out.println(j+" "+m+"");
						j++;
				   }
                   System.out.println("pour supprimer un client veuillez entre le numero ce trouvant devant l identifiant en question ");
                   i=1;
                   r=touch.nextInt();
				   System.out.println("voulez vous vraiment supprimer ce client si oui taper 1 ");
			       int o=touch.nextInt();
			       w=o;
				   if(w==1){
						try(FileInputStream fiss=new FileInputStream(file)){
			              Scanner tc = new Scanner(fiss);
			              while(tc.hasNextLine()){
                            String mot=tc.nextLine();
                            if(i!=r){
                                System.out.println(mot);
                                try (PrintWriter pw=new PrintWriter(new FileOutputStream(files,true))){
                                    pw.println (mot);
                                }catch (IOException e){
									e.printStackTrace();
                                }
                            }
                            i++;
                          }
                       }catch(IOException e){
							e.printStackTrace();
					   }
					   files.renameTo(file);
					   System.out.println("la Suppression a ete effectue a avec succes ");
				   }
                    else{
						System.out.println("la Suppression n a pas ete effectue");
					} 
    	       }catch(IOException e){
		      	e.printStackTrace();
	           }
		   /*}
		   else{
               System.out.println("la Suppression n a pas ete effectue");
            }*/
        }
        else {
           System.out.println("aucune Suppression n a pas ete effectue");
        }
    }	
    public static void recherche(File fill,int p){
		int j =1;
        int i=1;
        String m; 
		if (!fill.exists()){
			try{
				fill.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try(FileInputStream fis=new FileInputStream(fill)){
			Scanner sc = new Scanner(fis);
			System.out.println("voici les identifiants contenu dans la base de donnee");
			while(sc.hasNextLine()){
                 String mot=sc.nextLine();
                 char c=mot.charAt(0);
                 char c1=mot.charAt(1);
                 char c2=mot.charAt(2);
                 m=(c+""+c1+""+c2);
                 System.out.println(j+" "+m+"");
                 j++;
			}
			if(p==0){
			    System.out.println("pour voir les informations d un de ces client veuillez entre le numero ce trouvant devant l identifiant en question ");
			}
			else if(p==1){
			    System.out.println("pour voir les informations d un de ces compte veuillez entre le numero ce trouvant devant l identifiant en question ");
			}
            r=touch.nextInt();
            try(FileInputStream fiss=new FileInputStream(fill)){
			    Scanner tc = new Scanner(fiss);
		    	while(tc.hasNextLine()){
                     String mot=tc.nextLine();
                    if(i==r){
                       System.out.println(mot);
                    }
                    i++;
                }
            }catch(IOException e){
			    e.printStackTrace();
	    	}
    	}catch(IOException e){
			e.printStackTrace();
		}
	}   
    public static void afficher(int u) {
 
        if (!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try(FileInputStream fis=new FileInputStream(file)){
			Scanner sc = new Scanner(fis);
			System.out.println("\nidentifiant  NOM  PRENOM  metier  telephone  temps d enregistrement\n");
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
    }  
    public static int Id(int nb) {
       Random choix= new Random();
       if (nb==0){
         nombrealeatoire =choix.nextInt(100-1)+1;
       }
       else if (nb==1){
         nombrealeatoire =choix.nextInt(200-101)+1;
       }
         return nombrealeatoire;       
     }
     
    public static void Gestion_des_comptes(){
        
        System.out.println("\n$$$$$$$$$$$$$$$$ GESTION DES COMPTES $$$$$$$$$$$$$$$$\n");
        System.out.println("              1. Nouveau compte              ");
        System.out.println("              2. Consultation               ");
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
          nouveau_compte(ID_client,1);
          Gestion_des_comptes();
          break;
        case 2:
           System.out.println("=================================================================");
           consultation();
           Gestion_des_comptes();
           break;
        case 3:
            System.out.println("=================================================================");
            Fermeture_du_compte();
            Gestion_des_comptes();
            break;
        case 4:
            System.out.println("=================================================================");
            Afficher_les_comptes();
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
    public static void nouveau_compte (String id,int nb){
		int f=0;
		if(nb==0){
			System.out.println("\n maintenant que vous etes un client il vous faut un compte");
			Id (1);
		    ID_compte=(nombrealeatoire+"B");
	    	System.out.println("l identifiant de son nouveau compte est "+ID_compte);
	    	do{
		    	System.out.println("combien voulez vous mettre dans le compte?(superieir ou egal a 25 000)");
		    	int somme = touch.nextInt();
		    	f=somme;
		    	if (f <25000){
			        System.out.println("désolée mais la somme entré doit etre supérieur  a 25 000 FCFA");
			    }
	       	}while (f <25000);
	     	Dernier_action=("depot de "+f+"FCFA"); 
		    ecrirefichier(ID_compte ,ID_client,f,Dernier_action);
		}
		else if(nb==1){
		    int j =1;
            int i=1;
            String me; 
	     	if (!file.exists()){
			   try{
			     	file.createNewFile();
		       	}catch(IOException e){
			    	e.printStackTrace();
			    }
	    	}
		    try(FileInputStream fise=new FileInputStream(file)){
			    Scanner yc = new Scanner(fise);
			    System.out.println("voici les identifiant client contenu dans la base de donnee");
			    while(yc.hasNextLine()){
                    String mot=yc.nextLine();
                   char c=mot.charAt(0);
                   char c1=mot.charAt(1);
                   char c2=mot.charAt(2);
                   me=(c+""+c1+""+c2);
                  choix1.add(me);
                  System.out.println(j+" "+me+"");
                  j++;
			    }
		    }catch(IOException e){
		        e.printStackTrace();
		    }
		    System.out.println("veuillez entre le numero devant identifiant  du client qui possèdera ce compte entrer un numero non assigne pour d autre fonction");
			int chox=touch.nextInt();
				n1=chox;
				if (n1>(choix1.size()) ||n1<1){
					System.out.println("vue que le choix entrer est superieur a ceux proposer ont vous permet d en ajouter taper 1 si oui et 0 sinon"); 
					int choi=touch.nextInt();
			      	n1=choi;
			      	if(n1==1){
			      	    Ajout_client(0);
			      	}
				}
		    	else if(n1>0 && n1<(choix1.size()+1)){
		         	Id (1);
		            ID_compte=(nombrealeatoire+"B");
	             	System.out.println("l identifiant de son nouveau compte est "+ID_compte);
	             	 int nk=0;
	             	do{
	             	     
		    	         System.out.println("combien voulez vous mettre dans le compte?(superieir ou egal a 25 000)");
		    	         int somme = touch.nextInt();
		    	         nk=somme;
		    	         if (nk <25000){
			                   System.out.println("désolée mais la somme entré doit etre supérieur  a 25 000 FCFA");
			             }
	       	         }while (nk <25000);
	     	         Dernier_action=("depot de "+j+"FCFA"); 
		             ecrirefichier(ID_compte ,choix1.get(n1),nk,Dernier_action);
		    	}
		    }
    }
    public static void Afficher_les_comptes(){
       if (!file1.exists()){
			try{
				file1.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try(FileInputStream fis=new FileInputStream(file1)){
			Scanner sc = new Scanner(fis);
			System.out.println("\nidentifiant_compte identifiant_client solde  dernier action\n");
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
    }
    public static void compte_id_retrouve(int h,ArrayList<String> list){
	  File file2= new File(" devoir_groupe_4/Base_De_Donnee_Compte.txt");
		 int j =1;
        int i=1;
        String mse=""; 
		if (!file2.exists()){
			try{
				file2.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
  String moi="";
		try(FileInputStream fis=new FileInputStream(file2)){
			Scanner wc = new Scanner(fis);
		        while(wc.hasNextLine()){
                    String mot=wc.nextLine();
                    char k=mot.charAt(5);
                    char k1=mot.charAt(6);
                    char k2=mot.charAt(7);
                    char k3=mot.charAt(8);
                    if(k==' '){
                        mse=(k1+""+k2+""+k3);
                        moi=list.get(h-1);
                    }
					else if(k3==' '){
                        mse=(k+""+k1+""+k2);
                    }
                    choix3.add(mse);
                    System.out.println(i+" "+choix3.get (i-1));
                    String vue=choix3.get (i-1);
                    if(vue==moi){
                        System.out.println(mot);
                    }
                    i++;
		    	          }
				System.out.println  (choix3.get (1));
		}catch(IOException e){
		        e.printStackTrace();
		}
	}
	public static void consultation(){
	    recherche(file1,1);
	}
    public static void Fermeture_du_compte(){
		System.out.println("voulez vous vraiment supprimer un compte si oui taper 1 ");
			int l=touch.nextInt();
			j=l;
			if(j==1){
			    int j =1;
                int i=1;
                String m; 
		        if (!file1.exists()){
		         	try{
			         	file1.createNewFile();
		            }catch(IOException e){
			            e.printStackTrace();
		            }
	        	}
	        	try(FileInputStream fis=new FileInputStream(file1)){
			        Scanner sc = new Scanner(fis);
			        System.out.println("voici les identifiants des compte contenu dans la base de donnee");
			       while(sc.hasNextLine()){
						String mot=sc.nextLine();
						char c=mot.charAt(0);
						char c1=mot.charAt(1);
						char c2=mot.charAt(2);
						m=(c+""+c1+""+c2);
						System.out.println(j+" "+m+"");
						j++;
		       	   }
                   System.out.println("pour supprimer un compte veuillez entre le numero ce trouvant devant l identifiant du compte en question ");
                   i=1;
                   r=touch.nextInt();
                   try(FileInputStream fiss=new FileInputStream(file1)){
			            Scanner tc = new Scanner(fiss);
			            while(tc.hasNextLine()){
                            String mot=tc.nextLine();
                           if(i!=r){
                                System.out.println(mot);
                                try (PrintWriter pw=new PrintWriter(new FileOutputStream(files,true))){
                                    pw.println (mot);
                                }catch (IOException e){
                              e.printStackTrace();
                                }
                            }
                            i++;
                        }
                   }catch(IOException e){
			        e.printStackTrace();
		           }
		           files.renameTo(file1);
				   System.out.println("la Suppression a ete effectue a avec succes ");
    	       }catch(IOException e){
		      	e.printStackTrace();
	           }
		   }
		   else{
               System.out.println("la Suppression n a pas ete effectue");
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
            System.out.println("fonctionnalite bientot disponible");
            Gestion_des_operations();
            break;
        case 2:
            System.out.println("=================================================================");
            System.out.println("fonctionnalite bientot disponible");
            Gestion_des_operations();
            break;
        case 3:
            System.out.println("=================================================================");
            Menu_de_demarrage();
            break;
       }
    }
}
      
    
