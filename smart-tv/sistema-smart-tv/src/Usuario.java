public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar ();
        smartTv.desligar();
        smartTv.ligar ();

        smartTv.aumentarVolume();
        smartTv.abaixarVolume();

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.desligar();
     
        System.out.println(("Canal atual: " + smartTv.canal));
        
    }
    

}
