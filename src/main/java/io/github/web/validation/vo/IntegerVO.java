package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * IntegerVO
 *
 * @author Wilson
 */
@Setter
@Getter
@ToString
public class IntegerVO {

    @NotNull
    private Integer value;
}
