package org.com.app.online.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.com.app.online.model.CredentialModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
@SessionAttributes({ "credentialModel" })
public final class MainController {

	@RequestMapping("/")
	public String initialScreen(Model model) {
		CredentialModel credentialModel = new CredentialModel();
		model.addAttribute("credentialModel", credentialModel);
		return "login";
	}

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.POST)
	public String login(@ModelAttribute CredentialModel credentialModel, Model model) throws InterruptedException, IOException {
		// TODO should apply some user authentication
		String user = "stellar";
		String password = "Stellar#2113";

		CredentialModel newCredentialModel = new CredentialModel();
		if (!user.equals(credentialModel.getUid()) || !password.equals(credentialModel.getPassword())) {
			model.addAttribute("credentialModel", newCredentialModel);
			model.addAttribute("isError", true);
			return "login";
		}

		return "forward:/home";
	}

	@RequestMapping("/home")
	public synchronized String listDashboards(HttpServletRequest servletRequest, WebRequest request,
			@Valid CredentialModel credentialModel, Model model) {
		String user = "stellar";
		String password = "Stellar#2113";

		CredentialModel newCredentialModel = new CredentialModel();
		if (!user.equals(credentialModel.getUid()) || !password.equals(credentialModel.getPassword())) {
			model.addAttribute("credentialModel", newCredentialModel);
			model.addAttribute("isError", true);
			return "login";
		}

		return "home";
	}

}