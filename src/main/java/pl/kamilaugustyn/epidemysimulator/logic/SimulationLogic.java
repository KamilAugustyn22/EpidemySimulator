package pl.kamilaugustyn.epidemysimulator.logic;


import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kamilaugustyn.epidemysimulator.simulation.Simulation;

@Setter
@NoArgsConstructor
public class SimulationLogic extends Simulation {
    private long pi; //liczba osób zarażonych
    private long pv; //liczba osób zdrowych podatnych na infekcje
    private long pm; //liczba osób zmarłych
    private long pr; //liczba osób, które nabyły odporność i wyzdrowiały

    public long getStartingPi(){
        return getInfected();
    }

    private void setPi(long pi) {
        this.pi = pi;
    }

    public void setPi(){
        this.setPi(this.getInfected());
    }
    public long getPi(){
        return getPopulation() - this.pv - this.pm - this.pr;
    }
    public long getPv(){
        return getPopulation() - this.pi - this.pm - this.pr;
    }
    public long getStartingPv(){
        return getPopulation() - getInfected();
    }
}
