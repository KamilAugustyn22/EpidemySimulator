package pl.kamilaugustyn.epidemysimulator.simulation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SimulationRepository extends JpaRepository<Simulation, Long> {
}