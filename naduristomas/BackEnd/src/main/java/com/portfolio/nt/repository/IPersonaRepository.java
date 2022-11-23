package com.portfolio.nt.repository;

import com.portfolio.nt.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {

    public List<Persona> findAll();

    public void delete(Long id);
    
}
