package clases;
import java.util.ArrayList;

public class Sala {
    private int numeroSala;
    private int capacidadSala;
    private int reservaSala;
    private ArrayList<Butaca> listaButacas=new ArrayList<Butaca>();

    public Sala(){
    }
 /*se crea el constructor y colocamos las funciones que necesitamos
    en este caso el for para que agregue mlas butacas hasta
    que llegue a la capacidadSala con la clase butaca
    y el otro es un while en donde de forma aleatoria se colocara
    las butacasocupadas dependiendo de que tanta sea la reserva*/
    public Sala(int numeroSala, int capacidadSala, int reservaSala) {
        for(int i=0;i<capacidadSala;i++){
            Butaca b=new Butaca(i+1, false);
            listaButacas.add(b);
        }
        int x=0;
        while(x<reservaSala){
            int randomButaca=generarRandom(0,capacidadSala-1);
            if(listaButacas.get(randomButaca).isOcupado()==false){
                listaButacas.get(randomButaca).setOcupado(true);
                x++;
            }
        }
        this.numeroSala = numeroSala;
        this.capacidadSala = capacidadSala;
        this.reservaSala = reservaSala;
    }
    /*formula para numeros aleatorios*/
    private int generarRandom(int menor, int mayor) {
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public int getReservaSala() {
        return reservaSala;
    }

    public void setReservaSala(int reservaSala) {
        this.reservaSala = reservaSala;
    }

    public ArrayList<Butaca> getListaButacas() {
        return listaButacas;
    }

    public void setListaButacas(ArrayList<Butaca> listaButacas) {
        this.listaButacas = listaButacas;
    }
    
}
