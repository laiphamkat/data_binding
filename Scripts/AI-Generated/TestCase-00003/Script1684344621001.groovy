import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Login at https://www.saucedemo.com/ --> navigate to Page_checkout-step-one_html'

'--> Navigate to application login page'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'--> At login page input username'

testObj = findTestObject('Object Repository/Page_home/input_username')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.username)

'--> At login page input password'

testObj = findTestObject('Object Repository/Page_home/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.password)

'--> At login page submit login form'

testObj = findTestObject('Object Repository/Page_home/form_login_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'--> Wait for login action to be completed'

WebUI.delay(15)

'step 2: At Page_checkout-step-one_html input on input_first_name'

testObj = findTestObject('Object Repository/Page_checkout-step-one_html/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-step-one.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object)

'step 3: At Page_checkout-step-one_html input on input_last_name'

testObj = findTestObject('Object Repository/Page_checkout-step-one_html/input_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-step-one.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_object_1)

'step 4: At Page_checkout-step-one_html input on input_postal_code'

testObj = findTestObject('Object Repository/Page_checkout-step-one_html/input_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-step-one.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_object_2)

'step 5: At Page_checkout-step-one_html click on input_continue --> navigate to Page_checkout-step-two_html'

testObj = findTestObject('Object Repository/Page_checkout-step-one_html/input_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-step-one.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_checkout-step-two_html click on button_finish --> navigate to Page_checkout-complete_html'

testObj = findTestObject('Object Repository/Page_checkout-step-two_html/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-step-two.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_checkout-complete_html click on button_react_burger_menu_btn'

testObj = findTestObject('Object Repository/Page_checkout-complete_html/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/checkout-complete.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: Add visual checkpoint at Page_checkout-complete_html'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
