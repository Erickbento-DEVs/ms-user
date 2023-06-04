package br.com.erick.ms.dataprovider.gateway.database.impl;

import br.com.erick.ms.core.model.User;
import br.com.erick.ms.core.usecase.boundary.SaveUserBoundary;
import br.com.erick.ms.dataprovider.gateway.database.entity.UserEntity;
import br.com.erick.ms.dataprovider.gateway.database.mapper.UserModelToUserEntityMapper;
import br.com.erick.ms.dataprovider.gateway.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SaveUserDbGateway implements SaveUserBoundary {

    private final UserRepository userRepository;
    private final UserModelToUserEntityMapper userModelToUserEntityMapper;
    @Override
    public void execute(User user) {
        UserEntity userEntity = userModelToUserEntityMapper.convert(user);

         userRepository.save(userEntity);
    }
}
