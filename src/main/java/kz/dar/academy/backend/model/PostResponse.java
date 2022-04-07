package kz.dar.academy.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponse {
    @NotNull(message = "ID cannot be empty")
    private String postId;

    @NotNull(message = "Client data cannot be empty")
    private ClientResponse client;

    @NotNull(message = "Receiver data cannot be empty")
    private ClientResponse receiver;

    @NotNull(message = "Post item cannot be empty")
    private String postItem;

    @NotNull(message = "Status cannot be empty")
    private String status;
}
