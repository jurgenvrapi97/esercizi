package jurgenvrapi.esercizi.entities;


import lombok.Data;

@Data
public class Pizza extends Prodotto {
    private String nome;
    private double prezzo;
    private int calorie;

}
