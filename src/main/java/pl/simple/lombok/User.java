package pl.simple.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class User {
    private String firstName;
    private String lastName;
    private String email;
}
