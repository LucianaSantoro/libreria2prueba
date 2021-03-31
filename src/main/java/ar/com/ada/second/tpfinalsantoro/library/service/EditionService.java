package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Edition;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.EditionMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EditionService implements Services <EditionDTO, Edition> {

    private EditionMapper editionMapper = EditionMapper.MAPPER;

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
    public EditionDTO createNew(EditionDTO dto) {
        Edition edition = editionMapper.toEntity(dto, context);

        editionRepository.save(edition);

        EditionDTO savedEdition = editionMapper.toDTO(edition, context);

        return savedEdition;
    }

    @Override
    public List<EditionDTO> getAll() {
        List <Edition> editionList = editionRepository.findAll();

        List<EditionDTO> editionDTO = editionMapper.toDTO(editionList, context);

        return editionDTO;
    }

    @Override
    public EditionDTO getById(Long id) {
        Optional<Edition> editionOptional = editionRepository.findById(id);

        Edition edition = editionOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        EditionDTO editionDTO = editionMapper.toDTO(edition, context);

        return editionDTO;
    }


    @Override
    public EditionDTO update(EditionDTO dto, Long id) {
        Optional<Edition> editionOptional = editionRepository.findById(id);

        Edition editionById = editionOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        mergeData(editionById, dto);

        editionRepository.save(editionById);

        EditionDTO updatedEdition = editionMapper.toDTO(editionById, context);

        return updatedEdition;
    }



    @Override
    public void remove(Long id) {
        Optional<Edition> editionByIdToDelete = editionRepository.findById(id);

        Edition edition = editionByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        editionRepository.deleteById(id);
    }


    @Override
    public void mergeData(Edition entity, EditionDTO dto) {
        if (dto.hasNullOrEmptyAttributes())
            throw logicExceptionComponent.getExceptionEntityEmptyValues("Edition");

        if (!entity.getPublishingHouse().equals(dto.getPublishingHouse()))
            entity.setPublishingHouse(dto.getPublishingHouse());

        if (!entity.getYear().equals(dto.getYear()))
            entity.setYear(dto.getYear());

        if (!entity.getPrintingPlace().equals(dto.getPrintingPlace()))
            entity.setPrintingPlace(dto.getPrintingPlace());

    }


}

