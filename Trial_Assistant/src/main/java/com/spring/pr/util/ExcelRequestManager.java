package com.spring.pr.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.multipart.MultipartFile;

public class ExcelRequestManager {

	public List<HashMap<String, String>> parseExcelSpringMultiPart(Map<String, MultipartFile> files , String KeyStr, int fileKeyParam, String atchFileId ,String storePath) throws Exception{

		List<HashMap<String, String>> list = null; 
		int fileKey = fileKeyParam; 

		String storePathString = ""; 
		String atchFileIdString = "";

		if("".equals(storePath) || storePath == null) {
			storePathString = "C:\\Users\\ahndasol\\Desktop\\test"; 

		}else {
			storePathString = "C:\\Users\\ahndasol\\Desktop\\test" + storePath; 
		}

		if(!"".equals(atchFileId) || atchFileId != null) {
			atchFileIdString = atchFileId; 
		}

		File saveFolder = new File(EgovWebUtil.filePathBlackList(storePathString));

		if (!saveFolder.exists() || saveFolder.isFile()) {
			saveFolder.mkdirs();
		}

		Iterator<Entry<String, MultipartFile>> itr = files.entrySet().iterator();
		MultipartFile file;
		String filePath = "";

		while (itr.hasNext()) {
			Entry<String, MultipartFile> entry = itr.next();

			file = entry.getValue();
			String orginFileName = file.getOriginalFilename();

			if ("".equals(orginFileName)) {
				continue;
			}

			int index = orginFileName.lastIndexOf(".");
			String fileExt = orginFileName.substring(index + 1);
			String newName = KeyStr + fileKey;

			if (!"".equals(orginFileName)) {
				filePath = storePathString + File.separator + newName+"."+fileExt;
				file.transferTo(new File(EgovWebUtil.filePathBlackList(filePath)));
			}

			list = ExcelManagerXlsx.getListXlsxRead(filePath);       
			fileKey++;
		}    
		return list;

	}
}
