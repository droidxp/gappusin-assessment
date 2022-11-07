class com.ansca.corona.Controller$18 implements com.facebook.android.AsyncFacebookRunner$RequestListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->facebookLogout()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$18 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1197 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private void onThrowable ( java.lang.Throwable p0 ) {
/* .locals 2 */
/* .param p1, "e" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 1216 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1217 */
	 com.ansca.corona.Controller .getEventManager ( );
	 (( java.lang.Throwable ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEventError ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEventError(Ljava/lang/String;)V
	 /* .line 1219 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void onComplete ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .param p1, "response" # Ljava/lang/String; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1199 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1200 */
	 com.ansca.corona.Controller .getEventManager ( );
	 int v1 = 3; // const/4 v1, 0x3
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(I)V
	 /* .line 1202 */
} // :cond_0
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Lcom/facebook/android/FacebookError; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1213 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$18;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1214 */
return;
} // .end method
public void onFileNotFoundException ( java.io.FileNotFoundException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/io/FileNotFoundException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1207 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$18;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1208 */
return;
} // .end method
public void onIOException ( java.io.IOException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/io/IOException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1204 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$18;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1205 */
return;
} // .end method
public void onMalformedURLException ( java.net.MalformedURLException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/net/MalformedURLException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1210 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$18;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1211 */
return;
} // .end method
