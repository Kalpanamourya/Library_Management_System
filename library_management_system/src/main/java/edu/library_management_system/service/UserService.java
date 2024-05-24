package edu.library_management_system.service;

import edu.library_management_system_model.User;
import library_management_system.model.dto.UserRegistrationDto;

public interface UserService {
	User save (UserRegistrationDto userDto);
}
