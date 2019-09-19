public class JavaHelperSnippets {   
	
	public void waitForNoSpinner(){
        long start = System.currentTimeMillis();
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".Loader-container")));
        long end = System.currentTimeMillis();
        long duration = end-start;
        String methodName = new Exception().getStackTrace()[1].getMethodName();
        String className = new Exception().getStackTrace()[1].getClassName();
        System.out.println("[] Spinner gone after "+duration+" miliseconds! ["+className+"]["+methodName+"]");
    }
}	