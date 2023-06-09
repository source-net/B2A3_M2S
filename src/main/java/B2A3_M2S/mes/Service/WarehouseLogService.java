package B2A3_M2S.mes.service;

import B2A3_M2S.mes.dto.ItemDto;
import B2A3_M2S.mes.dto.WarehouseLogDTO;
import B2A3_M2S.mes.entity.CommonCode;
import B2A3_M2S.mes.entity.Item;
import B2A3_M2S.mes.entity.QWarehouseLog;
import B2A3_M2S.mes.entity.WarehouseLog;
import B2A3_M2S.mes.repository.StockRepository;
import B2A3_M2S.mes.repository.WarehouseLogRepository;
import B2A3_M2S.mes.service.CodeServiceImpl;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseLogService {

    @Autowired
    WarehouseLogRepository warehouseLogRepository;

    @Autowired
    StockRepository stockRepository;

    public void insertStock(Item item,String lotNo, String logGb, Long qty){



        WarehouseLog warehouseLog = WarehouseLog.builder()
                .item(item)
                .lotNo(lotNo)
                .logGb(logGb)
                .qty(qty)
                .build();

        warehouseLogRepository.save(warehouseLog);



    }

    public List<WarehouseLogDTO> getWareHouseLog(){

        List<WarehouseLog> warehouseLogList = new ArrayList<>();
        warehouseLogList = warehouseLogRepository.findAll();

        List<WarehouseLogDTO> warehouseLogDTOList = WarehouseLogDTO.of(warehouseLogList);
        for (WarehouseLogDTO warehouseLogDTO : warehouseLogDTOList){
            warehouseLogDTO.setWarehouseGb(CodeServiceImpl.getCodeNm("WAREHOUSE_GB", warehouseLogDTO.getLogGb()));
            warehouseLogDTO.setItemGb(CodeServiceImpl.getCodeNm("ITEM_GB", warehouseLogDTO.getItem().getItemGb()));

        }
        return warehouseLogDTOList;
    }


}
