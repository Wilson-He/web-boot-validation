package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * IntegerListVO
 */
@Getter
@Setter
@ToString
public class IntegerListVO {

    @NotNull
    @Size(min = 1)
    private List<Integer> values;
}
