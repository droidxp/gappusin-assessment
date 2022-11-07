public class com.mobfox.video.sdk.RequestData {
	 /* .source "RequestData.java" */
	 /* # static fields */
	 private static final java.lang.String REQUEST_TYPE_ANDROID;
	 /* # instance fields */
	 private java.lang.String connectionType;
	 private java.lang.String deviceId;
	 private java.lang.String deviceId2;
	 private java.lang.String ipAddress;
	 private Double latitude;
	 private Double longitude;
	 private java.lang.String publisherId;
	 private Long timestamp;
	 private java.lang.String userAgent;
	 private java.lang.String userAgent2;
	 /* # direct methods */
	 public com.mobfox.video.sdk.RequestData ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* iput-wide v0, p0, Lcom/mobfox/video/sdk/RequestData;->longitude:D */
		 /* .line 20 */
		 /* iput-wide v0, p0, Lcom/mobfox/video/sdk/RequestData;->latitude:D */
		 /* .line 8 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getConnectionType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 116 */
		 v0 = this.connectionType;
	 } // .end method
	 public java.lang.String getDeviceId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 50 */
		 v0 = this.deviceId;
		 /* if-nez v0, :cond_0 */
		 /* .line 51 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 53 */
	 } // :goto_0
} // :cond_0
v0 = this.deviceId;
} // .end method
public java.lang.String getDeviceId2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = this.deviceId2;
} // .end method
public java.lang.String getIpAddress ( ) {
/* .locals 1 */
/* .prologue */
/* .line 92 */
v0 = this.ipAddress;
} // .end method
public Double getLatitude ( ) {
/* .locals 2 */
/* .prologue */
/* .line 80 */
/* iget-wide v0, p0, Lcom/mobfox/video/sdk/RequestData;->latitude:D */
/* return-wide v0 */
} // .end method
public Double getLongitude ( ) {
/* .locals 2 */
/* .prologue */
/* .line 72 */
/* iget-wide v0, p0, Lcom/mobfox/video/sdk/RequestData;->longitude:D */
/* return-wide v0 */
} // .end method
public java.lang.String getProtocolVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
final String v0 = "1.0"; // const-string v0, "1.0"
} // .end method
public java.lang.String getPublisherId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 61 */
v0 = this.publisherId;
/* if-nez v0, :cond_0 */
/* .line 62 */
final String v0 = ""; // const-string v0, ""
/* .line 64 */
} // :goto_0
} // :cond_0
v0 = this.publisherId;
} // .end method
public java.lang.String getRequestType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
final String v0 = "android_app"; // const-string v0, "android_app"
} // .end method
public Long getTimestamp ( ) {
/* .locals 2 */
/* .prologue */
/* .line 108 */
/* iget-wide v0, p0, Lcom/mobfox/video/sdk/RequestData;->timestamp:J */
/* return-wide v0 */
} // .end method
public java.lang.String getUserAgent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 28 */
v0 = this.userAgent;
/* if-nez v0, :cond_0 */
/* .line 29 */
final String v0 = ""; // const-string v0, ""
/* .line 31 */
} // :goto_0
} // :cond_0
v0 = this.userAgent;
} // .end method
public java.lang.String getUserAgent2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 39 */
v0 = this.userAgent2;
/* if-nez v0, :cond_0 */
/* .line 40 */
final String v0 = ""; // const-string v0, ""
/* .line 42 */
} // :goto_0
} // :cond_0
v0 = this.userAgent2;
} // .end method
public void setConnectionType ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "connectionType" # Ljava/lang/String; */
/* .prologue */
/* .line 120 */
this.connectionType = p1;
/* .line 121 */
return;
} // .end method
public void setDeviceId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "deviceId" # Ljava/lang/String; */
/* .prologue */
/* .line 57 */
this.deviceId = p1;
/* .line 58 */
return;
} // .end method
public void setDeviceId2 ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "deviceId2" # Ljava/lang/String; */
/* .prologue */
/* .line 104 */
this.deviceId2 = p1;
/* .line 105 */
return;
} // .end method
public void setIpAddress ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "ipAddress" # Ljava/lang/String; */
/* .prologue */
/* .line 96 */
this.ipAddress = p1;
/* .line 97 */
return;
} // .end method
public void setLatitude ( Double p0 ) {
/* .locals 0 */
/* .param p1, "latitude" # D */
/* .prologue */
/* .line 84 */
/* iput-wide p1, p0, Lcom/mobfox/video/sdk/RequestData;->latitude:D */
/* .line 85 */
return;
} // .end method
public void setLongitude ( Double p0 ) {
/* .locals 0 */
/* .param p1, "longitude" # D */
/* .prologue */
/* .line 76 */
/* iput-wide p1, p0, Lcom/mobfox/video/sdk/RequestData;->longitude:D */
/* .line 77 */
return;
} // .end method
public void setPublisherId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "publisherId" # Ljava/lang/String; */
/* .prologue */
/* .line 68 */
this.publisherId = p1;
/* .line 69 */
return;
} // .end method
public void setTimestamp ( Long p0 ) {
/* .locals 0 */
/* .param p1, "timestamp" # J */
/* .prologue */
/* .line 112 */
/* iput-wide p1, p0, Lcom/mobfox/video/sdk/RequestData;->timestamp:J */
/* .line 113 */
return;
} // .end method
public void setUserAgent ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .prologue */
/* .line 35 */
this.userAgent = p1;
/* .line 36 */
return;
} // .end method
public void setUserAgent2 ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .prologue */
/* .line 46 */
this.userAgent2 = p1;
/* .line 47 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 6 */
/* .prologue */
/* const-wide/16 v4, 0x0 */
/* .line 125 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "http://my.mobfox.com/vrequest.php"; // const-string v2, "http://my.mobfox.com/vrequest.php"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 127 */
/* .local v1, "url":Ljava/lang/StringBuilder; */
try { // :try_start_0
final String v2 = "?rt=android_app"; // const-string v2, "?rt=android_app"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 128 */
final String v2 = "&v="; // const-string v2, "&v="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 129 */
final String v2 = "1.0"; // const-string v2, "1.0"
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 130 */
v2 = this.ipAddress;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 131 */
final String v2 = "&i="; // const-string v2, "&i="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 132 */
v2 = this.ipAddress;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 134 */
} // :cond_0
final String v2 = "&u="; // const-string v2, "&u="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 135 */
v2 = this.userAgent;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 136 */
final String v2 = "&u2="; // const-string v2, "&u2="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 137 */
v2 = this.userAgent2;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 138 */
final String v2 = "&s="; // const-string v2, "&s="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 139 */
v2 = this.publisherId;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 140 */
final String v2 = "&o="; // const-string v2, "&o="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 141 */
v2 = this.deviceId;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 142 */
final String v2 = "&o2="; // const-string v2, "&o2="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 143 */
v2 = this.deviceId2;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 144 */
final String v2 = "&t="; // const-string v2, "&t="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 145 */
/* iget-wide v2, p0, Lcom/mobfox/video/sdk/RequestData;->timestamp:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 146 */
final String v2 = "&connection_type="; // const-string v2, "&connection_type="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 147 */
v2 = this.connectionType;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 149 */
/* iget-wide v2, p0, Lcom/mobfox/video/sdk/RequestData;->latitude:D */
/* cmpl-double v2, v2, v4 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget-wide v2, p0, Lcom/mobfox/video/sdk/RequestData;->longitude:D */
/* cmpl-double v2, v2, v4 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 150 */
final String v2 = "&lat="; // const-string v2, "&lat="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 151 */
/* iget-wide v2, p0, Lcom/mobfox/video/sdk/RequestData;->latitude:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 152 */
final String v2 = "&lon="; // const-string v2, "&lon="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 153 */
/* iget-wide v2, p0, Lcom/mobfox/video/sdk/RequestData;->longitude:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 159 */
} // :cond_1
} // :goto_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 155 */
/* :catch_0 */
/* move-exception v0 */
/* .line 156 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
(( java.io.UnsupportedEncodingException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
} // .end method
