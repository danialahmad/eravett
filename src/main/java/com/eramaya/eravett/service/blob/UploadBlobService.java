package com.eramaya.eravett.service.blob;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eramaya.eravett.model.entity.FileBlob;
import com.eramaya.eravett.service.generic.FileBlobGenericService;
import com.eramaya.eravett.web.form.UploadFileForm;

@Service
public class UploadBlobService {
	
	@Autowired
	private FileBlobGenericService fileBlobGenericService;
	
	@Transactional
	public Integer saveBlob(UploadFileForm f) {
		FileBlob fb = new FileBlob();
		fb.setBlobContent(f.getContent());
		fb.setDocSize(f.getDocSize());
		fb.setFileName(f.getFileName());
		fb.setMimeType(f.getMimeType());
		fileBlobGenericService.save(fb);
		return fb.getId();
	}

}
