package br.com.erick.ms.dataprovider.gateway.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -2564809296617415184L;

    @Id
    private String id;
    private String nam
            ;
    private String lastName;
    private String email;
    private String cpf;
    private int age;
    private LocalDate dataDeNasc;

}
