package com.zoetis.zdms.mapper;

import com.zoetis.zdms.api.dto.SortDirectionDto;
import com.zoetis.zdms.model.dictionary.pageparameter.sort.SortDirection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-09T00:27:59-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class SortDirectionMapperImpl implements SortDirectionMapper {

    @Override
    public SortDirection map(SortDirectionDto sortDirectionDto) {
        if ( sortDirectionDto == null ) {
            return null;
        }

        SortDirection sortDirection;

        switch ( sortDirectionDto ) {
            case ASC: sortDirection = SortDirection.ASC;
            break;
            case DESC: sortDirection = SortDirection.DESC;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + sortDirectionDto );
        }

        return sortDirection;
    }
}
