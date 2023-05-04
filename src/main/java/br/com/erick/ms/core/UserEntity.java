package br.com.erick.ms.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -2564809296617415184L;

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String cpf;
    private int age;
    private LocalDate dataDeNasc;

}
