package B2A3_M2S.mes.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObtainOrder extends BaseTimeEntity{

    @Id
    private String orderCd;    //수주코드

    private Long qty;   //수주량

    private LocalDateTime dueDate;  //납기일

    private LocalDateTime orderDate;   //수주일

    private String shipAdr; //배송지

    private String remark;  //비고

    private Character useYn; //사용유무


    /**외래키**/

    @ManyToOne
    @JoinColumn(name = "company_cd")
    private Company company; //업체 코드

    @ManyToOne
    @JoinColumn(name = "item_cd")
    private Item item;    //품목 코드

    //공통 코드
    private String orderState;   //수주 상태

    private String orderUnit;    //단위
    //공통 코드


}
