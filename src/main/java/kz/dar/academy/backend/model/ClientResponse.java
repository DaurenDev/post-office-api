package kz.dar.academy.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientResponse {
    @NotNull(message = "Name cannot be empty")
    private String name;

    @NotNull(message = "Surname cannot be empty")
    private String surname;

    @Email(message = "Email cannot be empty or email is not correct")
    private String email;
}
