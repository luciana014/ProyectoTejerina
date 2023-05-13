package com.portfolioweb.luciana.Interface;

import com.portfolioweb.luciana.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);    
}
