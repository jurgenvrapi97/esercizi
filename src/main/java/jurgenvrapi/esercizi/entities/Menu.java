package jurgenvrapi.esercizi.entities;

import jurgenvrapi.esercizi.entities.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Prodotto> prodotti;

    public Menu() {
        this.prodotti = new ArrayList<>();
    }



    public void aggiungiProdotto(List<Prodotto> prodotto) {
        prodotti.addAll(prodotto);
    }


    public void stampaMenu() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.getNome() + " - " + prodotto.getPrezzo() + "€ - " + prodotto.getInformazioniNutrizionali());
        }
    }
}




