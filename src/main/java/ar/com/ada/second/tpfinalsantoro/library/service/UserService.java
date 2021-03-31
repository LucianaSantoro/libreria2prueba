package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserDTO;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.User;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.UserMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements Services<UserDTO, User>{

    private UserMapper userMapper = UserMapper.MAPPER;

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
    public UserDTO createNew(UserDTO dto) {
        User user = userMapper.toEntity(dto, context);

        userRepository.save(user);

        UserDTO savedUser = userMapper.toDTO(user, context);

        return savedUser;
    }

    @Override
    public List<UserDTO> getAll() {
        List <User> userList = userRepository.findAll();

        List<UserDTO> userDTO = userMapper.toDTO(userList, context);

        return userDTO;
    }

    @Override
    public UserDTO getById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        User user = userOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Book", id));

        UserDTO userDTO = userMapper.toDTO(user, context);

        return userDTO;
    }

    @Override
    public void remove(Long id) {
        Optional<User> userByIdToDelete = userRepository.findById(id);

        User user = userByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        userRepository.deleteById(id);

    }

    @Override
    public void mergeData(User entity, UserDTO dto) {
        if (dto.hasNullOrEmptyAttributes())
            throw logicExceptionComponent.getExceptionEntityEmptyValues("Book");

        if (!entity.getStudying().equals(dto.getStudying()))
            entity.setStudying(dto.getStudying());

        if (!entity.getBirthdate().equals(dto.getBirthdate()))
            entity.setBirthdate(dto.getBirthdate());

        if (!entity.getWorking().equals(dto.getWorking()))
            entity.setWorking(dto.getWorking());

        if (!entity.getName().equals(dto.getName()))
            entity.setName(dto.getName());

        if (!entity.getLastName().equals(dto.getLastName()))
            entity.setLastName(dto.getLastName());

        if (!entity.getId().equals(dto.getId()))
            entity.setId(dto.getId());

        if (!entity.getStudies().equals(dto.getStudies()))
            entity.setStudies(dto.getStudies());

    }

    @Override
    public UserDTO update(UserDTO dto, Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        User userById = userOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        mergeData(userById, dto);

        userRepository.save(userById);

        UserDTO updatedUser = userMapper.toDTO(userById, context);

        return updatedUser;
    }

    public UserDTO removeById(Long id) {
        Optional<User> userByIdToDelete = userRepository.findById(id);

        User user = userByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Artist", id));

        userRepository.delete(user);

        UserDTO deletedUser = userMapper.toDTO(user, context);

        return deletedUser;
    }
}
