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
public class LoanRepository implements JpaRepository<LoanRepository, Long> {


    @Autowired
    private LoanRepository loanRepository;

    @Override
    public List<LoanRepository> findAll() {
        return null;
    }

    @Override
    public List<LoanRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LoanRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<LoanRepository> findAllById(Iterable<Long> iterable) {
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
    public void delete(LoanRepository loanRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends LoanRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends LoanRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends LoanRepository> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<LoanRepository> findById(Long aLong) {
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
    public <S extends LoanRepository> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<LoanRepository> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LoanRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends LoanRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LoanRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LoanRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LoanRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LoanRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LoanRepository> boolean exists(Example<S> example) {
        return false;
    }
}
