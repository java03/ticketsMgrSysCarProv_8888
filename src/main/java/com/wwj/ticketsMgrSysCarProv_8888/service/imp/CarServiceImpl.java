package com.wwj.ticketsMgrSysCarProv_8888.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wwj.ticketsMgrSysCarProv_8888.mapper.CarMapper;
import com.wwj.ticketsMgrSysCarProv_8888.service.CarService;
import com.yueqian.ticketsMgr_domain_9000.domain.sysMgr.CarVO;
@Service("CarService")
public class CarServiceImpl implements CarService {

	@Resource
	private CarMapper carMapper;
	
	@Override
	public List<CarVO> getCars() {
		
		return carMapper.getCars();
	}

	@Override
	public boolean addCar(CarVO car) {
		
		return carMapper.addCar(car) > 0 ? true : false;
	}

	@Override
	public boolean modifyCar(CarVO car) {
		
		return carMapper.modifyCar(car) > 0 ? true : false;
	}

	@Override
	public boolean deleteCarById(int vehicleId) {
		
		return carMapper.deleteCarById(vehicleId) > 0 ? true : false;
	}

	@Override
	public CarVO getCarById(int vehicleId) {
	
		return carMapper.getCarById(vehicleId);
	}



}
