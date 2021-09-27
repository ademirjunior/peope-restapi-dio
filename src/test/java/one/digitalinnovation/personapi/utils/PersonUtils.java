package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {
    private static final String FIRST_NAME = "ADEMIR";
    private static final String LAST_NAME= "JUNIOR";
    private static final String CPF = "012.345.678-10";
    private static final long ID= 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010,01,01);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate("01-02-2001")
                .phones(Collections.singletonList(PhoneUtils.cresteFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.cresteFakeEntity()))
                .build();
    }
}
