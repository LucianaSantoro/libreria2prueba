package ar.com.ada.second.tpfinalsantoro.library.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements JpaRepository <UserRepository, Long> {

    @Override
    public List<UserRepository> findAll() {
        return null;
    }

    @Override
    public List<UserRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UserRepository> findAllById(Iterable<Long> iterable) {
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
    public void delete(UserRepository userRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends UserRepository> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<UserRepository> findById(Long aLong) {
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
    public <S extends UserRepository> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<UserRepository> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserRepository> boolean exists(Example<S> example) {
        return false;
    }
}
