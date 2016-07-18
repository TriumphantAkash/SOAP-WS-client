package io.github.triumphantAkash;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("You need to pass in one IP address");
		}else{
			String ipAddrrss = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddrrss);
			String country = geoIP.getCountryName();
			System.out.println(country);
		}
		
	}

}
