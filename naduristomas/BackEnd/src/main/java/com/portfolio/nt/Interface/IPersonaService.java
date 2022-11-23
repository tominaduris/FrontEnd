package com.portfolio.nt.Interface;

import com.portfolio.nt.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona Persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
