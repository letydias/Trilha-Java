public class Usuario{
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);
    }
}