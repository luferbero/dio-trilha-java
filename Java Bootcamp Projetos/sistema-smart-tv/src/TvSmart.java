public class TvSmart  {
    boolean ligada=false;
    int canal=2;
    int volume=25;


    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        volume++;
    }
    public void diminuirCanal(){
        volume--;
    }

    public void diminuirVolume(){
        volume--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    
}