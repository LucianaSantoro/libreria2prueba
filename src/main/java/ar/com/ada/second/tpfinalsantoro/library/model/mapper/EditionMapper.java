package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Edition;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EditionMapper extends DataMapper <EditionDTO, Edition>{

    EditionMapper MAPPER = Mappers.getMapper(EditionMapper.class);
}
