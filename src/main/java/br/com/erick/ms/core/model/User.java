package br.com.erick.ms.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private String cpf;
    private int age;
    private LocalDate dataDeNasc;

}
