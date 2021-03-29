package ar.com.ada.second.tpfinalsantoro.library.model.mapper;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper extends DataMapper<AuthorDTO, Author> {

AuthorMapper MAPPER = Mappers.getMapper(AuthorMapper.class);

}
