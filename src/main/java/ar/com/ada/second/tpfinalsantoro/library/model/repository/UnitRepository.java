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
public class UnitRepository implements JpaRepository <UnitRepository, Long> {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public List<UnitRepository> findAll() {
        return null;
    }

    @Override
    public List<UnitRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UnitRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UnitRepository> findAllById(Iterable<Long> iterable) {
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
    public void delete(UnitRepository unitRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends UnitRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UnitRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends UnitRepository> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<UnitRepository> findById(Long aLong) {
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
    public <S extends UnitRepository> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<UnitRepository> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UnitRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends UnitRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UnitRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UnitRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UnitRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UnitRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UnitRepository> boolean exists(Example<S> example) {
        return false;
    }
}
