package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.component.BusinessLogicExceptionComponent;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.AvoidingMappingContext;
import ar.com.ada.second.tpfinalsantoro.library.model.mapper.BookMapper;
import ar.com.ada.second.tpfinalsantoro.library.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements Services<BookDTO, Book>{

    private BookMapper bookMapper = BookMapper.MAPPER;

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
    public BookDTO createNew(BookDTO dto) {
        Book book = bookMapper.toEntity(dto, context);

        bookRepository.save(book);

        BookDTO savedBook = bookMapper.toDTO(book, context);

        return savedBook;
    }



    @Override
    public List<BookDTO> getAll() {

        List <Book> bookList = bookRepository.findAll();

        List<BookDTO> bookDTO = bookMapper.toDTO(bookList, context);

        return bookDTO;
    }

    @Override
    public BookDTO getById(Long id) {

        Optional<Book> bookOptional = bookRepository.findById(id);

        Book book = bookOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Book", id));

        BookDTO bookDTO = bookMapper.toDTO(book, context);

        return bookDTO;
    }

    @Override
    public void remove(Long id) {

        Optional<Book> bookByIdToDelete = bookRepository.findById(id);

        Book book = bookByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        bookRepository.deleteById(id);

    }

    @Override
    public void mergeData(Book entity, BookDTO dto) {
        if (dto.hasNullOrEmptyAttributes())
            throw logicExceptionComponent.getExceptionEntityEmptyValues("Book");

        if (!entity.getAuthor().equals(dto.getAuthor()))
            entity.setAuthor(dto.getAuthor());

        if (!entity.getTitle().equals(dto.getTitle()))
            entity.setTitle(dto.getTitle());

        if (!entity.getUnits().equals(dto.getUnits()))
            entity.setUnits(dto.getUnits());


    }

    @Override
    public BookDTO update(BookDTO dto, Long id) {

        Optional<Book> bookOptional = bookRepository.findById(id);

        Book bookById = bookOptional
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Author", id));

        mergeData(bookById, dto);

        bookRepository.save(bookById);

        BookDTO updatedBook = bookMapper.toDTO(bookById, context);

        return updatedBook;
    }

    public BookDTO removeById(Long id) {
        Optional<Book> bookByIdToDelete = bookRepository.findById(id);

        Book book = bookByIdToDelete
                .orElseThrow(() -> logicExceptionComponent.getExceptionEntityNotFound("Artist", id));

        bookRepository.delete(book);

        BookDTO deletedBook = bookMapper.toDTO(book, context);

        return deletedBook;
    }

    public Long count(Long bookId) {
        return bookRepository.count();
    }
}
