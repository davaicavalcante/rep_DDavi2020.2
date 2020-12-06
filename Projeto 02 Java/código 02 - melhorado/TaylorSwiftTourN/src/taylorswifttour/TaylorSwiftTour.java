package taylorswifttour;

import java.util.Scanner;


public class TaylorSwiftTour {
    int desidratacao;
    int presencaDePalco;
    int carisma;
    
    
    
    TaylorSwiftTour(int desidratacao ,int presencaDePalco , int carisma){
        this.desidratacao = desidratacao;
        this.presencaDePalco = presencaDePalco;
        this.carisma = carisma;
        
    }
    void ensaio (){
        System.out.println("O ensaio foi otimo, agora me sinto pronta para o show!");
        desidratacao +=1;
        presencaDePalco += 2 ;
        carisma += 5;
    }
    
    void entrevistaAntesDoShow(){
        if(carisma>2){
            System.out.println("Ola, boa noite! Aqui é a Taylor Swift e venho convidar a todos para o ultimo show da minha turne. Vai ser lindo. Vai ser magico.");
        }else{
            System.out.println("A midia é manipulativa e espalha falsas verdades, cansei!!!!!!");
        }
    }
    void cantar (){
        if(desidratacao < 4 ){
            System.out.println("aisaikiroooofff aisaikiroooofff hmhmhm");
        desidratacao += 1;
        }else{
            System.out.println("eu gostaria de ser excluida dessa narrativa para ir tomar uma agua!");
            desidratacao -= 1;
        }
    }
    void dancar(){
        if(desidratacao < 4 || presencaDePalco > 4 ){
            System.out.println("A pedido de muitos algo raro vai acontecer, vou dancar");
            presencaDePalco -=3;
            carisma -=2;
        }else{
            System.out.println("naaam, vou ficar so no violao mesmo");
            presencaDePalco +=1;
            desidratacao -= 1;
        }
    }
    
    void specialGuest (){
        System.out.println("Fiquem agora com a convidada especial Camila Cabello!!!");
        desidratacao -= 3 ;
        presencaDePalco +=1;
        carisma += 4;
    }
 
       void meetandgreet (){
        if(carisma > 2){
            System.out.println("OMG!!!!! Eu amo voces, gratidao!!!!");
        }else{
            System.out.println("nao vai rolar meet aqui nao, podem ir embora, paguem seus boletos!!!!");
        }
    }
       
       public String ToString(){
           return  " Taylor esta no nivel" + desidratacao + "de desidratacao, " + " a presenca de palco é" + presencaDePalco + ", "+ " e esta com " + carisma + "de carisma";
       }
    
    
    public static void main(String[] args) {
        
        Scanner stats = new Scanner(System.in);
        
        System.out.println("Qual o nivel de desidratacao da Taylor?");
        int desidratacao =stats.nextInt();
        
        System.out.println("Qual o nivel da presenca de palco da Taylor? ");
        int presencaDePalco =stats.nextInt();
        
        System.out.println("Com quanto de carisma Taylor acordou hoje?");
        int carisma =stats.nextInt();
        
        
        stats.close();
        
         TaylorSwiftTour taylor = new TaylorSwiftTour (desidratacao, presencaDePalco, carisma);
         
         System.out.println(taylor);
        
         
        taylor.ensaio();
        taylor.entrevistaAntesDoShow();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.dancar();
        taylor.dancar();
        taylor.dancar();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.dancar();
        taylor.specialGuest();
        taylor.dancar();
        taylor.cantar();
        taylor.dancar();
        taylor.dancar();
        taylor.cantar();
        taylor.dancar();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.dancar();
        taylor.specialGuest();
        taylor.cantar();
        taylor.meetandgreet();
        System.out.println(taylor);        
    }
    
}