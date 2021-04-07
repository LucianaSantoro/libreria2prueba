package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserHasLoanDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.UserHasLoan;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AuthorMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.UserHasLoanMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserHasLoanService implements Services <UserHasLoanDTO, UserHasLoan>{

    private UserHasLoanMapper userHasLoan = UserHasLoanMapper.MAPPER;

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
    public UserHasLoanDTO createNew(UserHasLoanDTO dto) {
        return null;
    }

    @Override
    public List<UserHasLoanDTO> getAll() {
        return null;
    }

    @Override
    public UserHasLoanDTO getById(Long id) {
        return null;
    }

    @Override
    public UserHasLoanDTO update(UserHasLoanDTO dto, Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(UserHasLoan entity, UserHasLoanDTO dto) {

    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getCurrentDate() {
        return new Date();
    }
}
