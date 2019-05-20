package com.train.details.train.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.train.details.train.domain.Train;

@Repository
public interface TrainRepository extends MongoRepository<Train ,String> {
	
	public List<Train> findByStartlocationAndEndlocation(String start,String end);
	
	/*
	 * @Query(value="SELECT * from train") public List<String> getTrainstart();
	 */

}
 