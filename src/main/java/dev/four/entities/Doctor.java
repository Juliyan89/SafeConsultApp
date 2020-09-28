package dev.four.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Doctor {
	
	//number: The NPI Number is the unique 10-digit National Provider Identifier assigned to the provider.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "number")
	private int number;
	
	
	//version: Identifies the version of the API to use (e.g., “2.0”, “2.1”).
	@Column(name = "version")
	private int version;
	
	//enumeration_type: The Read API can be refined to retrieve only Individual Providers or Organizational Providers. When it is not specified, both Type 1 and Type 2 NPIs will be returned. When using the Enumeration Type, it cannot be the only criteria entered. Additional criteria must also be entered as well. Valid values are:
	//NPI-1: Individual Providers (Type 1) NPIs
	//NPI-2: Organizational Providers (Type 2) NPIs
	@Column(name = "enumeration_type")
	private int enumeration_type;
	
	//taxonomy_description: Search for providers by their taxonomy by entering the taxonomy description.
	@Column(name = "taxonomy_description")
	private int taxonomy_description;
	
	//first_name: This field only applies to Individual Providers. Trailing wildcard entries are permitted requiring at least two characters to be entered (e.g. "jo*" ). This field allows the following special characters: ampersand, apostrophe, colon, comma, forward slash, hyphen, left and right parentheses, period, pound sign, quotation mark, and semi-colon.
	@Column(name = "first_name")
	private String first_name;
	
	
	//last_name: This field only applies to Individual Providers. Trailing wildcard entries are permitted requiring at least two characters to be entered. This field allows the following special characters: ampersand, apostrophe, colon, comma, forward slash, hyphen, left and right parentheses, period, pound sign, quotation mark, and semi-colon.
	@Column(name = "last_name")
	private String last_name;
	
	//organization_name: This field only applies to Organizational Providers. Trailing wildcard entries are permitted requiring at least two characters to be entered. This field allows the following special characters: ampersand, apostrophe, "at" sign, colon, comma, forward slash, hyphen, left and right parentheses, period, pound sign, quotation mark, and semi-colon. All types of Organization Names (LBN, DBA, Former LBN, Other Name) associated with an NPI are examined for matching contents, therefore, the results might contain an organization name different from the one entered in the Organization Name criterion.
	@Column(name = "organization_name")
	private String organization_name;
	
	//address_purpose: Refers to whether the address information entered pertains to the provider's Mailing Address or the provider's Practice Location Address. When not specified, the results will contain the providers where either the Mailing Address or any of Practice Location Addresses match the entered address information. PRIMARY will only search against Primary Location Address. While Secondary will only search against Secondary Location Addresses. Valid values are:
	//LOCATION
	//MAILING
	//PRIMARY
	//SECONDARY
	@Column(name = "address_purpose")
	private String address_purpose;
	
	//city: The City associated with the provider's address identified in Address Purpose. To search for a Military Address enter either APO or FPO into the City field. This field allows the following special characters: ampersand, apostrophe, colon, comma, forward slash, hyphen, left and right parentheses, period, pound sign, quotation mark, and semi-colon.
	@Column(name = "city")
	private String city;
	
	//state: The State abbreviation associated with the provider's address identified in Address Purpose. This field cannot be used as the only input criterion. If this field is used, at least one other field, besides the Enumeration Type and Country, must be populated. Valid values for states.
	@Column(name = "state")
	private String state;
	
	//postal_code (Version 2.0): The Postal Code associated with the provider's address identified in Address Purpose. There is an implied trailing wildcard. If you enter a 5 digit postal code, it will match any appropriate 9 digit (zip+4) codes in the data.
	@Column(name = "postal_code")
	private String postal_code;
	
	//country_code: The Country associated with the provider's address identified in Address Purpose. This field can be used as the only input criterion as long as the value selected is not US (United States). Valid values for countries.
	@Column(name = "country_code")
	private String country_code;
	
	//limit: Limit the results returned. The default value is 10; however, the value can be set to any value from 1 to 200.
	@Column(name = "limit")
	private String limit;
	
	//skip: The first N (value entered) results meeting the entered criteria will be bypassed and will not be included in the output.
	@Column(name = "skip")
	private String skip;
	
	//pretty: When checked, the response will be displayed in an easy to read format. See NPPES Read API Examples.
	@Column(name = "pretty")
	private String pretty;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int number, int version, int enumeration_type, int taxonomy_description, String first_name,
			String last_name, String organization_name, String address_purpose, String city, String state,
			String postal_code, String country_code, String limit, String skip, String pretty) {
		super();
		this.number = number;
		this.version = version;
		this.enumeration_type = enumeration_type;
		this.taxonomy_description = taxonomy_description;
		this.first_name = first_name;
		this.last_name = last_name;
		this.organization_name = organization_name;
		this.address_purpose = address_purpose;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.country_code = country_code;
		this.limit = limit;
		this.skip = skip;
		this.pretty = pretty;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getEnumeration_type() {
		return enumeration_type;
	}

	public void setEnumeration_type(int enumeration_type) {
		this.enumeration_type = enumeration_type;
	}

	public int getTaxonomy_description() {
		return taxonomy_description;
	}

	public void setTaxonomy_description(int taxonomy_description) {
		this.taxonomy_description = taxonomy_description;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public String getAddress_purpose() {
		return address_purpose;
	}

	public void setAddress_purpose(String address_purpose) {
		this.address_purpose = address_purpose;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getSkip() {
		return skip;
	}

	public void setSkip(String skip) {
		this.skip = skip;
	}

	public String getPretty() {
		return pretty;
	}

	public void setPretty(String pretty) {
		this.pretty = pretty;
	}

	@Override
	public String toString() {
		return "Doctor [number=" + number + ", version=" + version + ", enumeration_type=" + enumeration_type
				+ ", taxonomy_description=" + taxonomy_description + ", first_name=" + first_name + ", last_name="
				+ last_name + ", organization_name=" + organization_name + ", address_purpose=" + address_purpose
				+ ", city=" + city + ", state=" + state + ", postal_code=" + postal_code + ", country_code="
				+ country_code + ", limit=" + limit + ", skip=" + skip + ", pretty=" + pretty + "]";
	}
	
	

}
