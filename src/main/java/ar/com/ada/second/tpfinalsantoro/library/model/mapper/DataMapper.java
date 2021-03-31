package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Book;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

public interface DataMapper<D, E> {

    E toEntity(D dto, @Context AvoidingMappingContext context);

    List<E> toEntity(List<D> dtoList, @Context AvoidingMappingContext context);

    @InheritInverseConfiguration
    D toDTO(E entity, @Context AvoidingMappingContext context);

    @InheritInverseConfiguration
    List<D> toDTO(List<E> entityList, @Context AvoidingMappingContext context);

}
