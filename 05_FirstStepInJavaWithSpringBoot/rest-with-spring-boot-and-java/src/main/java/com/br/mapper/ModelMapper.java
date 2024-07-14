package com.br.mapper;

import java.util.List;


public class ModelMapper {
	

public static <O, D> D parseObject(O origin, Class<D> destination) {
	
	 return  ModelMapper.parseObject(origin, destination);
 }
 
 
 public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
	
	 return ModelMapper.parseListObjects(origin, destination);
 }
}
