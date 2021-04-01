package ar.com.ada.second.tpfinalsantoro.library.service;


import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Author;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AuthorMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorService implements Services <AuthorDTO, Author> {


    private AuthorMapper authorMapper = AuthorMapper.MAPPER;

    @Autowired
    private AvoidingMappingContext context;

    @Autowired
    private BusinessLogicExceptionComponent logicExceptionComponent;

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
        Author author = authorMapper.toEntity(dto, context);

        authorRepository.save(author);

        AuthorDTO savedAuthor = authorMapper.toDTO(author, context);

        return savedAuthor;
    }


    @Override
    public List<AuthorDTO> getAll() {
        List <Author> authorList = authorRepository.findAll();

        List<AuthorDTO> authorDTO = authorMapper.toDTO(authorList, context);

        return authorDTO;
    }

    @Override
    public AuthorDTO getById(Long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);

        Author author = authorOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        AuthorDTO authorDTO = authorMapper.toDTO(author, context);

        return authorDTO;
    }

    @Override
    public AuthorDTO update(AuthorDTO dto, Long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);

        Author authorById = authorOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        mergeData(authorById, dto);

        authorRepository.save(authorById);

        AuthorDTO updatedAuthor = authorMapper.toDTO(authorById, context);

        return updatedAuthor;
    }

    @Override
    public void remove(Long id) {
        Optional<Author> authorByIdToDelete = authorRepository.findById(id);

        Author author = authorByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        authorRepository.deleteById(id);

    }

    @Override
    public void mergeData(Author entity, AuthorDTO dto) {

        if (dto.hasNullOrEmptyAttributes())
            throw logicExceptionComponent.getExceptionEntityEmptyValues("Author");

        if (!entity.getName().equals(dto.getName()))
            entity.setName(dto.getName());

        if (!entity.getLastName().equals(dto.getLastName()))
            entity.setLastName(dto.getLastName());

        if (!entity.getBirthdate().equals(dto.getBirthdate()))
            entity.setBirthdate(dto.getBirthdate());

        if (!entity.getBirthplace().equals(dto.getBirthplace()))
            entity.setBirthdate(dto.getBirthdate());

        if (!entity.getBiography().equals(dto.getBiography()))
            entity.setBiography(dto.getBiography());

    }



    public AuthorDTO removeById(Long id) {
        Optional<Author> artistByIdToDelete = authorRepository.findById(id);

        Author artist = artistByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Artist", id));

        authorRepository.delete(artist);

        AuthorDTO deletedAuthor = authorMapper.toDTO(artist, context);

        return deletedAuthor;
    }
}


