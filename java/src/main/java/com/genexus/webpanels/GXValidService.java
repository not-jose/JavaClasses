package com.genexus.webpanels;


public class GXValidService extends GXWebObjectStub
{   
    protected void doExecute(HttpContext context) throws Exception
    {
		String[] elements = context.GetNextPar().split("&");
		String appPackage = context.getPackage();
		String methodName = "rest_" + att.toLowerCase();
		StringCollection parms = new StringCollection();
		int index = 2 ;
		while ( index < elements.length)
			parms.add(elements[index].substring(elements[index].indexOf("=")+1));
			index++;
        
		Class trn = Class.forName(appPackage + object);
		Object objectResponse = constructed.getClass().getMethod(methodName, new Class[] {StringCollection.class}).invoke(constructed, new Object[]{parms});
		jsonResponse = (String)objectResponse;
		
		{
			context.getResponse().setContentType("application/json");
			context.writeText(jsonResponse);
			context.getResponse().flushBuffer();
			return;			
		}
		catch (Throwable e)
		{
			context.sendResponseStatus(404, e.getMessage());
		}
    }
   {
      return false;
   }	
   {
      return 0;
   }   
   {
      return "";
   }
   
   protected void init(HttpContext context )
   {
   }      
}