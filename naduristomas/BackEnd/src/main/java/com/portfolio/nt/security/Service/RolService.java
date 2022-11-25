package com.portfolio.nt.security.Service;

import com.portfolio.nt.security.Entity.Rol;
import com.portfolio.nt.security.Enums.RolNombre;
import com.portfolio.nt.security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> GetByRolNombre(RolNombre rolNombre){
            return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}