public class com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver extends android.content.BroadcastReceiver {
	 /* .source "GoogleStoreBroadcastReceiver.java" */
	 /* # static fields */
	 private static java.util.ArrayList sListeners;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver ( ) {
/* .locals 1 */
/* .prologue */
/* .line 14 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
return;
} // .end method
public com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver ( ) {
/* .locals 0 */
/* .prologue */
/* .line 12 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
public static void addListener ( com.ansca.corona.purchasing.GoogleStoreBroadcastListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener; */
/* .prologue */
/* .line 23 */
/* if-nez p0, :cond_1 */
/* .line 34 */
} // :cond_0
} // :goto_0
return;
/* .line 28 */
} // :cond_1
v0 = com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver.sListeners;
v0 = (( java.util.ArrayList ) v0 ).indexOf ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
/* if-gez v0, :cond_0 */
/* .line 33 */
v0 = com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver.sListeners;
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // .end method
public static void removeListener ( com.ansca.corona.purchasing.GoogleStoreBroadcastListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener; */
/* .prologue */
/* .line 42 */
/* if-nez p0, :cond_0 */
/* .line 48 */
} // :goto_0
return;
/* .line 47 */
} // :cond_0
v0 = com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver.sListeners;
(( java.util.ArrayList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 57 */
v2 = com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver.sListeners;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener; */
/* .line 58 */
/* .local v1, "listener":Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 59 */
/* .line 62 */
} // .end local v1 # "listener":Lcom/ansca/corona/purchasing/GoogleStoreBroadcastListener;
} // :cond_1
return;
} // .end method
