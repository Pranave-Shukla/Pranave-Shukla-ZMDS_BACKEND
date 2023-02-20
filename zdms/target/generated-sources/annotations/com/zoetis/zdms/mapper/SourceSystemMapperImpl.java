package com.zoetis.zdms.mapper;

import com.zoetis.zdms.api.dto.SourceSystemDto;
import com.zoetis.zdms.model.SourceSystem;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-09T00:27:59-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class SourceSystemMapperImpl implements SourceSystemMapper {

    @Override
    public SourceSystemDto mapSourceSystemToDto(SourceSystem sourceSystem) {
        if ( sourceSystem == null ) {
            return null;
        }

        SourceSystemDto sourceSystemDto = new SourceSystemDto();

        sourceSystemDto.setName( sourceSystem.getName() );

        return sourceSystemDto;
    }

    @Override
    public SourceSystemDto mapSourceSystemNameToDto(String sourceSystem) {
        if ( sourceSystem == null ) {
            return null;
        }

        SourceSystemDto sourceSystemDto = new SourceSystemDto();

        sourceSystemDto.setName( sourceSystem );

        return sourceSystemDto;
    }
}
