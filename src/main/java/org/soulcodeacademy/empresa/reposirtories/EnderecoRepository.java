package org.soulcodeacademy.empresa.reposirtories;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
