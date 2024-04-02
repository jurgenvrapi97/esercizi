package jurgenvrapi.esercizi.entities;

import lombok.Data;

@Data
public class Topping extends Prodotto {
    private String nome;
    private double prezzo;
    private double calorie;

}
