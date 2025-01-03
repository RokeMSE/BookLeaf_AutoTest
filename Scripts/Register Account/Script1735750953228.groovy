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
                                                                                                                                                            
// Step 1: Open the browser                                                                                                                                 
WebUI.openBrowser('')                                                                                                                                       
                                                                                                                                                            
// Step 2: Navigate to the registration page                                                                                                                
WebUI.navigateToUrl('http://localhost:5173/')                                                                                                               
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/a_Need an account Register now'))                                                               
                                                                                                                                                            
// Step 3: Submit empty form and verify error message                                                                                                       
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
                                                                                                                                                            
// Step 4: Test invalid email input                                                                                                                         
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_email'), 'roke')                                    
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
                                                                                                                                                            
// Step 5: Test email without username                                                                                                                      
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_email'), 'roke@123')                                
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                                
                                                                                                                                                            
// Step 6: Test valid email and username but no password                                                                                                    
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_email'), 'roke@example.com')                        
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_username'), 'roke')                                 
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                                
                                                                                                                                                            
// Step 7: Test password and confirm password mismatch                                                                                                      
WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'WGZpE/T2s4ewdflEeHgxZQ==')    
WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'yNunYEo/Hn112BrXV1H8FA==')    
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
WebUI.verifyElementText(findTestObject('Object Repository/Page_BookLeaf/div_Passwords do not match'), 'Passwords do not match')                             
WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                                
                                                                                                                                                            
// Step 8: Test already registered email                                                                                                                    
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_email'), 'phamtranyenquyen@gmail.com')              
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_username'), 'roke')                                 
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
WebUI.verifyElementText(findTestObject('Object Repository/Page_BookLeaf/div_Passwords do not match'), 'Passwords do not match')                             
WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                                
                                                                                                                                                            
// Step 9: Test password constraints                                                                                                                        
    // Password without uppercase                                                                                                                           
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'MBNmVH6B7Ks=')            
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'MBNmVH6B7Ks=')            
    WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                       
	WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                            
                                                                                                                                                            
    // Password without Special Character                                                                                                                   
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'VsUZ2zXDgoI=')            
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'VsUZ2zXDgoI=') 
    WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))              
	WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                            
                                                                                                                                                            
    // Password without number                                                                                                                              
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'TITzLivi3M4=')            
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'TITzLivi3M4=')   
    WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))            
	WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                            
                                                                                                                                                            
    // Password with less than 8 characters                                                                                                                 
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'hgSHAspKbbg=')            
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'hgSHAspKbbg=')
    WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))               
	WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                            
                                                                                                                                                            
    // Password with all constraints                                                                                                                        
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'HtJPfBVaESSWJC+EK9JW0A==')
    WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'HtJPfBVaESSWJC+EK9JW0A==')
    WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))   
	WebUI.delay(1) // Optional: Delay between uploads to simulate user behavior                                                                            
                                                                                                                                                            
// Step 10: Test successful registration                                                                                                                    
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_email'), 'newuser@example.com')                     
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_username'), 'newuser')                              
WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_password'), 'WGZpE/T2s4ewdflEeHgxZQ==')    
WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_c_cba2fd'), 'WGZpE/T2s4ewdflEeHgxZQ==')    
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_Already have an account Sign in now_w_bbc059'))                                           
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/input_We have sent a verification code topt_1f67f5'))                                           
                                                                                                                                                            
// Step 11: Close the browser                                                                                                                               
WebUI.closeBrowser()                                                                                                                                        
                                                                                                                                                            
                                                                                                                                                            
                                                                                                                                                            
                                                                                                                                                            
                                                                                                                                                            