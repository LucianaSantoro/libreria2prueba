package ar.com.ada.second.tpfinalsantoro.library.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntityError {

    private String entity;
    private String message;
}
