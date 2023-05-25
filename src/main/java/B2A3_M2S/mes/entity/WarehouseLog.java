package B2A3_M2S.mes.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity(name = "warehouse_log")
@Table(name = "warehouse_log")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseLog extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String inoutNo;     //입출고 번호

    private String logGb;   //입출고 구분

    private String lotNo;

    private Long qty;   //수량

    private LocalDateTime logDate;     //입출고 일시

    private String remark;  //비고



    //외래키

    @ManyToOne
    @JoinColumn(name = "item_cd")
    private Item item;    //품목 코드
}
