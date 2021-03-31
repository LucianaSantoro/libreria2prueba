package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Unit;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.UnitMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitService implements Services<UnitDTO, Unit> {

    private UnitMapper unitMapper = UnitMapper.MAPPER;

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
    public UnitDTO createNew(UnitDTO dto) {
        Unit unit = unitMapper.toEntity(dto, context);

        unitRepository.save(unit);

        UnitDTO savedUnit = unitMapper.toDTO(unit, context);

        return savedUnit;

    }

    @Override
    public List<UnitDTO> getAll() {
        List <Unit> unitList = unitRepository.findAll();

        List<UnitDTO> unitDTO = unitMapper.toDTO(unitList, context);

        return unitDTO;

    }

    @Override
    public UnitDTO getById(Long id) {
        Optional<Unit> unitOptional = unitRepository.findById(id);

        Unit unit = unitOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Unit", id));

        UnitDTO unitDTO = unitMapper.toDTO(unit, context);

        return unitDTO;
    }

    @Override
    public void remove(Long id) {
        Optional<Unit> unitByIdToDelete = unitRepository.findById(id);

        Unit unit = unitByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Unit", id));

        unitRepository.deleteById(id);
    }

    @Override
    public void mergeData(Unit entity, UnitDTO dto) {
        if (dto.hasNullOrEmptyAttributes())
            throw logicExceptionComponent.getExceptionEntityEmptyValues("Unit");

        if (!entity.getUnitCondition().equals(dto.getUnitCondition()))
            entity.setUnitCondition(dto.getUnitCondition());
    }

    @Override
    public UnitDTO update(UnitDTO dto, Long id) {
        Optional<Unit> unitOptional = unitRepository.findById(id);

        Unit unitById = unitOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Unit", id));

        mergeData(unitById, dto);

        unitRepository.save(unitById);

        UnitDTO updatedUnit = unitMapper.toDTO(unitById, context);

        return updatedUnit;
    }
}
