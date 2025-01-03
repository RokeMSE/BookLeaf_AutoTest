import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import java.nio.file.*

// Step 1: Open the browser
WebUI.openBrowser('')

// Step 2: Navigate to the application URL
WebUI.navigateToUrl('http://localhost:5173/')

// Step 3: Login to the application
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/input_Forgot Password_username'))
WebUI.setText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/input_Forgot Password_username'), 'roke')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/input_Forgot Password_password'), 'WGZpE/T2s4ewdflEeHgxZQ==')
WebUI.click(findTestObject('Object Repository/Page_BookLeaf/Upload/Page_BookLeaf/input_Forgot Password_w-full px-2 py-2 roun_ca6fd9'))

// Step 4: Perform a stress test for file uploads
String uploadDirectory = 'C:\\Users\\ASUS\\Downloads\\EPUB'
File folder = new File(uploadDirectory)

if (folder.exists() && folder.isDirectory()) {
    File[] files = folder.listFiles()

    // Loop to simulate stress test
    for (int i = 0; i < 5; i++) { // Adjust the iteration count for desired stress level
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".epub")) {
                WebUI.uploadFile(findTestObject('Page_BookLeaf/Upload/Page_BookLeaf/Upload'), file.getAbsolutePath())
                WebUI.delay(15) // Minimal delay to simulate faster uploads
            }
        }
        println("Iteration: " + (i + 1))
    }
} else {
    println("The specified folder does not exist or is not a directory.")
}

// Step 6: Close the browser
WebUI.closeBrowser()
