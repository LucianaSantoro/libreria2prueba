package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import org.mapstruct.factory.Mappers;

public interface BookMapper extends DataMapper<BookDTO, Book> {

    BookMapper MAPPER = Mappers.getMapper(BookMapper.class);

}
