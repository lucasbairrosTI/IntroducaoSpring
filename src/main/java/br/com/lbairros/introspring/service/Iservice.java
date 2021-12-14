package br.com.lbairros.introspring.service;

import java.util.List;

public interface Iservice<E>{
    public boolean insert(E entity);

    public boolean update(E entity, int id);

    public E findByld(int id);

    public List<E> findAll();

    public boolean delete(int id);
}
