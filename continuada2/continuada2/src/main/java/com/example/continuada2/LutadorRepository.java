package com.example.continuada2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {
    public Optional<Lutador> findAllByOrderByForcaLutaDesc();

    public Optional<Lutador> findByVidaGreaterThan(Double vida);

    public Optional<Lutador> findByVidaLessThan(Double vida);
}
