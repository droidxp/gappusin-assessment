public class org.cocos2dx.lib.Cocos2dxTypefaces {
	 /* .source "Cocos2dxTypefaces.java" */
	 /* # static fields */
	 private static final java.util.Hashtable cache;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Hashtable", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Landroid/graphics/Typeface;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static org.cocos2dx.lib.Cocos2dxTypefaces ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
/* .line 31 */
return;
} // .end method
public org.cocos2dx.lib.Cocos2dxTypefaces ( ) {
/* .locals 0 */
/* .prologue */
/* .line 31 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static android.graphics.Typeface get ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 35 */
v2 = org.cocos2dx.lib.Cocos2dxTypefaces.cache;
/* monitor-enter v2 */
/* .line 36 */
try { // :try_start_0
	 v1 = org.cocos2dx.lib.Cocos2dxTypefaces.cache;
	 v1 = 	 (( java.util.Hashtable ) v1 ).containsKey ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_0 */
	 /* .line 37 */
	 (( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 android.graphics.Typeface .createFromAsset ( v1,p1 );
	 /* .line 38 */
	 /* .local v0, "t":Landroid/graphics/Typeface; */
	 v1 = org.cocos2dx.lib.Cocos2dxTypefaces.cache;
	 (( java.util.Hashtable ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 41 */
} // .end local v0 # "t":Landroid/graphics/Typeface;
} // :cond_0
v1 = org.cocos2dx.lib.Cocos2dxTypefaces.cache;
(( java.util.Hashtable ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Typeface; */
/* monitor-exit v2 */
/* .line 35 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
