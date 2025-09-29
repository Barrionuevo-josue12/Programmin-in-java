package ar.edu.unju.fi.domain;
import lombok.*;

import java.time.LocalDate;
@Getter
@Builder
@Setter
public class Client {
    private Long id;
    private String dni;
    private String name;
    private String email;
    private String adress;
    private LocalDate firstDayLogin;
    private UserAccountStatus status;
}
