package pl.kamilaugustyn.epidemysimulator.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulationLogicTest {
    SimulationLogic simulationLogic;

    @BeforeEach
    void setUp(){
         simulationLogic = new SimulationLogic();
    }

    @Test
    void piShouldBeTheSameAsInfected(){
        simulationLogic.setPopulation(100);
        simulationLogic.setInfected(2);
        simulationLogic.setPi();
        assertEquals(98, simulationLogic.getPv());
    }

    @Test
    void startingPvShouldBePopulationMinusInfected(){
        simulationLogic.setPopulation(1000);
        simulationLogic.setInfected(5);
        assertEquals(995, simulationLogic.getStartingPv());
    }
    @Test
    void piShouldBeEqualToPopulationMinusRestOfParameters (){
        simulationLogic.setPopulation(1000);
        simulationLogic.setPv(10);
        simulationLogic.setPm(10);
        simulationLogic.setPr(10);
        assertEquals(970, simulationLogic.getPi());
    }
    @Test
    void pvShouldBeEqualToPopulationMinusRestOfParameters(){
        simulationLogic.setPopulation(1000);
        simulationLogic.setInfected(10);
        simulationLogic.setPi();
        simulationLogic.setPm(10);
        simulationLogic.setPr(10);
        assertEquals(970, simulationLogic.getPv());
    }
}
