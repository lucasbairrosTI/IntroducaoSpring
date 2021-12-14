package br.com.lbairros.introspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbairros.introspring.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping
    public List<String> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public boolean insert(@RequestBody String entity) {
        return userService.insert(entity);
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id) {
        // try catch SERVE PARA DAR UM AVISO AO USUARIO//
          try{
            return userService.findByld(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
                return "Houve um erro no sistema!!!";
        }
    }

    @PutMapping("/{id}")
    public boolean update(@RequestBody String entity,
    @PathVariable int id) {
        return userService.update(entity,id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return userService.delete(id) ;
    }

} 
