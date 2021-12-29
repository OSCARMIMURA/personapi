package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Oscar ";
    private static final String LAST_NAME = "Mimura";
    private static final String CPF_NUMERO = "660.440.640-77";
    private static final Long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1990, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMERO)
                .birthDate("04-04-2018")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMERO)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

}






