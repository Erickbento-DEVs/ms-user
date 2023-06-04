package br.com.erick.ms.dataprovider.gateway.database.repository;

import br.com.erick.ms.dataprovider.gateway.database.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
