package myApp.client.vi.sys.model;

import myApp.client.utils.GridDataModel;

public class Sys00_CommonComboBoxModel implements GridDataModel { 

	private String code;
	private String name;

	@Override
	public void setKeyId(Long id) {
	}

	@Override
	public Long getKeyId() {
		return null; 
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
