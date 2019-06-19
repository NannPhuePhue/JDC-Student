package com.jdc.tut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jdc.tut.entity.User;
import com.jdc.tut.service.UserService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

@Controller
public class LoginController {

	@FXML
	private TextField userName;

	@FXML
	private PasswordField password;

	@FXML
	private Label msg;

	@Autowired
	private UserService service;
	private static User user;

	public static User getUser() {
		return user;
	}

	@FXML
	void Cancle() {
		password.getScene().getWindow().hide();

	}

	@FXML
	void Login() {
		try {

			user = service.findBylogin(userName.getText(), password.getText());
			MainController.showMain();
			userName.getScene().getWindow().hide();

		} catch (Exception ex) {
			msg.setText(ex.getMessage());
		}

	}

}
