public class com.jumptap.adtag.events.SendConversionUrlTask extends java.util.TimerTask {
	 /* .source "SendConversionUrlTask.java" */
	 /* # instance fields */
	 private android.content.Context context;
	 /* # direct methods */
	 public com.jumptap.adtag.events.SendConversionUrlTask ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
		 /* .line 28 */
		 this.context = p1;
		 /* .line 29 */
		 return;
	 } // .end method
	 private static Boolean sendReportToTL ( android.content.Context p0, com.jumptap.adtag.events.JtEvent p1 ) {
		 /* .locals 14 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .param p1, "event" # Lcom/jumptap/adtag/events/JtEvent; */
		 /* .prologue */
		 /* .line 50 */
		 (( com.jumptap.adtag.events.JtEvent ) p1 ).getUrl ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getUrl()Ljava/lang/String;
		 /* .line 51 */
		 /* .local v9, "url":Ljava/lang/String; */
		 (( com.jumptap.adtag.events.JtEvent ) p1 ).getEventType ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getEventType()Lcom/jumptap/adtag/events/EventType;
		 /* .line 52 */
		 /* .local v3, "eventType":Lcom/jumptap/adtag/events/EventType; */
		 (( com.jumptap.adtag.events.JtEvent ) p1 ).getDate ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/JtEvent;->getDate()Ljava/lang/String;
		 /* .line 54 */
		 /* .local v1, "date":Ljava/lang/String; */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 56 */
		 /* .local v5, "isSucc":Z */
		 final String v11 = "JtAd-Tracking"; // const-string v11, "JtAd-Tracking"
		 /* new-instance v12, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v13 = "sending url to Jumptap servers:"; // const-string v13, "sending url to Jumptap servers:"
		 (( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v12 ).append ( v9 ); // invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v11,v12 );
		 /* .line 57 */
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 /* .line 58 */
		 /* .local v0, "client":Lorg/apache/http/client/HttpClient; */
		 /* new-instance v4, Lorg/apache/http/client/methods/HttpGet; */
		 /* invoke-direct {v4, v9}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
		 /* .line 59 */
		 /* .local v4, "get":Lorg/apache/http/client/methods/HttpGet; */
		 final String v11 = "http.agent"; // const-string v11, "http.agent"
		 java.lang.System .getProperty ( v11 );
		 /* .line 60 */
		 /* .local v10, "userAgent":Ljava/lang/String; */
		 final String v11 = "User-Agent"; // const-string v11, "User-Agent"
		 (( org.apache.http.client.methods.HttpGet ) v4 ).setHeader ( v11, v10 ); // invoke-virtual {v4, v11, v10}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 64 */
		 try { // :try_start_0
			 /* .line 67 */
			 /* .local v6, "resp":Lorg/apache/http/HttpResponse; */
			 /* .line 68 */
			 v7 = 			 /* .local v8, "statusLine":Lorg/apache/http/StatusLine; */
			 /* .line 69 */
			 /* .local v7, "statusCode":I */
			 final String v11 = "JtAd-Tracking"; // const-string v11, "JtAd-Tracking"
			 /* new-instance v12, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v13 = "conversion/event tracking response status code:"; // const-string v13, "conversion/event tracking response status code:"
			 (( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v12 ).append ( v7 ); // invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .i ( v11,v12 );
			 /* .line 72 */
			 /* const/16 v11, 0xc8 */
			 /* if-ne v7, v11, :cond_2 */
			 /* .line 73 */
			 v11 = com.jumptap.adtag.events.EventType.install;
			 v11 = 			 (( com.jumptap.adtag.events.EventType ) v11 ).equals ( v3 ); // invoke-virtual {v11, v3}, Lcom/jumptap/adtag/events/EventType;->equals(Ljava/lang/Object;)Z
			 if ( v11 != null) { // if-eqz v11, :cond_0
				 if ( p0 != null) { // if-eqz p0, :cond_0
					 /* .line 75 */
					 final String v11 = "isFirstLaunch"; // const-string v11, "isFirstLaunch"
					 final String v12 = "0"; // const-string v12, "0"
					 com.jumptap.adtag.utils.JtAdManager .savePreferences ( p0,v11,v12 );
					 /* .line 77 */
					 final String v11 = "installDate"; // const-string v11, "installDate"
					 com.jumptap.adtag.utils.JtAdManager .removePreferences ( p0,v11 );
					 /* .line 79 */
				 } // :cond_0
				 int v5 = 1; // const/4 v5, 0x1
				 /* .line 93 */
			 } // .end local v6 # "resp":Lorg/apache/http/HttpResponse;
		 } // .end local v7 # "statusCode":I
	 } // .end local v8 # "statusLine":Lorg/apache/http/StatusLine;
} // :cond_1
} // :goto_0
/* .line 83 */
/* .restart local v6 # "resp":Lorg/apache/http/HttpResponse; */
/* .restart local v7 # "statusCode":I */
/* .restart local v8 # "statusLine":Lorg/apache/http/StatusLine; */
} // :cond_2
v11 = com.jumptap.adtag.events.EventType.install;
v11 = (( com.jumptap.adtag.events.EventType ) v11 ).equals ( v3 ); // invoke-virtual {v11, v3}, Lcom/jumptap/adtag/events/EventType;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 85 */
final String v11 = "isFirstLaunch"; // const-string v11, "isFirstLaunch"
com.jumptap.adtag.utils.JtAdManager .savePreferences ( p0,v11,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 89 */
} // .end local v6 # "resp":Lorg/apache/http/HttpResponse;
} // .end local v7 # "statusCode":I
} // .end local v8 # "statusLine":Lorg/apache/http/StatusLine;
/* :catch_0 */
/* move-exception v2 */
/* .line 90 */
/* .local v2, "e":Ljava/io/IOException; */
final String v11 = "JtAd-Tracking"; // const-string v11, "JtAd-Tracking"
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "JTAppReport.sendReportToTL:"; // const-string v13, "JTAppReport.sendReportToTL:"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v11,v12 );
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 33 */
final String v5 = "JtAd-Tracking"; // const-string v5, "JtAd-Tracking"
final String v6 = "SendConversionUrlTask woke up"; // const-string v6, "SendConversionUrlTask woke up"
android.util.Log .d ( v5,v6 );
/* .line 34 */
v5 = this.context;
com.jumptap.adtag.db.DBManager .getInstance ( v5 );
/* .line 35 */
/* .local v0, "dbManager":Lcom/jumptap/adtag/db/DBManager; */
(( com.jumptap.adtag.db.DBManager ) v0 ).selectAllEvents ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/db/DBManager;->selectAllEvents()Ljava/util/List;
/* .line 36 */
/* .local v2, "events":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/events/JtEvent;>;" */
/* .local v3, "i$":Ljava/util/Iterator; */
} // :cond_0
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_1
/* check-cast v1, Lcom/jumptap/adtag/events/JtEvent; */
/* .line 37 */
/* .local v1, "event":Lcom/jumptap/adtag/events/JtEvent; */
v5 = this.context;
v4 = com.jumptap.adtag.events.SendConversionUrlTask .sendReportToTL ( v5,v1 );
/* .line 38 */
/* .local v4, "isSucc":Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 39 */
v5 = (( com.jumptap.adtag.events.JtEvent ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/events/JtEvent;->getId()I
(( com.jumptap.adtag.db.DBManager ) v0 ).deleteEventById ( v5 ); // invoke-virtual {v0, v5}, Lcom/jumptap/adtag/db/DBManager;->deleteEventById(I)V
/* .line 42 */
} // .end local v1 # "event":Lcom/jumptap/adtag/events/JtEvent;
} // .end local v4 # "isSucc":Z
} // :cond_1
return;
} // .end method
