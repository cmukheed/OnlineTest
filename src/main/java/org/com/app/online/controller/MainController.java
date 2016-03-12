package org.com.app.online.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.com.app.online.model.CredentialModel;
import org.com.app.online.util.PropertyReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "credentialModel" })
public final class MainController {

	@RequestMapping("/tests")
	public String initialScreen(Model model) {
		CredentialModel credentialModel = new CredentialModel();
		model.addAttribute("credentialModel", credentialModel);
		return "login";
	}

	@RequestMapping(value = {"/loginsuccess" }, method = RequestMethod.POST)
	public String login(@ModelAttribute CredentialModel credentialModel, Model model) throws InterruptedException, IOException {
		String user = "admin";
		String password = "admin";

		CredentialModel newCredentialModel = new CredentialModel();
		if (!user.equals(credentialModel.getUid()) || !password.equals(credentialModel.getPassword())) {
			model.addAttribute("credentialModel", newCredentialModel);
			model.addAttribute("isError", true);
			return "login";
		}

		return "forward:/dashboard";
	}
	
	
	@RequestMapping(value = {"/login" }, method = RequestMethod.POST)
	public String loginpage(@ModelAttribute CredentialModel credentialModel, HttpServletRequest servletRequest, Model model) throws InterruptedException, IOException {
		CredentialModel newcredentialModel = new CredentialModel();
		model.addAttribute("credentialModel", newcredentialModel);
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "login";
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public synchronized String homePage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		model.addAttribute("home", new PropertyReader().getProperties("home.properties"));
		model.addAttribute("results", new PropertyReader().getProperties("results.properties"));
		model.addAttribute("tweets", new PropertyReader().getProperties("tweets.properties"));
		return "home";
	}
	
	@RequestMapping(value = { "/aboutus" }, method = RequestMethod.GET)
	public synchronized String aboutUsPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		model.addAttribute("aboutus", new PropertyReader().getProperties("aboutus.properties"));
		return "aboutus";
	}
	
	@RequestMapping(value = { "/navigationbar" }, method = RequestMethod.GET)
	public synchronized String navigationPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "navigationbar";
	}
	
	@RequestMapping(value = { "/registration" }, method = RequestMethod.GET)
	public synchronized String registrationPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "registration";
	}
	
	@RequestMapping(value = { "/classes" }, method = RequestMethod.GET)
	public synchronized String classesPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "classes";
	}
	
	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
	public synchronized String contactusPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "contactus";
	}
	
	@RequestMapping(value = { "/previouspapers" }, method = RequestMethod.GET)
	public synchronized String previouspapersPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "previouspapers";
	}
	
	@RequestMapping(value = { "/material" }, method = RequestMethod.GET)
	public synchronized String materialPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "material";
	}
	
	@RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	public synchronized String dashboardPage(HttpServletRequest servletRequest, Model model) {
		model.addAttribute("footer", new PropertyReader().getProperties("footer.labels"));
		return "material";
	}

}