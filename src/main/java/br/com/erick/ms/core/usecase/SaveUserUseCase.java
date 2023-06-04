package br.com.erick.ms.core.usecase;

import br.com.erick.ms.core.model.User;
import br.com.erick.ms.core.usecase.boundary.SaveUserBoundary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveUserUseCase {


    private final SaveUserBoundary saveUserBoundary;

    User execute(User user){
     return saveUserBoundary.execute(user);

    }

}
