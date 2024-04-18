
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modell.LyukasHenger;
import modell.MertaniHenger;
import modell.TomorHenger;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
        //hengerek.add(new MertaniHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        //hengerek.add(new LyukasHenger(1, 1, 0.5));
        hengerek.add(new LyukasHenger(1, 1, 0.1));
    }
    
    public void run(){
        int db = MertaniHenger.getHengerDb();
        System.out.printf("Hengerek (%d db) listája:\n", db);
        for (MertaniHenger henger : lista()) {
            System.out.println(henger);
            System.out.println("--- térfogata: " + henger.terfogat());
            if(henger instanceof TomorHenger)
            {
                System.out.println("--- súly: " + ((TomorHenger)henger).suly());
            }
            System.out.println("");
        }
        
        System.out.printf("átlagtérfogat (%d db): %f\n", db, atlagTerfogat());
        System.out.println("csövek súlya: " + csovekSulya());
        
        System.out.printf("Ez volt %d db henger statisztikája!",MertaniHenger.getHengerDb());
    }
    
    public double atlagTerfogat(){
        double ossz = 0;
        for (MertaniHenger h : hengerek) {
            ossz += h.terfogat();
        }
        return ossz;
    }
    
    public double csovekSulya(){
        double ossz = 0;
        for (MertaniHenger h : hengerek) {
            if(h instanceof LyukasHenger)
            ossz += h.terfogat();
        }
        return ossz;
    }
    
    private List<MertaniHenger> lista(){
        return Collections.unmodifiableList(hengerek);
    }
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }
    
}
