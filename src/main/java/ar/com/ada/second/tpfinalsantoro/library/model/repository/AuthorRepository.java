package ar.com.ada.second.tpfinalsantoro.library.model.repository;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
