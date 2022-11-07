class com.ansca.corona.Controller$19 implements com.facebook.android.AsyncFacebookRunner$RequestListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->facebookRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$19 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1279 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private void onThrowable ( java.lang.Throwable p0 ) {
/* .locals 3 */
/* .param p1, "e" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 1298 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1299 */
	 com.ansca.corona.Controller .getEventManager ( );
	 (( java.lang.Throwable ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;
	 int v2 = 1; // const/4 v2, 0x1
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;Z)V
	 /* .line 1301 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void onComplete ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .param p1, "response" # Ljava/lang/String; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1281 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1282 */
	 com.ansca.corona.Controller .getEventManager ( );
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;Z)V
	 /* .line 1284 */
} // :cond_0
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Lcom/facebook/android/FacebookError; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1295 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$19;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1296 */
return;
} // .end method
public void onFileNotFoundException ( java.io.FileNotFoundException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/io/FileNotFoundException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1289 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$19;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1290 */
return;
} // .end method
public void onIOException ( java.io.IOException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/io/IOException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1286 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$19;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1287 */
return;
} // .end method
public void onMalformedURLException ( java.net.MalformedURLException p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "e" # Ljava/net/MalformedURLException; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 1292 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller$19;->onThrowable(Ljava/lang/Throwable;)V */
/* .line 1293 */
return;
} // .end method
