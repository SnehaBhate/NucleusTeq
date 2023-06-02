package com.InventoryManagement.Services;

import java.util.List;

import com.InventoryManagement.Payloads.Userdatatransfer;


public interface UserService {
   Userdatatransfer CreateUser(Userdatatransfer userdto);
   Userdatatransfer updateUser(Userdatatransfer userdto,Integer userId);
   Userdatatransfer getUserById(Integer userId);
   List<Userdatatransfer> getAllUsers();
   void deleteUser(Integer userId);
   
   
}
