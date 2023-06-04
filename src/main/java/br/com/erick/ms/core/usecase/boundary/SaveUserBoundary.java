package br.com.erick.ms.core.usecase.boundary;

import br.com.erick.ms.core.model.User;

public interface SaveUserBoundary {

    void execute(User user);

}
