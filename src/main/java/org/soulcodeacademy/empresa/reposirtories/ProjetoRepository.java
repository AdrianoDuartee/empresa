package org.soulcodeacademy.empresa.reposirtories;


import org.soulcodeacademy.empresa.domain.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
}
