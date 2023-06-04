package br.com.erick.ms.dataprovider.gateway.database.mapper;

import br.com.erick.ms.core.model.User;
import br.com.erick.ms.dataprovider.gateway.database.entity.UserEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserModelToUserEntityMapper implements Converter<User, UserEntity> {
    @Override
    public UserEntity convert(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .name(user.getName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .cpf(user.getCpf())
                .age(user.getAge())
                .dataDeNasc(user.getDataDeNasc())
                .build();
    }
}
