package edu.lennon.smart;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        // String estado = "Desligada";

        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(13);
        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.desligar();
    }
}
