public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar() {
        ligada = true;
        System.out.println("Novo Status - TV Ligada " + ligada);
    }

    public void desligar () {
        ligada = false;
        System.out.println("Novo Status - TV Ligada " + ligada);
    }

    public void aumentarVolume () {
       // volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void abaixarVolume () {
         // volume = volume - 1;
        volume--;
        System.out.println("Abaixando o volume para: " + volume);
    }

    public void aumentarCanal () {
        canal++;
        System.out.println("Canal Atual : " + canal);
    }

    public void diminuirCanal () {
        canal--;
        System.out.println("Canal Atual : " + canal);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal Atual : " + canal);
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
