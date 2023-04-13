package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service;
    }
}
