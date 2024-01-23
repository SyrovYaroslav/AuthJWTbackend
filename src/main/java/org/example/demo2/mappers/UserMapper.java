package org.example.demo2.mappers;

import org.example.demo2.dto.SignUpDto;
import org.example.demo2.dto.UserDto;
import org.example.demo2.entitys.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
