package com.example.textiletest.services;

import com.example.textiletest.entities.Textile;
import com.example.textiletest.repositories.TextileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TextileService {

    @Autowired
    TextileRepository textileRepository;

    public void save(Textile textile){

        textileRepository.save(textile);
    }
    public List<Textile> findAll(){

        return (List<Textile>) textileRepository.findAll();
    }

    public void deleteById(long id){
        textileRepository.deleteById(id);
    }


}
