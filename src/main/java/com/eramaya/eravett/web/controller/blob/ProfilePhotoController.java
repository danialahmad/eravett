package com.eramaya.eravett.web.controller.blob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eramaya.eravett.service.blob.ImageService;
import com.google.common.io.ByteStreams;

@Controller
public class ProfilePhotoController {

	@RequestMapping("/api/profile/photo/{id}")
	public void view(@PathVariable("id") final Integer id,
                        final HttpServletResponse response){
		
		Resource resource = new ClassPathResource("img/avatar1.jpg");
		InputStream is;
		try {
			is = resource.getInputStream();
			byte[] bytes = IOUtils.toByteArray(is);
			bytes=ImageService.resize(bytes, 140, 140);
			is = new ByteArrayInputStream(bytes);
			
			final OutputStream os = response.getOutputStream();
			ByteStreams.copy(is, os);
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
