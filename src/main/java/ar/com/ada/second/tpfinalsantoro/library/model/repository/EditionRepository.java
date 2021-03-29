package ar.com.ada.second.tpfinalsantoro.library.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EditionRepository implements JpaRepository <EditionRepository, Long> {

    @Autowired
    private EditionRepository editionRepository;

    @Override
    public List<EditionRepository> findAll() {
        return null;
    }

    @Override
    public List<EditionRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<EditionRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<EditionRepository> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(EditionRepository editionRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends EditionRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends EditionRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends EditionRepository> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<EditionRepository> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends EditionRepository> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<EditionRepository> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public EditionRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends EditionRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends EditionRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends EditionRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends EditionRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends EditionRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends EditionRepository> boolean exists(Example<S> example) {
        return false;
    }
}
