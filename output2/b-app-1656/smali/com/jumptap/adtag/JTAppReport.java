public class com.jumptap.adtag.JTAppReport {
	 /* .source "JTAppReport.java" */
	 /* # direct methods */
	 public com.jumptap.adtag.JTAppReport ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static com.jumptap.adtag.events.EventType getEventType ( android.app.Activity p0 ) {
		 /* .locals 4 */
		 /* .param p0, "activity" # Landroid/app/Activity; */
		 /* .prologue */
		 /* .line 54 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 56 */
		 /* .local v0, "eventType":Lcom/jumptap/adtag/events/EventType; */
		 com.jumptap.adtag.events.EventManager .getFirstLaunchStr ( );
		 /* .line 59 */
		 /* .local v1, "firstLaunchStr":Ljava/lang/String; */
		 com.jumptap.adtag.events.EventManager .getFirstPrefName ( );
		 com.jumptap.adtag.utils.JtAdManager .getPreferences ( p0,v3,v1 );
		 /* .line 62 */
		 /* .local v2, "preferences":Ljava/lang/String; */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 final String v3 = ""; // const-string v3, ""
			 v3 = 			 (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v3, :cond_0 */
			 v3 = 			 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v3 != null) { // if-eqz v3, :cond_1
				 /* .line 63 */
			 } // :cond_0
			 v0 = com.jumptap.adtag.events.EventType.install;
			 /* .line 69 */
		 } // :goto_0
		 /* .line 67 */
	 } // :cond_1
	 v0 = com.jumptap.adtag.events.EventType.run;
} // .end method
public static void sendConversionTrackingReport ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, java.util.Map p3 ) {
	 /* .locals 6 */
	 /* .param p0, "activity" # Landroid/app/Activity; */
	 /* .param p1, "appId" # Ljava/lang/String; */
	 /* .param p2, "appVer" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/app/Activity;", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 28 */
/* .local p3, "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v4 = "JtAd"; // const-string v4, "JtAd"
final String v5 = "Application request to send conversion tracking url"; // const-string v5, "Application request to send conversion tracking url"
android.util.Log .d ( v4,v5 );
/* .line 29 */
com.jumptap.adtag.utils.JtAdManager .getHID ( p0 );
/* .line 30 */
/* .local v2, "hid":Ljava/lang/String; */
com.jumptap.adtag.JTAppReport .getEventType ( p0 );
/* .line 31 */
/* .local v1, "eventType":Lcom/jumptap/adtag/events/EventType; */
com.jumptap.adtag.events.EventManager .getDateByEventType ( v1,p0 );
/* .line 33 */
/* .local v0, "date":Ljava/lang/String; */
/* if-nez p3, :cond_0 */
/* .line 34 */
/* new-instance p3, Ljava/util/HashMap; */
} // .end local p3 # "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
/* invoke-direct {p3}, Ljava/util/HashMap;-><init>()V */
/* .line 36 */
/* .restart local p3 # "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
} // :cond_0
final String v4 = "hid"; // const-string v4, "hid"
/* .line 37 */
final String v4 = "app"; // const-string v4, "app"
/* .line 38 */
final String v4 = "appVer"; // const-string v4, "appVer"
/* .line 39 */
final String v4 = "event"; // const-string v4, "event"
(( com.jumptap.adtag.events.EventType ) v1 ).name ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/events/EventType;->name()Ljava/lang/String;
/* .line 40 */
final String v4 = "date"; // const-string v4, "date"
/* .line 43 */
com.jumptap.adtag.events.EventManager .buildEventTrackingUrl ( p3 );
/* .line 44 */
/* .local v3, "url":Ljava/lang/String; */
com.jumptap.adtag.events.EventManager .sendReport ( p0,v3,v1,v0 );
/* .line 45 */
return;
} // .end method
