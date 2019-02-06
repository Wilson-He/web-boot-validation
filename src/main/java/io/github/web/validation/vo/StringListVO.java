package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * StringListVO
 *
 * @author Wilson
 */
@Setter
@Getter
@ToString
public class StringListVO {
    @NotNull
    private List<String> values;
}
