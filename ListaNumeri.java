import java.util.*;
/**
 * Aggiungi qui una descrizione della classe ListaNumeri
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class ListaNumeri{
    LinkedList<Integer> numeri;

    /**
     * Costruttore degli oggetti di classe  ListaNumeri
     */
    public ListaNumeri(){
        numeri = new LinkedList();
    }

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    public void add(Integer i){
        numeri.add(i);
    }
    
    public void rimuoviPrima(){
        Integer t=numeri.get(0);
        numeri.remove(t);
    }
    
    public String elenco(){
        String s="";
        for(Integer numero: numeri){
            s+=numero+" ";
        }
        return s;
    }
    
    
}
