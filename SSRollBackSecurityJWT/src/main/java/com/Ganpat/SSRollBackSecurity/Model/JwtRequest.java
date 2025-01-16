package com.Ganpat.SSRollBackSecurity.Model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtRequest {

    private String Email;
    private String Password;
}
