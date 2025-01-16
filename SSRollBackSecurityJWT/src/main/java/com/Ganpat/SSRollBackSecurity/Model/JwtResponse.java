package com.Ganpat.SSRollBackSecurity.Model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class JwtResponse {
    private String JwtToken;
    private String UserName;
}
