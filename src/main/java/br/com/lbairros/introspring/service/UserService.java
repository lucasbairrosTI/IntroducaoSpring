package br.com.lbairros.introspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;


import br.com.lbairros.introspring.repository.UserRepository;

@Service
public class UserService implements Iservice<String> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean insert(String entity) {
        return userRepository.insert(entity);
    }

    @Override
    public boolean update(String entity,int id) {
        if (entity != null && !entity.equals(""))
        return userRepository.insert(entity);
        return false;
    }

    @Override
    public String findByld(int id) {
        if (id >= 0)
        return userRepository.findByld(id);
        return null;
    }

    @Override
    public List<String> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean delete(int id) {
        if (id >= 0)
        return userRepository.delete(id);
        return false;
    }

    @PutMapping
    public boolean update(String entity) {
        return update(entity);
    }

    


    
}
