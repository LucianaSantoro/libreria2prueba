package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Unit;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.UnitMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService implements Services<UnitDTO, Unit> {

    private UnitMapper unitMapper = UnitMapper.MAPPER;

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
    public UnitDTO createNew(UnitDTO dto) {
        return null;
    }

    @Override
    public List<UnitDTO> getAll() {
        return null;
    }

    @Override
    public UnitDTO getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(Unit entity, UnitDTO dto) {

    }

    @Override
    public UnitDTO update(UnitDTO dto, Long id) {
        return null;
    }
}
