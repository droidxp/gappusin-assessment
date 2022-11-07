public class com.mobfox.sdk.data.Request {
	 /* .source "Request.java" */
	 /* # instance fields */
	 private java.lang.String deviceId;
	 private java.lang.String headers;
	 private Double latitude;
	 private Double longitude;
	 private com.mobfox.sdk.Mode mode;
	 private java.lang.String protocolVersion;
	 private java.lang.String publisherId;
	 private java.lang.String requestType;
	 private java.lang.String userAgent;
	 private java.lang.String userAgent2;
	 /* # direct methods */
	 public com.mobfox.sdk.data.Request ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 /* iput-wide v0, p0, Lcom/mobfox/sdk/data/Request;->longitude:D */
		 /* .line 19 */
		 /* iput-wide v0, p0, Lcom/mobfox/sdk/data/Request;->latitude:D */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getAndroidVersion ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 119 */
		 v0 = android.os.Build$VERSION.RELEASE;
	 } // .end method
	 public java.lang.String getDeviceId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 66 */
		 v0 = this.deviceId;
		 /* if-nez v0, :cond_0 */
		 /* .line 67 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 69 */
	 } // :goto_0
} // :cond_0
v0 = this.deviceId;
} // .end method
public java.lang.String getDeviceMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 115 */
v0 = android.os.Build.MODEL;
} // .end method
public java.lang.String getHeaders ( ) {
/* .locals 1 */
/* .prologue */
/* .line 55 */
v0 = this.headers;
/* if-nez v0, :cond_0 */
/* .line 56 */
final String v0 = ""; // const-string v0, ""
/* .line 58 */
} // :goto_0
} // :cond_0
v0 = this.headers;
} // .end method
public Double getLatitude ( ) {
/* .locals 2 */
/* .prologue */
/* .line 107 */
/* iget-wide v0, p0, Lcom/mobfox/sdk/data/Request;->latitude:D */
/* return-wide v0 */
} // .end method
public Double getLongitude ( ) {
/* .locals 2 */
/* .prologue */
/* .line 99 */
/* iget-wide v0, p0, Lcom/mobfox/sdk/data/Request;->longitude:D */
/* return-wide v0 */
} // .end method
public com.mobfox.sdk.Mode getMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 77 */
v0 = this.mode;
/* if-nez v0, :cond_0 */
/* .line 78 */
v0 = com.mobfox.sdk.Mode.LIVE;
this.mode = v0;
/* .line 80 */
} // :cond_0
v0 = this.mode;
} // .end method
public java.lang.String getProtocolVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 123 */
v0 = this.protocolVersion;
/* if-nez v0, :cond_0 */
/* .line 124 */
final String v0 = ""; // const-string v0, ""
/* .line 126 */
} // :goto_0
} // :cond_0
v0 = this.protocolVersion;
} // .end method
public java.lang.String getPublisherId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
v0 = this.publisherId;
/* if-nez v0, :cond_0 */
/* .line 89 */
final String v0 = ""; // const-string v0, ""
/* .line 91 */
} // :goto_0
} // :cond_0
v0 = this.publisherId;
} // .end method
public java.lang.String getRequestType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
v0 = this.requestType;
/* if-nez v0, :cond_0 */
/* .line 23 */
final String v0 = ""; // const-string v0, ""
/* .line 25 */
} // :goto_0
} // :cond_0
v0 = this.requestType;
} // .end method
public java.lang.String getUserAgent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 33 */
v0 = this.userAgent;
/* if-nez v0, :cond_0 */
/* .line 34 */
final String v0 = ""; // const-string v0, ""
/* .line 36 */
} // :goto_0
} // :cond_0
v0 = this.userAgent;
} // .end method
public java.lang.String getUserAgent2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = this.userAgent2;
/* if-nez v0, :cond_0 */
/* .line 45 */
final String v0 = ""; // const-string v0, ""
/* .line 47 */
} // :goto_0
} // :cond_0
v0 = this.userAgent2;
} // .end method
public void setDeviceId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "deviceId" # Ljava/lang/String; */
/* .prologue */
/* .line 73 */
this.deviceId = p1;
/* .line 74 */
return;
} // .end method
public void setHeaders ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "headers" # Ljava/lang/String; */
/* .prologue */
/* .line 62 */
this.headers = p1;
/* .line 63 */
return;
} // .end method
public void setLatitude ( Double p0 ) {
/* .locals 0 */
/* .param p1, "latitude" # D */
/* .prologue */
/* .line 111 */
/* iput-wide p1, p0, Lcom/mobfox/sdk/data/Request;->latitude:D */
/* .line 112 */
return;
} // .end method
public void setLongitude ( Double p0 ) {
/* .locals 0 */
/* .param p1, "longitude" # D */
/* .prologue */
/* .line 103 */
/* iput-wide p1, p0, Lcom/mobfox/sdk/data/Request;->longitude:D */
/* .line 104 */
return;
} // .end method
public void setMode ( com.mobfox.sdk.Mode p0 ) {
/* .locals 0 */
/* .param p1, "mode" # Lcom/mobfox/sdk/Mode; */
/* .prologue */
/* .line 84 */
this.mode = p1;
/* .line 85 */
return;
} // .end method
public void setProtocolVersion ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "protocolVersion" # Ljava/lang/String; */
/* .prologue */
/* .line 130 */
this.protocolVersion = p1;
/* .line 131 */
return;
} // .end method
public void setPublisherId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "publisherId" # Ljava/lang/String; */
/* .prologue */
/* .line 95 */
this.publisherId = p1;
/* .line 96 */
return;
} // .end method
public void setRequestType ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "requestType" # Ljava/lang/String; */
/* .prologue */
/* .line 29 */
this.requestType = p1;
/* .line 30 */
return;
} // .end method
public void setUserAgent ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .prologue */
/* .line 40 */
this.userAgent = p1;
/* .line 41 */
return;
} // .end method
public void setUserAgent2 ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .prologue */
/* .line 51 */
this.userAgent2 = p1;
/* .line 52 */
return;
} // .end method
