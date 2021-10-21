package com.douzone.fileupload.service;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadService {

	public String restore(MultipartFile multipartFile) {
		String url = null;
		
		if (multipartFile.isEmpty()) {
			return url;
		}
		
		String originFilename = multipartFile.getOriginalFilename();
		String extName = originFilename.substring(originFilename.lastIndexOf('.')+1);
		String saveFilename = generateSaveFilename(extName);
		long fileSize = multipartFile.getSize();
		
		System.out.println("########" + originFilename);
		System.out.println("########" + fileSize);
		System.out.println("########" + saveFilename);
		
		return url;
	}

}
