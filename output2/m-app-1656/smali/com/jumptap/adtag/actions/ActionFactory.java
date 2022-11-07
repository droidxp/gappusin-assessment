public class com.jumptap.adtag.actions.ActionFactory {
	 /* .source "ActionFactory.java" */
	 /* # static fields */
	 private static com.jumptap.adtag.actions.AdAction browserAction;
	 private static com.jumptap.adtag.actions.AdAction callAction;
	 private static com.jumptap.adtag.actions.AdAction mapAdAction;
	 private static com.jumptap.adtag.actions.AdAction storeAdAction;
	 private static com.jumptap.adtag.actions.AdAction videoAdAction;
	 private static com.jumptap.adtag.actions.AdAction youTubeAdAction;
	 /* # direct methods */
	 static com.jumptap.adtag.actions.ActionFactory ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 10 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/BrowserAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/BrowserAdAction;-><init>()V */
		 /* .line 11 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/CallAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/CallAdAction;-><init>()V */
		 /* .line 12 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/VideoAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/VideoAdAction;-><init>()V */
		 /* .line 13 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/YouTubeAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/YouTubeAdAction;-><init>()V */
		 /* .line 14 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/MapAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/MapAdAction;-><init>()V */
		 /* .line 15 */
		 /* new-instance v0, Lcom/jumptap/adtag/actions/StoreAdAction; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/actions/StoreAdAction;-><init>()V */
		 return;
	 } // .end method
	 public com.jumptap.adtag.actions.ActionFactory ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.jumptap.adtag.actions.AdAction createAction ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 8 */
		 /* .param p0, "url" # Ljava/lang/String; */
		 /* .param p1, "useragent" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 27 */
		 final String v5 = "JtAd"; // const-string v5, "JtAd"
		 /* new-instance v6, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v7 = "createAction from url:"; // const-string v7, "createAction from url:"
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v6 ).append ( p0 ); // invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v5,v6 );
		 /* .line 28 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 31 */
		 /* .local v0, "action":Lcom/jumptap/adtag/actions/AdAction; */
		 com.jumptap.adtag.actions.AdAction .getRedirectedUrl ( p0,p1 );
		 /* .line 32 */
		 /* .local v4, "redirectedUrl":Ljava/lang/String; */
		 final String v5 = "JtAd"; // const-string v5, "JtAd"
		 /* new-instance v6, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v7 = "redirected Url:"; // const-string v7, "redirected Url:"
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v5,v6 );
		 /* .line 33 */
		 if ( v4 != null) { // if-eqz v4, :cond_2
			 final String v5 = ""; // const-string v5, ""
			 v5 = 			 (( java.lang.String ) v5 ).equals ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v5, :cond_2 */
			 /* .line 35 */
			 android.net.Uri .parse ( v4 );
			 /* .line 38 */
			 /* .local v3, "redirectedUri":Landroid/net/Uri; */
			 com.jumptap.adtag.actions.ActionFactory .createActionByUri ( v3 );
			 /* .line 46 */
		 } // .end local v3 # "redirectedUri":Landroid/net/Uri;
	 } // :goto_0
	 /* if-nez v0, :cond_0 */
	 /* .line 47 */
	 android.net.Uri .parse ( p0 );
	 /* .line 48 */
	 /* .local v2, "origUri":Landroid/net/Uri; */
	 final String v5 = "t"; // const-string v5, "t"
	 (( android.net.Uri ) v2 ).getQueryParameter ( v5 ); // invoke-virtual {v2, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 49 */
	 /* .local v1, "actionType":Ljava/lang/String; */
	 final String v5 = "JtAd"; // const-string v5, "JtAd"
	 /* new-instance v6, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v7 = "actionType= "; // const-string v7, "actionType= "
	 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v5,v6 );
	 /* .line 50 */
	 com.jumptap.adtag.actions.ActionFactory .createActionByType ( v1 );
	 /* .line 54 */
} // .end local v1 # "actionType":Ljava/lang/String;
} // .end local v2 # "origUri":Landroid/net/Uri;
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 55 */
v0 = com.jumptap.adtag.actions.ActionFactory.browserAction;
/* .line 58 */
} // :cond_1
(( com.jumptap.adtag.actions.AdAction ) v0 ).setUrl ( p0 ); // invoke-virtual {v0, p0}, Lcom/jumptap/adtag/actions/AdAction;->setUrl(Ljava/lang/String;)V
/* .line 59 */
(( com.jumptap.adtag.actions.AdAction ) v0 ).setRedirectedUrl ( v4 ); // invoke-virtual {v0, v4}, Lcom/jumptap/adtag/actions/AdAction;->setRedirectedUrl(Ljava/lang/String;)V
/* .line 60 */
(( com.jumptap.adtag.actions.AdAction ) v0 ).setUserAgent ( p1 ); // invoke-virtual {v0, p1}, Lcom/jumptap/adtag/actions/AdAction;->setUserAgent(Ljava/lang/String;)V
/* .line 62 */
/* .line 41 */
} // :cond_2
v0 = com.jumptap.adtag.actions.ActionFactory.browserAction;
/* .line 42 */
/* move-object v4, p0 */
} // .end method
private static com.jumptap.adtag.actions.AdAction createActionByType ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "actionType" # Ljava/lang/String; */
/* .prologue */
/* .line 112 */
int v0 = 0; // const/4 v0, 0x0
/* .line 114 */
/* .local v0, "action":Lcom/jumptap/adtag/actions/AdAction; */
if ( p0 != null) { // if-eqz p0, :cond_0
final String v1 = "uri"; // const-string v1, "uri"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
final String v1 = "url"; // const-string v1, "url"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 115 */
} // :cond_0
v0 = com.jumptap.adtag.actions.ActionFactory.browserAction;
/* .line 133 */
} // :cond_1
} // :goto_0
/* .line 117 */
} // :cond_2
final String v1 = "call"; // const-string v1, "call"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_3 */
final String v1 = "tel"; // const-string v1, "tel"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 118 */
} // :cond_3
v0 = com.jumptap.adtag.actions.ActionFactory.callAction;
/* .line 120 */
} // :cond_4
final String v1 = "video"; // const-string v1, "video"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
final String v1 = "movie"; // const-string v1, "movie"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 121 */
} // :cond_5
v0 = com.jumptap.adtag.actions.ActionFactory.videoAdAction;
/* .line 123 */
} // :cond_6
final String v1 = "youtube"; // const-string v1, "youtube"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 124 */
v0 = com.jumptap.adtag.actions.ActionFactory.youTubeAdAction;
/* .line 126 */
} // :cond_7
final String v1 = "map"; // const-string v1, "map"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_8 */
final String v1 = "gmap"; // const-string v1, "gmap"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 127 */
} // :cond_8
v0 = com.jumptap.adtag.actions.ActionFactory.mapAdAction;
/* .line 129 */
} // :cond_9
final String v1 = "itunes"; // const-string v1, "itunes"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_a */
final String v1 = "store"; // const-string v1, "store"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 130 */
} // :cond_a
v0 = com.jumptap.adtag.actions.ActionFactory.storeAdAction;
} // .end method
private static com.jumptap.adtag.actions.AdAction createActionByUri ( android.net.Uri p0 ) {
/* .locals 7 */
/* .param p0, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 71 */
int v0 = 0; // const/4 v0, 0x0
/* .line 73 */
/* .local v0, "action":Lcom/jumptap/adtag/actions/AdAction; */
(( android.net.Uri ) p0 ).getScheme ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 74 */
/* .local v3, "scheme":Ljava/lang/String; */
(( android.net.Uri ) p0 ).getHost ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;
/* .line 75 */
/* .local v1, "host":Ljava/lang/String; */
(( android.net.Uri ) p0 ).getPath ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* .line 76 */
/* .local v2, "path":Ljava/lang/String; */
final String v4 = "JtAd"; // const-string v4, "JtAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Creating action from scheme:"; // const-string v6, "Creating action from scheme:"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " host: "; // const-string v6, " host: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " path:"; // const-string v6, " path:"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v5 );
/* .line 83 */
final String v4 = "about"; // const-string v4, "about"
v4 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 84 */
v0 = com.jumptap.adtag.actions.ActionFactory.browserAction;
/* .line 97 */
} // :cond_0
} // :goto_0
/* .line 85 */
} // :cond_1
final String v4 = "tel"; // const-string v4, "tel"
v4 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_2 */
final String v4 = "sms"; // const-string v4, "sms"
v4 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 87 */
} // :cond_2
v0 = com.jumptap.adtag.actions.ActionFactory.callAction;
/* .line 88 */
} // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
final String v4 = ""; // const-string v4, ""
v4 = (( java.lang.String ) v4 ).equals ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_4 */
v4 = com.jumptap.adtag.actions.ActionFactory .isVideoExt ( v2 );
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 89 */
v0 = com.jumptap.adtag.actions.ActionFactory.videoAdAction;
/* .line 90 */
} // :cond_4
final String v4 = "maps.google.com"; // const-string v4, "maps.google.com"
v4 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 91 */
v0 = com.jumptap.adtag.actions.ActionFactory.mapAdAction;
/* .line 92 */
} // :cond_5
final String v4 = "www.youtube.com"; // const-string v4, "www.youtube.com"
v4 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
if ( v2 != null) { // if-eqz v2, :cond_0
final String v4 = "/watch"; // const-string v4, "/watch"
v4 = (( java.lang.String ) v4 ).contains ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 94 */
v0 = com.jumptap.adtag.actions.ActionFactory.youTubeAdAction;
} // .end method
private static Boolean isVideoExt ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 101 */
final String v0 = ".mov"; // const-string v0, ".mov"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".avi"; // const-string v0, ".avi"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".mpg"; // const-string v0, ".mpg"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".mpeg"; // const-string v0, ".mpeg"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".wmv"; // const-string v0, ".wmv"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".wma"; // const-string v0, ".wma"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".mp4"; // const-string v0, ".mp4"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = ".3pg"; // const-string v0, ".3pg"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
