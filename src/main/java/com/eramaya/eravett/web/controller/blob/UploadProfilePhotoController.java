package com.eramaya.eravett.web.controller.blob;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.eramaya.eravett.service.profile.UploadProfilePhotoService;
import com.eramaya.eravett.web.form.JsonResponse;

@Controller
public class UploadProfilePhotoController {
	@Autowired
	private UploadProfilePhotoService uploadProfilePhotoService;
	
	@RequestMapping(value="/api/upload/photo/profile", method=RequestMethod.POST)
	public @ResponseBody JsonResponse uploadPhotoPatient(@RequestParam("file") MultipartFile file, 
			@RequestParam("profileId") Integer profileId,
			HttpServletResponse response) throws IOException {
		JsonResponse jr = new JsonResponse();
		try {
			Integer fileId = uploadProfilePhotoService.upload(file, profileId);
			jr.setStatus("success");
			jr.setResult(fileId);
		} catch (RuntimeException e){
			e.printStackTrace();
			jr.setStatus("error");
		}
		return jr;
	}

}
