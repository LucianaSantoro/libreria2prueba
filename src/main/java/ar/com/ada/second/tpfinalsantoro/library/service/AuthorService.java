package ar.com.ada.second.tpfinalsantoro.library.service;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Author;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AuthorMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AuthorService implements Services <AuthorDTO, Author> {


    private AuthorMapper authorMapper = AuthorMapper.MAPPER;

    @Autowired
    private AvoidingMappingContext context;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private EditionRepository editionRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private UserRepository userRepository;



    @Override
    public AuthorDTO createNew(AuthorDTO dto) {
        return null;
    }



    @Override
    public List<AuthorDTO> getAll() {
        return null;
    }

    @Override
    public AuthorDTO getById(Long id) {
        return null;
    }

    @Override
    public AuthorDTO update(AuthorDTO dto, Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(Author entity, AuthorDTO dto) {

    }

}

