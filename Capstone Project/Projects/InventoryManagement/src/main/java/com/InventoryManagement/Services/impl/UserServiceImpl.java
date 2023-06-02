package com.InventoryManagement.Services.impl;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InventoryManagement.Exceptions.*;
import com.InventoryManagement.Payloads.Userdatatransfer;
import com.InventoryManagement.Services.UserService;

import com.InventoryManagement.entities.User;

import com.InventoryManagement.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
    
	
	@Autowired
	private UserRepo userRepo;
	
	
	
	@Override
	public Userdatatransfer CreateUser(Userdatatransfer userdto) {

        User user=this.dtoToUser(userdto);
        User savedUser=this.userRepo.save(user);
        
		return this.usertoDto(savedUser);
	}
	
	
	

	@Override
	public Userdatatransfer updateUser(Userdatatransfer userdto, Integer userId) {
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setAddress(userdto.getAddress());
		user.setAbout(userdto.getAbout());
		
		User updateduser=this.userRepo.save(user);
		return this.usertoDto(updateduser);
		
	}

	@Override
	public Userdatatransfer getUserById(Integer userId) {
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
		return this.usertoDto(user);
		
	}

	@Override
	public List<Userdatatransfer> getAllUsers() {
		List<User> users=this.userRepo.findAll();
		List<Userdatatransfer>UserDtos=users.stream().map(user->this.usertoDto(user)).collect(Collectors.toList());
		return UserDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
		this.userRepo.delete(user);

	}
	
	public User dtoToUser(Userdatatransfer userDTO)
	{
		User user=new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setPhone(userDTO.getPhone());
		user.setAbout(userDTO.getAbout());
		user.setAddress(userDTO.getAddress());
		return user;
		
	}
	
	public Userdatatransfer usertoDto(User user)
	{
		Userdatatransfer userDto=new Userdatatransfer();
		userDto.setName(user.getName());
		userDto.setId(user.getId());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setPhone(user.getPhone());
		userDto.setAbout(user.getAbout());
		userDto.setAddress(user.getAddress());
		return userDto;
		
	}
	}
	
		
	

	

	

	


