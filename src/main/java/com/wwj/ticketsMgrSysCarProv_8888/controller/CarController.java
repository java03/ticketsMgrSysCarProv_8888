package com.wwj.ticketsMgrSysCarProv_8888.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwj.ticketsMgrSysCarProv_8888.service.CarService;
import com.yueqian.ticketsMgr_domain_9000.domain.sysMgr.CarVO;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Resource
	private CarService carService;
	
	@RequestMapping("/getCars")
	public List<CarVO> getCars() {
		return  carService.getCars();
	}
	@RequestMapping("/getCarById/{vehicleId}")
	public CarVO getCarById(@PathVariable int vehicleId) {
		return  carService.getCarById(vehicleId);
	}
	@RequestMapping("/regCar")
	public boolean addCar(@RequestBody CarVO car) {
		return  carService.addCar(car);
	}
	@RequestMapping("/modifyCar")
	public boolean modifyCar(@RequestBody CarVO car) {
		return carService.modifyCar(car);
	}
	@RequestMapping("/deleteCarById/{vehicleId}")
	public boolean deleteCarById(@PathVariable int vehicleId) {
		return carService.deleteCarById(vehicleId);
	}
}
