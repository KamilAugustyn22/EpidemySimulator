package pl.kamilaugustyn.epidemysimulator.simulation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity(name = "simulations")
public class Simulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long population;
    private int infected;
    private int r; //wskaźnik określający ile osób zaraża jedna osoba
    private double mortality;
    private int ti; //ilość dni od zarażenia do wyzdrowienia
    private int tm; //ilość dni od zarażenia do śmierci
    private long ts; //czas trwania symulacji - w dniach

}
