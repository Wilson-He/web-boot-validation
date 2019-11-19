package io.web.validation.vo;

import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * StringVO
 *
 * @author Wilson
 */
@Setter
@ToString
public class StringVO {
    @NotBlank
    private String value;

    public String value(){
        return this.value;
    }
}
