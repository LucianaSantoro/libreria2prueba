package ar.com.ada.second.tpfinalsantoro.library.model.mapper;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Unit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface UnitMapper extends DataMapper <UnitDTO, Unit> {

    UnitMapper MAPPER = Mappers.getMapper(UnitMapper.class);

}
