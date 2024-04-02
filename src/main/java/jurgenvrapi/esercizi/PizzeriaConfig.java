package jurgenvrapi.esercizi;

import jurgenvrapi.esercizi.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PizzeriaConfig {

    @Bean
    public List<Prodotto> prodotti() {
        List<Prodotto> prodotti = new ArrayList<>();


        Pizza margherita = new Pizza();
        margherita.setNome("Margherita");
        margherita.setPrezzo(4.99);
        margherita.setInformazioniNutrizionali("1104 calorie");

        prodotti.add(margherita);

        Topping prosciutto = new Topping();
        prosciutto.setNome("Prosciutto");
        prosciutto.setPrezzo(0.69);
        prosciutto.setInformazioniNutrizionali("1200 calorei");

        prodotti.add(prosciutto);

        Bevanda lemonade = new Bevanda();
        lemonade.setNome("Lemonade");
        lemonade.setPrezzo(1.29);
        lemonade.setInformazioniNutrizionali("128 calorie");

        prodotti.add(lemonade);

        return prodotti;
    }


    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        List<Prodotto> prodotti = prodotti();
        menu.aggiungiProdotto(prodotti);
        return menu;
    }

}

