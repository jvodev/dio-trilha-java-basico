public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarCanal();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirCanal();

        //System.out.println("Tv Ligada?");
        //if (smartTv.ligada)    {
        //    System.out.println("***TV está ligada***");
        //}
        //    else 
        //    System.out.println("***TV está desligada***");

    }

}
