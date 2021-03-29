package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserDTO;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.User;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.UserMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements Services<UserDTO, User>{

    private UserMapper userMapper = UserMapper.MAPPER;

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
    public UserDTO createNew(UserDTO dto) {
        return null;
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public UserDTO getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(User entity, UserDTO dto) {

    }

    @Override
    public UserDTO update(UserDTO dto, Long id) {
        return null;
    }
}
