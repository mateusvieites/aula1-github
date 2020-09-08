package testeCurto;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.wicket.request.Url;
import org.apache.wicket.request.cycle.RequestCycle;

public class a {

	public static void main(String[] args) {
		//try {
			//Process processo = Runtime.getRuntime().exec("C:\\Users\\PICHAU\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe");

			//} catch (IOException e) {
			//}
		
	//	try {
	//		java.awt.Desktop.getDesktop().browse( new java.net.URI( "http://www.github.com" ) );
	//	} catch (IOException | URISyntaxException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}  
		
		new URL(RequestCycle.get().getUrlRenderer().renderFullUrl( Url.parse(urlFor(HomePage.class,null).toString()))).getAuthority();

}

