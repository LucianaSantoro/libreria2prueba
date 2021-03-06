package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper extends DataMapper<BookDTO, Book> {

    BookMapper MAPPER = Mappers.getMapper(BookMapper.class);

}
