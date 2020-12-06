package taylorswifttour;

public class TaylorSwiftTour {
    int desidratacao;
    int presencaDePalco;
    int carisma;
    
    TaylorSwiftTour(int desidratacao ,int presencaDePalco , int carisma){
        this.desidratacao = desidratacao;
        this.presencaDePalco = presencaDePalco;
        this.carisma = carisma;
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
        if(desidratacao < 4 || presencaDePalco > 3 ){
            System.out.println("A pedido de muitos algo raro vai acontecer, vou dancar");
            presencaDePalco -=1;
            carisma -=2;
        }else{
            System.out.println("naaam, vou ficar so no violao mesmo");
            presencaDePalco +=1;
        }
    }
    
    void specialGuest (){
        System.out.println("Fiquem agora com a convidada especial Camila Cabello!!!");
        desidratacao -= 3 ;
        presencaDePalco +=3;
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
           return  " TaylorSwiftTour = desidratacao: " + desidratacao + " presencaDePalco: " + presencaDePalco + " carisma: " + carisma;
       }
    
    
    public static void main(String[] args) {
        
        TaylorSwiftTour taylor = new TaylorSwiftTour(1,5,8);
        
        System.out.println(taylor);
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.cantar();
        taylor.dancar();
        taylor.specialGuest();
        taylor.dancar();
        taylor.cantar();
        taylor.cantar();
        taylor.dancar();
        taylor.dancar();
        taylor.specialGuest();
        taylor.cantar();
        taylor.meetandgreet();
        System.out.println(taylor);        
    }
    
}