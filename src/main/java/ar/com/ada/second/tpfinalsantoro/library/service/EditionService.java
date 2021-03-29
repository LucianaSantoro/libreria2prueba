package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Edition;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.EditionMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditionService implements Services <EditionDTO, Edition>{

    private EditionMapper editionMapper = EditionMapper.MAPPER;

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
    public EditionDTO createNew(EditionDTO dto) {
        return null;
    }

    @Override
    public List<EditionDTO> getAll() {
        return null;
    }

    @Override
    public EditionDTO getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(Edition entity, EditionDTO dto) {

    }

    @Override
    public EditionDTO update(EditionDTO dto, Long id) {
        return null;
    }
}
