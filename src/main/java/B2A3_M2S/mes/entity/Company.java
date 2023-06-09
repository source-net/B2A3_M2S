package B2A3_M2S.mes.entity;

import B2A3_M2S.mes.dto.CompanyDto;
import org.modelmapper.ModelMapper;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity(name = "company")
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class Company extends BaseTimeEntity{
    public static ModelMapper modelMapper;

    @Id
    @Column(name = "company_cd")
    private String companyCd;   //업체 코드

    private String companyNm;   //업체 이름

    private String phoneNumber;      //연락처

    private String address;     //주소

    private String remark;      //비고

    private Integer orderTime;  //주문 시간

    private Integer orderDay;   //배송 걸리는 시간
    //공통코드
    private String companyGb;   //업체 구분

    public static CompanyDto of(Company company){
        return modelMapper.map(company, CompanyDto.class);
    }

}

