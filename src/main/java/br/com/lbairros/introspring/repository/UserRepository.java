package br.com.lbairros.introspring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IRepository<String> {

    private List<String> database = new ArrayList<>();

    @Override
    public boolean insert(String entity) {
        return database.add (entity);
    }

    @Override
    public boolean update(String entity,int id) {
       int index = database.indexOf(entity);
       
       if (index == -1)
        return false;

       database.set(index, entity);
       return true;

    }

    @Override
    public String findByld(int id) {
        return database.get(id);
    }

    @Override
    public List<String> findAll() {
        return database;
    }

    @Override
    public boolean delete(int id) {
        var result = database.remove(id);
        return result != null;
         
       
    }


  
    }
    

