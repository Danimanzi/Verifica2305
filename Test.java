
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test
{
    public static void main(String[] args){
        ListaNumeri n1= new ListaNumeri();
        n1.add(5);
        n1.add(4);
        System.out.println(n1.elenco());
        n1.rimuoviPrima();
        System.out.println(n1.elenco());
    }
}
