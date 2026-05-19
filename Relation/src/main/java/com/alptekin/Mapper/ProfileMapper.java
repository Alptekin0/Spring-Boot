package com.alptekin.Mapper;

import com.alptekin.Dto.DtoProfile;
import com.alptekin.Entity.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    Profile toEntity(DtoProfile dto);

    DtoProfile toDto(Profile profile);
}
