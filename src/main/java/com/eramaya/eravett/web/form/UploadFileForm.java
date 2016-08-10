package com.eramaya.eravett.web.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class UploadFileForm implements Serializable{
	private Integer id;
	private String fileName;
	private Integer docSize;
	private String mimeType;
	private byte[] content;
}
