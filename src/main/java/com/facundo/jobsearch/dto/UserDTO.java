package com.facundo.jobsearch.dto;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String id;
    private String title;
    @SerializedName("firstName") //Esto se puede utilizar cuando no matchea el nombre de la variable con el json
    private String firstName;
    private String lastName;
    private String picture;
}
