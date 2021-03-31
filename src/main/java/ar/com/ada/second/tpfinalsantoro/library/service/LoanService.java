package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.LoanDTO;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Loan;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.LoanMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class LoanService implements Services<LoanDTO, Loan>{

private LoanMapper loanMapper = LoanMapper.MAPPER;

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

    /*
    @Override


    public LoanDTO createNew(LoanDTO dto) {
        Loan loan = loanMapper.toEntity(dto, context);

        loanRepository.save(loan);

        AuthorDTO savedLoan = loanMapper.toDTO(loan, context);

        return savedLoan;
    }

    @Override
    public List<Loan> getAll() {
        List <Loan> loanList = loanRepository.findAll();

        List<LoanDTO> loanDTO = loanMapper.toDTO(loanList, context);

        return loanDTO;
    }

    @Override
    public LoanDTO getById(Long id) {
        Optional<Loan> loanOptional = loanRepository.findById(id);

        Loan loan = loanOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        AuthorDTO loanDTO = loanMapper.toDTO(loan, context);

        return loanDTO;
    }

    @Override
    public void remove(Long id) {
        Optional<Loan> loanByIdToDelete = loanRepository.findById(id);

        Loan loan = loanByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        loanRepository.deleteById(id);
        }
     */


    @Override
    public void mergeData(Loan entity, LoanDTO dto) {

    }

  /*  @Override
    public void mergeData(Loan entity, LoanDTO dto) {
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
            todo acorde a los datos que no tengo en loan. van?
            }
   */



    @Override
    public LoanDTO createNew(LoanDTO dto) {
        return null;
    }

    @Override
    public List<LoanDTO> getAll() {
        return null;
    }

    @Override
    public LoanDTO getById(Long id) {
        return null;
    }

    @Override
    public LoanDTO update(LoanDTO dto, Long id) {
        return null;
    }

    /* @Override
     public LoanDTO update(LoanDTO dto, Long id) {
         Optional<Loan> loanOptional = loanRepository.findById(id);

         Loan loanById = loanOptional
                 .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

         mergeData(loanById, dto);

         loanRepository.save(loanById);

         LoanDTO updatedLoan = loanMapper.toDTO(loanById, context);

         return updatedLoan;
     }


     */
    @Override
    public void remove(Long id) {

    }
}
