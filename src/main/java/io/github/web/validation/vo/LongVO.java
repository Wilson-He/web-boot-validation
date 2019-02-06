package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * LongVO
 *
 * @author Wilson
 */
@Setter
@Getter
@ToString
public class LongVO {

    @NotNull
    private Long value;
}
