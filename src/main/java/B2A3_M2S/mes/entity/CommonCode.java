package B2A3_M2S.mes.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonCode extends BaseTimeEntity {
    @EmbeddedId
    private CommonCodePK codeId;
    private String displayValue;    //코드명
    private int codeSort;   //정렬 순서
    private Character useYn;    // 사용유무
    private String remark;      // 수정

    /*
    public String getCodeGroup() {
        return this.codeId.getCodeGroup();
    }
*/

    public String getCd() {
        return this.codeId.getCd();
    }
}
