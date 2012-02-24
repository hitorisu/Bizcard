package sample.bizcard.db;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bizcard implements Serializable {

	// テーブル名
	public static final String TABLE_NAME = "biz_card";

	// カラム名
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_PERSON_NAME = "person_name";
	public static final String COLUMN_COMPANY_NAME = "company_name";
	public static final String COLUMN_ORGANIZATION_NAME = "organization_name";
	public static final String COLUMN_POSITION_NAME = "position_name";
	public static final String COLUMN_ZIP_CODE = "zip_code";
	public static final String COLUMN_ADDRESS = "address";
	public static final String COLUMN_TEL1 = "tel1";
	public static final String COLUMN_TEL2 = "tel2";
	public static final String COLUMN_MAIL = "mail";

	// プロパティ
	private Long rowid = null;
	private String personName = null;
	private String organizationName = null;
	private String companyName = null;
	private String positionName = null;
	private String zipCode = null;
	private String address = null;
	private String tel1 = null;
	private String tel2 = null;
	private String mail = null;

	// Getter and Setter
	public Long getRowid() {
		return rowid;
	}

	public void setRowid(Long rowid) {
		this.rowid = rowid;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getPersonName());

		if (getCompanyName() != null) {
			builder.append(":");
			builder.append(getCompanyName());
		}

		return builder.toString();
	}
}
