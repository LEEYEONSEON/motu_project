package kr.or.iei.post.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostFile {

	private int postImgNo;
	private String postImgPath;
	private String postImgName;
	private int postNo;
	private String postImgUploadDate;
	private int postImgFileOrder;
	
}
