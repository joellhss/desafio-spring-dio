package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;

import java.util.List;

public interface MatriculaRepository {

    List<Matricula> findByAlunoBairro(String bairro);
}
