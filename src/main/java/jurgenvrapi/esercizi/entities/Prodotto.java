package jurgenvrapi.esercizi.entities;

import lombok.Data;

@Data
public abstract class Prodotto {
    private String nome;
    private double prezzo;
    private String informazioniNutrizionali;

}
