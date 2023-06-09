package B2A3_M2S.mes.dto;

import B2A3_M2S.mes.entity.Processes;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ProcessesFormDto {

    public static ModelMapper modelMapper = new ModelMapper();

    private String procCd;      //공정 코드

    private String procNm;      //공정 이름

    private Long readyTime;   //준비 시간

    private Long workTime;    //작업 시간

    private Long capacity;   //생산 능력

    private String remark;      //비고

    private Character useYn;    //사용유무

    private String procUnit;        //단위

    private String readyUnit;   //준비시간 단위

    private String procState;       // 공정 상태



    public Processes createProcesses(){
        return modelMapper.map(this, Processes.class);
    }
}
