package com.example.continuada2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {
    public List<Lutador> findAllByOrderByForcaLutaDesc();

    public List<Lutador> findByVidaGreaterThan(Double vida);

    public List<Lutador> findByVidaLessThan(Double vida);
}
