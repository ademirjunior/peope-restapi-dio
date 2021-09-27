package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

    public  static final String PHONE_NUMBER = "79988888834";
    public  static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    public  static final long PHONE_ID = 1L;

    public static PhoneDTO cresteFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone cresteFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
