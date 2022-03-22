package com.kmo.carpark.controller;

import com.kmo.carpark.dto.VehicleDTO;
import com.kmo.carpark.entity.PassangerCar;
import com.kmo.carpark.entity.Tractor;
import com.kmo.carpark.entity.Truck;
import com.kmo.carpark.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String index(Model model, @RequestParam(name = "carBrand", required = false) String carBrand,
                        @RequestParam(name = "carModel", required = false) String carModel,
                        @RequestParam(name = "carCategory", required = false) String carCategory,
                        @RequestParam(name = "carStateNumber", required = false) String carStateNumber,
                        @RequestParam(name = "yearOfProduction", required = false) String yearOfProduction){
//        List<Vehicle> vehicles = vehicleService.getAllVehicles();
//        model.addAttribute("vehicles", vehicles);
//        return "index";
        List<VehicleDTO> vehicleDTOs = vehicleService.getAllVehicles();

        if (carBrand != null){
            vehicleDTOs = vehicleDTOs.stream().filter(vehicleDTO -> vehicleDTO.getCarBrand().equals(carBrand)).collect(Collectors.toList());
        }
        if (carModel != null && !carModel.equals("")){
            vehicleDTOs = vehicleDTOs.stream().filter(vehicleDTO -> vehicleDTO.getCarModel().equals(carModel)).collect(Collectors.toList());
        }
        if (carCategory != null && !carModel.equals("")){
            vehicleDTOs = vehicleDTOs.stream().filter(vehicleDTO -> vehicleDTO.getCarCategory().equals(carCategory)).collect(Collectors.toList());
        }
        if (carStateNumber != null && !carStateNumber.equals("")){
            vehicleDTOs = vehicleDTOs.stream().filter(vehicleDTO -> vehicleDTO.getStateNumber().equals(carStateNumber)).collect(Collectors.toList());
        }
        if (yearOfProduction != null && !yearOfProduction.equals("")){
            vehicleDTOs = vehicleDTOs.stream().filter(vehicleDTO -> vehicleDTO.getYearOfProduction().equals(yearOfProduction)).collect(Collectors.toList());
        }

        model.addAttribute("vehiclesDTO", vehicleDTOs);
        return "index";
    }

    @GetMapping("/new/passenger")
    public String newPassenger(Model model){
        model.addAttribute("vehicle", new PassangerCar());
        return "new_passenger";
    }

    @GetMapping("/new/truck")
    public String newTruck(Model model){
        model.addAttribute("vehicle", new Truck());
        return "new_truck";
    }

    @GetMapping("/new/tractor")
    public String newTractor(Model model){
        model.addAttribute("vehicle", new Tractor());
        return "new_tractor";
    }

    @PostMapping("/passenger")
    public String createPassenger(@ModelAttribute("vehicle") PassangerCar passangerCar){
        if (passangerCar.getCarBrand() != "")
            vehicleService.saveVehicle(passangerCar);
        return "redirect:/vehicles";
    }

    @PostMapping("/truck")
    public String createTruck(@ModelAttribute("vehicle") Truck truck){
        if (truck.getCarBrand() != "")
            vehicleService.saveVehicle(truck);
        return "redirect:/vehicles";
    }

    @PostMapping("/tractor")
    public String createTractor(@ModelAttribute("vehicle") Tractor tractor){
        if (tractor.getCarBrand() != "")
            vehicleService.saveVehicle(tractor);
        return "redirect:/vehicles";
    }

}
