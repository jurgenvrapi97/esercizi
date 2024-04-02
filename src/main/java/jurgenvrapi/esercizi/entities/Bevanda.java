package jurgenvrapi.esercizi.entities;



import lombok.Data;

@Data
public class Bevanda extends Prodotto {
    private String nome;
    private double prezzo;
    private int calorie;
}



