package com.aquiesce.mapstruct;

import com.aquiesce.mapstruct.domain.Car;
import com.aquiesce.mapstruct.domain.CarDto;
import com.aquiesce.mapstruct.domain.CarType;
import com.aquiesce.mapstruct.mapper.CarMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapStructApplication {

	public static void main(String[] args) {

		SpringApplication.run(MapStructApplication.class, args);

		runJob();
	}

	private static void runJob(){

		Car car = new Car("Allegro", 10, CarType.HATCHBACK);

		System.out.println("Car");
		System.out.println("------------------------------------");
		System.out.println(car.getMake());
		System.out.println(car.getNumberOfSeats());
		System.out.println(car.getType());

		CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

		System.out.println("------------------------------------");

		System.out.println("CarDto");
		System.out.println("------------------------------------");
		System.out.println(carDto.getMake());
		System.out.println(carDto.getSeatCount());
		System.out.println(carDto.getType());
	}

}
