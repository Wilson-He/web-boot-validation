package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * StringVO
 *
 * @author Wilson
 */
@Setter
@Getter
@ToString
public class StringVO {

    @NotBlank
    private String value;
}
