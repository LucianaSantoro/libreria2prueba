package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
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
    public void remove(Long id) {

    }

    @Override
    public void mergeData(Loan entity, LoanDTO dto) {

    }

    @Override
    public LoanDTO update(LoanDTO dto, Long id) {
        return null;
    }
}
