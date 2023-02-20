package com.zoetis.zdms.mapper;

import com.zoetis.zdms.api.dto.AuthenticatedUserResponseDto;
import com.zoetis.zdms.api.dto.UserDto;
import com.zoetis.zdms.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-09T00:27:59-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto mapUserToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setEmailAddress( user.getEmailAddress() );

        return userDto;
    }

    @Override
    public AuthenticatedUserResponseDto mapUserToAuthenticatedUserResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        AuthenticatedUserResponseDto authenticatedUserResponseDto = new AuthenticatedUserResponseDto();

        authenticatedUserResponseDto.setUser( mapUserToDto( user ) );

        return authenticatedUserResponseDto;
    }
}
