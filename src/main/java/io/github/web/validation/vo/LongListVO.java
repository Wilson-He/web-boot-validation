package io.github.web.validation.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * LongListVO
 *
 * @author Wilson
 */
@Getter
@Setter
@ToString
public class LongListVO {

    @NotNull
    @Size(min = 1)
    private List<Long> values;
}
