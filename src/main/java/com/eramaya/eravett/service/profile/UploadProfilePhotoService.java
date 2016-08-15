package com.eramaya.eravett.service.profile;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eramaya.eravett.model.entity.FileBlob;
import com.eramaya.eravett.model.entity.Profile;
import com.eramaya.eravett.service.blob.UploadBlobService;
import com.eramaya.eravett.service.generic.ProfileGenericService;
import com.eramaya.eravett.web.form.UploadFileForm;

@Service
public class UploadProfilePhotoService {
	@Autowired
	private UploadBlobService uploadBlobService;
	@Autowired
	private ProfileGenericService profileGenericService;
	
	@Transactional
	public Integer upload(MultipartFile file) throws IOException {
		UploadFileForm f = new UploadFileForm();
		f.setContent(file.getBytes());
		f.setDocSize(Integer.valueOf((int) file.getSize()));
		f.setFileName(file.getOriginalFilename());
		f.setMimeType(file.getContentType());
		Integer fileId = uploadBlobService.saveBlob(f);
		//FileBlob fb = new FileBlob();
		//fb.setId(fileId);
		//Profile p = profileGenericService.findOne(profileId);
		//p.setFileBlob(fb);
		//profileGenericService.save(p);
		return fileId;
	}
}
