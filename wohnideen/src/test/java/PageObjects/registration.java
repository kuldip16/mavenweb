package PageObjects;


import UtilityMobile.BaseMobile;


public class registration extends BaseMobile{
	
	public static String Vorname = 	".//*[@id='f_name']";
	public static String Nachname = ".//*[@id='l_name']";
	public static String Email_field = 	".//*[@id='reg_email']";
	public static String Password = ".//*[@id='reg_pwd']";
	public static String Chkbx =".//*[@id='registrationform']/div[1]/div[10]/div/label/div";
	public static String Registerbutton =".//*[@id='registrationform']/div[1]/div[9]/input";
	public static String successmessage =".//*[@id='notify']/span";
	public static String mailinatorfield =".//*[@id='inboxfield']";
	public static String Okbutton ="html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button";
	public static String Inboxmail =".//*[@id='row_public_1493204139-100084311626-testishan']/div[2]/div[2]/div";
	public static String activationlink= "html/body/span[1]/a[1]";
	public static String linktext= "https://www.moebel.de/useractivation/?uid=QPE-7qVj9IKa9bhuSRjyqQ";
	public static String user =".//*[@id='userAccessJson']/div[2]/div[1]/div/span[1]";
	
//----------------------------from Experte wedern page-----------------------------------------
	
	public static String Expertebutton =".//*[@id='moveto_div']";
	public static String Exp_Firmenname = 	".//*[@id='elementtoScrollToID']/div/div[5]/form/div[1]/div[1]/div/input";
	public static String Exp_Vorname = ".//*[@id='firstname']";
	public static String Exp_Nachname = 	".//*[@id='lastname']";
	public static String Exp_Email= ".//*[@id='email']";
	public static String Exp_Password = ".//*[@id='passwd']";
	public static String Exp_cPassword = ".//*[@id='cpasswd']";
	public static String Telefon =".//*[@id='Telefon']";
	public static String Impressum =".//*[@id='imprint']";
	public static String AGB =".//*[@id='elementtoScrollToID']/div/div[5]/form/div[1]/div[10]/div/div/label/div/div/span/input";
	public static String industry =".//*[@id='industry']/optgroup[1]/option[3]";
	public static String Geschlecht =".//*[@id='elementtoScrollToID']/div/div[5]/form/div[2]/div[1]/div[2]/div[2]/div/label/div/span/input";
	public static String Ansprechpartner =".//*[@id='contact_person']";
	public static String Straße =".//*[@id='elementtoScrollToID']/div/div[5]/form/div[2]/div[1]/div[4]/div[1]/input";
	public static String Hausnummer= ".//*[@id='elementtoScrollToID']/div/div[5]/form/div[2]/div[1]/div[4]/div[2]/input";
	public static String PLZ= ".//*[@id='elementtoScrollToID']/div/div[5]/form/div[2]/div[1]/div[5]/div[1]/input";
	public static String Ort =".//*[@id='city']";
	public static String land_drpdwn =".//*[@id='id_country']";
	public static String land_selection =".//*[@id='id_country']/option[2]";
	public static String Bundesland =".//*[@id='state_list']";
	public static String Bundesland_selection =".//*[@id='state_list']/option[3]";
	public static String Register_btn =".//*[@id='firstStep_btn']";
	public static String upload_photo =".//*[@id='become-expert-steps']/div/div[2]/div[4]/div/a";
	public static String browse_photo =".//*[@id='file']";
	public static String crop_submit =".//*[@id='btnCrop']";
	
	
	

}
