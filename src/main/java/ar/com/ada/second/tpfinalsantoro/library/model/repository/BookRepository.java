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
public class BookRepository implements JpaRepository<BookRepository, Long> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookRepository> findAll() {
        return null;
    }

    @Override
    public List<BookRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BookRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<BookRepository> findAllById(Iterable<Long> iterable) {
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
    public void delete(BookRepository bookRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends BookRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends BookRepository> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<BookRepository> findById(Long aLong) {
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
    public <S extends BookRepository> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<BookRepository> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BookRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends BookRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BookRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BookRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BookRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BookRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BookRepository> boolean exists(Example<S> example) {
        return false;
    }
}
