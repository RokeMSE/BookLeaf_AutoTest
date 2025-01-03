import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Forgot Password_username'), 
    'roke')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Forgot Password_password'), 
    'WGZpE/T2s4ewdflEeHgxZQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Forgot Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_Books'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_My Libraries'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_BooksMy ProfileFollowing'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Following'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_No users found'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d'))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1'), 
    's')

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2'), 
    'se')

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3'), 
    'sef')

WebUI.sendKeys(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2'), 
    'se')

WebUI.sendKeys(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_SeapeasSeapeas'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Currently Reading_h-52 justify-center flex'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Currently Reading_h-full object-cover r_c382f1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Following'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/header_rokephamtranyenquyengmail.com'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/path'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_p-4 rounded-lg mb-4 cursor-po_2f88d5'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_flex flex-col items-center w-_a711ca'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_Change Password'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_p-4 rounded-lg mb-4 cursor-po_2f88d5'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_p-4 rounded-lg mb-4 cursor-po_2f88d5_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/header_BooksMy ProfileFollowing'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/h1_roke'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_w-12 h-12 bg-gray-300 rounded-full'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/p_phamtranyenquyengmail.com'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_tag3_h-52 justify-center flex'))

WebUI.doubleClick(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Sherlock Holmes_h-full object-cover rounded-lg'))

WebUI.doubleClick(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.doubleClick(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_CHNG HAI'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Ti ti gii, bn cng th'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/span'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_BN  SN SNG I N THNH CNG CHA'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg_Ti ti gii, bn cng th_text-white h-8 w-8_fa6271'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Ti ti gii, bn cng th_h-full object-cove_b58b54'))

WebUI.doubleClick(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg_T ph bn giy_text-white h-8 w-8 cursor-p_7d0799'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_No books found'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_T ph bn giy_h-52 justify-center flex'))

WebUI.doubleClick(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg_Display Option_text-white h-8 w-8 curso_af81bb'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_BooksMy ProfileFollowing'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Following_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Seapeas'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Currently Reading_h-full object-cover r_c382f1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Sherlock Holmes_h-full object-cover rounded-lg_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_p-4 rounded-lg mb-4 cursor-po_2f88d5_1_2'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Following_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_FollowingSeapeasdodinhhai29904gmail.com'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d'))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4'), 
    'S')

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5'), 
    'Se')

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6'), 
    'Sea')

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_No users found'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6'))

WebUI.sendKeys(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6'), 
    'Sea')

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_SeapeasSeapeas_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/h3_Seapeas'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/h3_Ti ti gii, bn cng th'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Sherlock Holmes_h-full object-cover rounded-lg_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_Currently Reading_h-full object-cover r_c382f1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_Following'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_Block'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/path'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Just Read'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6_7'), 
    'Sher')

WebUI.sendKeys(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Following_w-full py-3 pl-10 pr-4 text_0b5d4d_1_2_3_4_5_6_7'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Sherlock HolmesArthur Conan Doyle0 page_b857e8'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_My Profile'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/div_Following_p-4 rounded-lg mb-4 cursor-po_2f88d5_1'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/button_Logout'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Forgot Password'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Remember your password Login now'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Need an account Register now'))

WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/a_Already have an account Sign in now'))

WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Forgot Password_username'), 
    'roke')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/Switch Tabs/Page_BookLeaf/input_Forgot Password_password'), 
    'WGZpE/T2s4ewdflEeHgxZQ==')

WebUI.click(findTestObject('Page_BookLeaf/input_Forgot Password_w-full px-2 py-2 roun_ca6fd9'))

