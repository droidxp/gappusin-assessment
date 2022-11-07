public class org.cocos2dx.lib.Cocos2dxTypefaces {
	 /* .source "Cocos2dxTypefaces.java" */
	 /* # static fields */
	 private static final java.util.HashMap sTypefaceCache;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
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
/* .line 40 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public org.cocos2dx.lib.Cocos2dxTypefaces ( ) {
/* .locals 0 */
/* .prologue */
/* .line 31 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static synchronized android.graphics.Typeface get ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "pContext" # Landroid/content/Context; */
/* .param p1, "pAssetName" # Ljava/lang/String; */
/* .prologue */
/* .line 59 */
/* const-class v2, Lorg/cocos2dx/lib/Cocos2dxTypefaces; */
/* monitor-enter v2 */
try { // :try_start_0
	 v1 = org.cocos2dx.lib.Cocos2dxTypefaces.sTypefaceCache;
	 v1 = 	 (( java.util.HashMap ) v1 ).containsKey ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_0 */
	 /* .line 60 */
	 (( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 android.graphics.Typeface .createFromAsset ( v1,p1 );
	 /* .line 61 */
	 /* .local v0, "typeface":Landroid/graphics/Typeface; */
	 v1 = org.cocos2dx.lib.Cocos2dxTypefaces.sTypefaceCache;
	 (( java.util.HashMap ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 64 */
} // .end local v0 # "typeface":Landroid/graphics/Typeface;
} // :cond_0
v1 = org.cocos2dx.lib.Cocos2dxTypefaces.sTypefaceCache;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Typeface; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v2 */
/* .line 59 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* throw v1 */
} // .end method
