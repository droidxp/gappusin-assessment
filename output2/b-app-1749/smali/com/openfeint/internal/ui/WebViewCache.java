public class com.openfeint.internal.ui.WebViewCache {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$SaxHandler;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$ManifestData;, */
	 /* Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String ManifestRequestKey;
private static final java.lang.String OPENFEINT_ROOT;
static final java.lang.String TAG;
private static final java.lang.String WEBUI;
private static Boolean diskError;
static final Integer kBatchLoaded;
static final Long kBatchRetryDelayMillis;
static final Integer kClientManifestReady;
static final Integer kDataLoaded;
static final Integer kNumBatchRetries;
static final Integer kServerManifestReady;
public static java.lang.String manifestProductOverride;
private static java.lang.String rootPath;
private static java.lang.String rootUri;
static com.openfeint.internal.ui.WebViewCache sInstance;
public static java.net.URI serverOverride;
/* # instance fields */
android.content.Context appContext;
Boolean batchesAreBroken;
java.util.Map clientManifest;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
com.openfeint.internal.ui.WebViewCacheCallback delegate;
Boolean globalsFinished;
Boolean loadingFinished;
android.os.Handler mDelayHandler;
android.os.Handler mHandler;
java.util.Set pathsToLoad;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Set prioritizedPaths;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
com.openfeint.internal.ui.WebViewCache$ManifestData serverManifest;
final java.net.URI serverURI;
java.util.Map trackedItems;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Set trackedPaths;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.openfeint.internal.ui.WebViewCache ( ) {
/* .locals 1 */
/* .prologue */
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
com.openfeint.internal.ui.WebViewCache.diskError = (v0!= 0);
return;
} // .end method
private com.openfeint.internal.ui.WebViewCache ( ) {
/* .locals 1 */
/* .param p1, "_appContext" # Landroid/content/Context; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 394 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 179 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
/* .line 180 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->globalsFinished:Z */
/* .line 186 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->batchesAreBroken:Z */
/* .line 194 */
com.openfeint.internal.ui.WebViewCache .getServerURI ( );
this.serverURI = v0;
/* .line 395 */
this.appContext = p1;
/* .line 396 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.trackedPaths = v0;
/* .line 397 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.trackedItems = v0;
/* .line 398 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.pathsToLoad = v0;
/* .line 399 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.prioritizedPaths = v0;
/* .line 401 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.mDelayHandler = v0;
/* .line 402 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache$3; */
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/ui/WebViewCache$3;-><init>(Lcom/openfeint/internal/ui/WebViewCache;)V */
this.mHandler = v0;
/* .line 428 */
return;
} // .end method
static void access$000 ( com.openfeint.internal.ui.WebViewCache p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->deleteAll()V */
return;
} // .end method
static void access$100 ( com.openfeint.internal.ui.WebViewCache p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->clientManifestReady()V */
return;
} // .end method
static void access$1000 ( com.openfeint.internal.ui.WebViewCache p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->finishWithoutLoading()V */
return;
} // .end method
static void access$1200 ( com.openfeint.internal.ui.WebViewCache p0, Integer p1, Object[] p2, java.lang.String p3, java.lang.String p4, Integer p5, java.util.Set p6 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # I */
/* .param p2, "x2" # [B */
/* .param p3, "x3" # Ljava/lang/String; */
/* .param p4, "x4" # Ljava/lang/String; */
/* .param p5, "x5" # I */
/* .param p6, "x6" # Ljava/util/Set; */
/* .prologue */
/* .line 49 */
/* invoke-direct/range {p0 ..p6}, Lcom/openfeint/internal/ui/WebViewCache;->handleBatchBody(I[BLjava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
return;
} // .end method
static void access$1300 ( com.openfeint.internal.ui.WebViewCache p0, java.util.Set p1, Integer p2 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # Ljava/util/Set; */
/* .param p2, "x2" # I */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache;->batchRequest(Ljava/util/Set;I)V */
return;
} // .end method
static void access$1400 ( com.openfeint.internal.ui.WebViewCache p0, java.lang.String p1, java.lang.String p2, Integer p3, java.util.Set p4 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # Ljava/lang/String; */
/* .param p2, "x2" # Ljava/lang/String; */
/* .param p3, "x3" # I */
/* .param p4, "x4" # Ljava/util/Set; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/openfeint/internal/ui/WebViewCache;->batchFetch(Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
return;
} // .end method
static java.lang.String access$1500 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 49 */
v0 = com.openfeint.internal.ui.WebViewCache.rootPath;
} // .end method
static void access$1600 ( com.openfeint.internal.ui.WebViewCache p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->sync()V */
return;
} // .end method
static void access$200 ( com.openfeint.internal.ui.WebViewCache p0, java.io.File p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # Ljava/io/File; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/ui/WebViewCache;->copyDefaultBackground(Ljava/io/File;)V */
return;
} // .end method
static void access$300 ( com.openfeint.internal.ui.WebViewCache p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->triggerUpdates()V */
return;
} // .end method
static void access$400 ( com.openfeint.internal.ui.WebViewCache p0, java.lang.String p1, Boolean p2 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # Ljava/lang/String; */
/* .param p2, "x2" # Z */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache;->finishItem(Ljava/lang/String;Z)V */
return;
} // .end method
static void access$500 ( com.openfeint.internal.ui.WebViewCache p0, java.util.Set p1, Boolean p2 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p1, "x1" # Ljava/util/Set; */
/* .param p2, "x2" # Z */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache;->finishItems(Ljava/util/Set;Z)V */
return;
} // .end method
static java.lang.String access$600 ( android.content.Context p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Landroid/content/Context; */
/* .prologue */
/* .line 49 */
com.openfeint.internal.ui.WebViewCache .getManifestPath ( p0 );
} // .end method
private void batchFetch ( java.lang.String p0, java.lang.String p1, Integer p2, java.util.Set p3 ) {
/* .locals 6 */
/* .param p1, "originalUrl" # Ljava/lang/String; */
/* .param p2, "currentUrl" # Ljava/lang/String; */
/* .param p3, "retriesLeft" # I */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "I", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 832 */
/* .local p4, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache$4; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/ui/WebViewCache$4;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
(( com.openfeint.internal.ui.WebViewCache$4 ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache$4;->launch()V
/* .line 842 */
return;
} // .end method
private void batchRequest ( java.util.Set p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 845 */
/* .local p1, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
int v0 = 3; // const/4 v0, 0x3
/* invoke-direct {p0, p1, v0}, Lcom/openfeint/internal/ui/WebViewCache;->batchRequest(Ljava/util/Set;I)V */
/* .line 846 */
return;
} // .end method
private void batchRequest ( java.util.Set p0, Integer p1 ) {
/* .locals 9 */
/* .param p2, "numRetries" # I */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;I)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 849 */
/* .local p1, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
final String v4 = "WebViewCache"; // const-string v4, "WebViewCache"
final String v5 = "Syncing %d items"; // const-string v5, "Syncing %d items"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
v8 = int v7 = 0; // const/4 v7, 0x0
java.lang.Integer .valueOf ( v8 );
/* aput-object v8, v6, v7 */
java.lang.String .format ( v5,v6 );
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 851 */
/* new-instance v2, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v2}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 853 */
/* .local v2, "oal":Lcom/openfeint/internal/request/OrderedArgList; */
/* .local v0, "i$":Ljava/util/Iterator; */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v3, Ljava/lang/String; */
/* .line 854 */
/* .local v3, "s":Ljava/lang/String; */
v4 = this.serverManifest;
v4 = this.objects;
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 855 */
/* .local v1, "manifestItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
final String v4 = "files[][path]"; // const-string v4, "files[][path]"
v5 = this.path;
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 856 */
final String v4 = "files[][hash]"; // const-string v4, "files[][hash]"
v5 = this.hash;
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 859 */
} // .end local v1 # "manifestItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v3 # "s":Ljava/lang/String;
} // :cond_0
/* new-instance v4, Lcom/openfeint/internal/ui/WebViewCache$5; */
/* invoke-direct {v4, p0, v2, p2, p1}, Lcom/openfeint/internal/ui/WebViewCache$5;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Lcom/openfeint/internal/request/OrderedArgList;ILjava/util/Set;)V */
(( com.openfeint.internal.ui.WebViewCache$5 ) v4 ).launch ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/ui/WebViewCache$5;->launch()V
/* .line 868 */
return;
} // .end method
private void clientManifestReady ( ) {
/* .locals 4 */
/* .prologue */
/* .line 671 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->getDefaultClientManifest()Ljava/util/Map; */
/* .line 672 */
/* .local v1, "obj":Ljava/util/Map; */
v2 = this.mHandler;
int v3 = 3; // const/4 v3, 0x3
android.os.Message .obtain ( v2,v3 );
/* .line 673 */
/* .local v0, "msg":Landroid/os/Message; */
this.obj = v1;
/* .line 674 */
(( android.os.Message ) v0 ).sendToTarget ( ); // invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
/* .line 675 */
return;
} // .end method
private void copyDefaultBackground ( java.io.File p0 ) {
/* .locals 5 */
/* .param p1, "baseDir" # Ljava/io/File; */
/* .prologue */
/* .line 607 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 608 */
/* .local v0, "defaultItems":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
final String v3 = "webui"; // const-string v3, "webui"
/* invoke-direct {p0, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->gatherDefaultItems(Ljava/lang/String;Ljava/util/Set;)V */
/* .line 609 */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/ui/WebViewCache;->stripUnused(Ljava/util/Set;)Ljava/util/Set; */
/* .line 610 */
final String v3 = "webui/manifest.plist"; // const-string v3, "webui/manifest.plist"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 611 */
final String v3 = "webui/javascripts/"; // const-string v3, "webui/javascripts/"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copyDirectory(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 612 */
final String v3 = "webui/stylesheets/"; // const-string v3, "webui/stylesheets/"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copyDirectory(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 613 */
final String v3 = "webui/intro/"; // const-string v3, "webui/intro/"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copyDirectory(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 614 */
v3 = this.appContext;
com.openfeint.internal.Util .getDpiName ( v3 );
final String v4 = "mdpi"; // const-string v4, "mdpi"
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 615 */
final String v3 = "webui/images/space.grid.mdpi.png"; // const-string v3, "webui/images/space.grid.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 616 */
final String v3 = "webui/images/button.gray.mdpi.png"; // const-string v3, "webui/images/button.gray.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 617 */
final String v3 = "webui/images/button.gray.hit.mdpi.png"; // const-string v3, "webui/images/button.gray.hit.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 618 */
final String v3 = "webui/images/button.green.mdpi.png"; // const-string v3, "webui/images/button.green.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 619 */
final String v3 = "webui/images/button.green.hit.mdpi.png"; // const-string v3, "webui/images/button.green.hit.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 620 */
final String v3 = "webui/images/logo.small.mdpi.png"; // const-string v3, "webui/images/logo.small.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 621 */
final String v3 = "webui/images/header_bg.mdpi.png"; // const-string v3, "webui/images/header_bg.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 622 */
final String v3 = "webui/images/loading.spinner.mdpi.png"; // const-string v3, "webui/images/loading.spinner.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 623 */
final String v3 = "webui/images/input.text.mdpi.png"; // const-string v3, "webui/images/input.text.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 624 */
final String v3 = "webui/images/frame.small.mdpi.png"; // const-string v3, "webui/images/frame.small.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 625 */
final String v3 = "webui/images/icon.leaf.gray.mdpi.png"; // const-string v3, "webui/images/icon.leaf.gray.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 626 */
final String v3 = "webui/images/tab.divider.mdpi.png"; // const-string v3, "webui/images/tab.divider.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 627 */
final String v3 = "webui/images/tab.active_indicator.mdpi.png"; // const-string v3, "webui/images/tab.active_indicator.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 629 */
final String v3 = "webui/images/logo.mdpi.png"; // const-string v3, "webui/images/logo.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 630 */
final String v3 = "webui/images/header_bg.mdpi.png"; // const-string v3, "webui/images/header_bg.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 631 */
final String v3 = "webui/images/loading.spinner.mdpi.png"; // const-string v3, "webui/images/loading.spinner.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 632 */
final String v3 = "webui/images/icon.user.male.mdpi.png"; // const-string v3, "webui/images/icon.user.male.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 633 */
final String v3 = "webui/images/intro.leaderboards.mdpi.png"; // const-string v3, "webui/images/intro.leaderboards.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 634 */
final String v3 = "webui/images/intro.friends.mdpi.png"; // const-string v3, "webui/images/intro.friends.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 635 */
final String v3 = "webui/images/intro.achievements.mdpi.png"; // const-string v3, "webui/images/intro.achievements.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 636 */
final String v3 = "webui/images/intro.games.mdpi.png"; // const-string v3, "webui/images/intro.games.mdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 663 */
} // :goto_0
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->clientManifestReady()V */
/* .line 665 */
/* .local v1, "i$":Ljava/util/Iterator; */
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 666 */
/* .local v2, "path":Ljava/lang/String; */
/* invoke-direct {p0, p1, v2}, Lcom/openfeint/internal/ui/WebViewCache;->copySingleItem(Ljava/io/File;Ljava/lang/String;)V */
/* .line 640 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v2 # "path":Ljava/lang/String;
} // :cond_0
final String v3 = "webui/images/space.grid.hdpi.png"; // const-string v3, "webui/images/space.grid.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 641 */
final String v3 = "webui/images/button.gray.hdpi.png"; // const-string v3, "webui/images/button.gray.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 642 */
final String v3 = "webui/images/button.gray.hit.hdpi.png"; // const-string v3, "webui/images/button.gray.hit.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 643 */
final String v3 = "webui/images/button.green.hdpi.png"; // const-string v3, "webui/images/button.green.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 644 */
final String v3 = "webui/images/button.green.hit.hdpi.png"; // const-string v3, "webui/images/button.green.hit.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 645 */
final String v3 = "webui/images/logo.small.hdpi.png"; // const-string v3, "webui/images/logo.small.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 646 */
final String v3 = "webui/images/header_bg.hdpi.png"; // const-string v3, "webui/images/header_bg.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 647 */
final String v3 = "webui/images/loading.spinner.hdpi.png"; // const-string v3, "webui/images/loading.spinner.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 648 */
final String v3 = "webui/images/input.text.hdpi.png"; // const-string v3, "webui/images/input.text.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 649 */
final String v3 = "webui/images/frame.small.hdpi.png"; // const-string v3, "webui/images/frame.small.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 650 */
final String v3 = "webui/images/icon.leaf.gray.hdpi.png"; // const-string v3, "webui/images/icon.leaf.gray.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 651 */
final String v3 = "webui/images/tab.divider.hdpi.png"; // const-string v3, "webui/images/tab.divider.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 652 */
final String v3 = "webui/images/tab.active_indicator.hdpi.png"; // const-string v3, "webui/images/tab.active_indicator.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 654 */
final String v3 = "webui/images/logo.hdpi.png"; // const-string v3, "webui/images/logo.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 655 */
final String v3 = "webui/images/header_bg.hdpi.png"; // const-string v3, "webui/images/header_bg.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 656 */
final String v3 = "webui/images/loading.spinner.hdpi.png"; // const-string v3, "webui/images/loading.spinner.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 657 */
final String v3 = "webui/images/icon.user.male.hdpi.png"; // const-string v3, "webui/images/icon.user.male.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 658 */
final String v3 = "webui/images/intro.leaderboards.hdpi.png"; // const-string v3, "webui/images/intro.leaderboards.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 659 */
final String v3 = "webui/images/intro.friends.hdpi.png"; // const-string v3, "webui/images/intro.friends.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 660 */
final String v3 = "webui/images/intro.achievements.hdpi.png"; // const-string v3, "webui/images/intro.achievements.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 661 */
final String v3 = "webui/images/intro.games.hdpi.png"; // const-string v3, "webui/images/intro.games.hdpi.png"
/* invoke-direct {p0, p1, v3, v0}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 668 */
/* .restart local v1 # "i$":Ljava/util/Iterator; */
} // :cond_1
return;
} // .end method
private void copyDirectory ( java.io.File p0, java.lang.String p1, java.util.Set p2 ) {
/* .locals 4 */
/* .param p1, "baseDir" # Ljava/io/File; */
/* .param p2, "root" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 598 */
/* .local p3, "items":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 599 */
/* .local v0, "dirItems":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 600 */
/* .local v2, "path":Ljava/lang/String; */
v3 = (( java.lang.String ) v2 ).startsWith ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 602 */
} // .end local v2 # "path":Ljava/lang/String;
} // :cond_1
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .restart local v2 # "path":Ljava/lang/String; */
/* invoke-direct {p0, p1, v2, p3}, Lcom/openfeint/internal/ui/WebViewCache;->copySpecific(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V */
/* .line 603 */
} // .end local v2 # "path":Ljava/lang/String;
} // :cond_2
return;
} // .end method
private void copySingleItem ( java.io.File p0, java.lang.String p1 ) {
/* .locals 8 */
/* .param p1, "baseDir" # Ljava/io/File; */
/* .param p2, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 566 */
try { // :try_start_0
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 567 */
/* .local v1, "filePath":Ljava/io/File; */
v6 = this.appContext;
(( android.content.Context ) v6 ).getAssets ( ); // invoke-virtual {v6}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v6 ).open ( p2 ); // invoke-virtual {v6, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 568 */
/* .local v3, "inputStream":Ljava/io/InputStream; */
/* new-instance v4, Ljava/io/DataInputStream; */
/* invoke-direct {v4, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 570 */
/* .local v4, "reader":Ljava/io/DataInputStream; */
(( java.io.File ) v1 ).getParentFile ( ); // invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;
(( java.io.File ) v6 ).mkdirs ( ); // invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z
/* .line 571 */
/* new-instance v2, Ljava/io/FileOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 572 */
/* .local v2, "fileStream":Ljava/io/FileOutputStream; */
/* new-instance v5, Ljava/io/DataOutputStream; */
/* invoke-direct {v5, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 573 */
/* .local v5, "writer":Ljava/io/DataOutputStream; */
com.openfeint.internal.Util .copyStream ( v4,v5 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 578 */
} // .end local v1 # "filePath":Ljava/io/File;
} // .end local v2 # "fileStream":Ljava/io/FileOutputStream;
} // .end local v3 # "inputStream":Ljava/io/InputStream;
} // .end local v4 # "reader":Ljava/io/DataInputStream;
} // .end local v5 # "writer":Ljava/io/DataOutputStream;
} // :goto_0
return;
/* .line 575 */
/* :catch_0 */
/* move-exception v0 */
/* .line 576 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v6 = "WebViewCache"; // const-string v6, "WebViewCache"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
} // .end method
private void copySpecific ( java.io.File p0, java.lang.String p1, java.util.Set p2 ) {
/* .locals 1 */
/* .param p1, "baseDir" # Ljava/io/File; */
/* .param p2, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 591 */
v0 = /* .local p3, "items":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 592 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache;->copySingleItem(Ljava/io/File;Ljava/lang/String;)V */
/* .line 593 */
/* .line 595 */
} // :cond_0
return;
} // .end method
private void deleteAll ( ) {
/* .locals 4 */
/* .prologue */
/* .line 537 */
v2 = this.appContext;
(( android.content.Context ) v2 ).getFilesDir ( ); // invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* .line 538 */
/* .local v0, "baseDir":Ljava/io/File; */
/* new-instance v1, Ljava/io/File; */
final String v2 = "webui"; // const-string v2, "webui"
/* invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 539 */
/* .local v1, "webui":Ljava/io/File; */
com.openfeint.internal.Util .deleteFiles ( v1 );
/* .line 540 */
v2 = this.appContext;
final String v3 = "manifest.db"; // const-string v3, "manifest.db"
(( android.content.Context ) v2 ).getDatabasePath ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
/* .line 541 */
return;
} // .end method
public static void diskError ( ) {
/* .locals 3 */
/* .prologue */
/* .line 212 */
int v2 = 1; // const/4 v2, 0x1
com.openfeint.internal.ui.WebViewCache.diskError = (v2!= 0);
/* .line 213 */
v2 = com.openfeint.internal.ui.WebViewCache.sInstance;
v2 = this.trackedPaths;
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
/* .line 214 */
/* .local v1, "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
v2 = this.callback;
(( com.openfeint.internal.ui.WebViewCacheCallback ) v2 ).failLoaded ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->failLoaded()V
/* .line 216 */
} // .end local v1 # "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;
} // :cond_0
v2 = com.openfeint.internal.ui.WebViewCache.sInstance;
v2 = this.trackedPaths;
/* .line 217 */
v2 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* invoke-direct {v2}, Lcom/openfeint/internal/ui/WebViewCache;->finishWithoutLoading()V */
/* .line 218 */
return;
} // .end method
private void finishGlobals ( ) {
/* .locals 10 */
/* .prologue */
/* .line 904 */
v6 = this.trackedPaths;
/* .local v0, "i$":Ljava/util/Iterator; */
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* check-cast v4, Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
/* .line 905 */
/* .local v4, "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
v6 = this.pathsToLoad;
v6 = v7 = this.path;
/* if-nez v6, :cond_0 */
/* .line 906 */
v6 = this.callback;
v7 = this.path;
(( com.openfeint.internal.ui.WebViewCacheCallback ) v6 ).pathLoaded ( v7 ); // invoke-virtual {v6, v7}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->pathLoaded(Ljava/lang/String;)V
/* .line 910 */
} // :cond_0
v6 = this.serverManifest;
v6 = this.objects;
v7 = this.path;
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 911 */
/* .local v1, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* new-instance v2, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* invoke-direct {v2, v1}, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;-><init>(Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;)V */
/* .line 912 */
/* .local v2, "newItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
v6 = this.dependentObjects;
v7 = this.pathsToLoad;
/* .line 913 */
v6 = this.trackedItems;
v7 = this.path;
/* new-instance v8, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
v9 = this.callback;
/* invoke-direct {v8, v2, v9}, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;-><init>(Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;Lcom/openfeint/internal/ui/WebViewCacheCallback;)V */
/* .line 916 */
} // .end local v1 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v2 # "newItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v4 # "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;
} // :cond_1
v6 = this.trackedPaths;
/* .line 919 */
/* new-instance v5, Ljava/util/HashSet; */
/* invoke-direct {v5}, Ljava/util/HashSet;-><init>()V */
/* .line 920 */
/* .local v5, "priorityDependents":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v6 = this.prioritizedPaths;
} // :cond_2
v6 = } // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_3
/* check-cast v3, Ljava/lang/String; */
/* .line 921 */
/* .local v3, "path":Ljava/lang/String; */
v6 = v6 = this.pathsToLoad;
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 922 */
v6 = this.serverManifest;
v6 = this.objects;
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 923 */
/* .restart local v1 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 924 */
v6 = this.dependentObjects;
/* .line 927 */
} // .end local v1 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // .end local v3 # "path":Ljava/lang/String;
} // :cond_3
v6 = this.pathsToLoad;
/* .line 928 */
v6 = this.prioritizedPaths;
/* .line 930 */
int v6 = 1; // const/4 v6, 0x1
/* iput-boolean v6, p0, Lcom/openfeint/internal/ui/WebViewCache;->globalsFinished:Z */
/* .line 931 */
return;
} // .end method
private void finishItem ( java.lang.String p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "succeeded" # Z */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 997 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
/* .line 998 */
/* .local v0, "tiny":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;" */
(( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* .line 999 */
/* invoke-direct {p0, v0, p2, v1}, Lcom/openfeint/internal/ui/WebViewCache;->finishItems(Ljava/util/Set;ZZ)V */
/* .line 1000 */
return;
} // .end method
private void finishItems ( java.util.Set p0, Boolean p1 ) {
/* .locals 1 */
/* .param p2, "succeeded" # Z */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 1003 */
/* .local p1, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lcom/openfeint/internal/ui/WebViewCache;->finishItems(Ljava/util/Set;ZZ)V */
/* .line 1004 */
return;
} // .end method
private void finishItems ( java.util.Set p0, Boolean p1, Boolean p2 ) {
/* .locals 11 */
/* .param p2, "succeeded" # Z */
/* .param p3, "wasSingular" # Z */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;ZZ)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 1007 */
/* .local p1, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v9 = this.serverManifest;
/* if-nez v9, :cond_0 */
/* .line 1054 */
} // :goto_0
return;
/* .line 1009 */
} // :cond_0
/* if-nez p2, :cond_1 */
/* if-nez p3, :cond_1 */
/* .line 1012 */
int v9 = 1; // const/4 v9, 0x1
/* iput-boolean v9, p0, Lcom/openfeint/internal/ui/WebViewCache;->batchesAreBroken:Z */
/* .line 1053 */
} // :goto_1
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->loadNextItem()V */
/* .line 1015 */
} // :cond_1
v9 = this.trackedItems;
/* .local v3, "i$":Ljava/util/Iterator; */
v9 = } // :goto_2
if ( v9 != null) { // if-eqz v9, :cond_2
/* check-cast v4, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
/* .line 1016 */
/* .local v4, "itemAndCb":Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
v9 = this.item;
v9 = this.dependentObjects;
/* .line 1018 */
} // .end local v4 # "itemAndCb":Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;
} // :cond_2
v9 = this.pathsToLoad;
/* .line 1019 */
v9 = this.serverManifest;
v9 = this.globals;
/* .line 1020 */
v9 = this.prioritizedPaths;
/* .line 1023 */
/* iget-boolean v9, p0, Lcom/openfeint/internal/ui/WebViewCache;->globalsFinished:Z */
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 1024 */
/* new-instance v7, Ljava/util/HashSet; */
/* invoke-direct {v7}, Ljava/util/HashSet;-><init>()V */
/* .line 1025 */
/* .local v7, "pathsToRemove":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;" */
v9 = this.trackedItems;
} // :cond_3
v9 = } // :goto_3
if ( v9 != null) { // if-eqz v9, :cond_4
/* check-cast v4, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
/* .line 1026 */
/* .restart local v4 # "itemAndCb":Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
v9 = this.pathsToLoad;
v10 = this.item;
v9 = v10 = this.path;
/* if-nez v9, :cond_3 */
v9 = this.item;
v9 = v9 = this.dependentObjects;
/* if-nez v9, :cond_3 */
/* .line 1027 */
v9 = this.item;
v9 = this.path;
(( java.util.HashSet ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* .line 1028 */
v9 = this.callback;
v10 = this.item;
v10 = this.path;
(( com.openfeint.internal.ui.WebViewCacheCallback ) v9 ).pathLoaded ( v10 ); // invoke-virtual {v9, v10}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->pathLoaded(Ljava/lang/String;)V
/* .line 1032 */
} // .end local v4 # "itemAndCb":Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;
} // :cond_4
(( java.util.HashSet ) v7 ).iterator ( ); // invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v9 = } // :goto_4
if ( v9 != null) { // if-eqz v9, :cond_5
/* check-cast v8, Ljava/lang/String; */
/* .line 1033 */
/* .local v8, "removePath":Ljava/lang/String; */
v9 = this.trackedItems;
/* .line 1038 */
} // .end local v7 # "pathsToRemove":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
} // .end local v8 # "removePath":Ljava/lang/String;
v9 = } // :cond_5
/* new-array v6, v9, [Ljava/lang/String; */
/* .line 1039 */
/* .local v6, "pathsArray":[Ljava/lang/String; */
/* array-length v9, v6 */
/* new-array v0, v9, [Ljava/lang/String; */
/* .line 1040 */
/* .local v0, "hashArray":[Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* .line 1041 */
/* .local v2, "i":I */
v9 = } // :goto_5
if ( v9 != null) { // if-eqz v9, :cond_7
/* check-cast v5, Ljava/lang/String; */
/* .line 1042 */
/* .local v5, "path":Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_6
v9 = this.serverManifest;
v9 = this.objects;
/* check-cast v9, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
v1 = this.hash;
/* .line 1044 */
/* .local v1, "hashValue":Ljava/lang/String; */
} // :goto_6
/* aput-object v5, v6, v2 */
/* .line 1045 */
/* aput-object v1, v0, v2 */
/* .line 1046 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 1048 */
v9 = this.clientManifest;
/* .line 1042 */
} // .end local v1 # "hashValue":Ljava/lang/String;
} // :cond_6
final String v1 = "INVALID"; // const-string v1, "INVALID"
/* .line 1050 */
} // .end local v5 # "path":Ljava/lang/String;
} // :cond_7
com.openfeint.internal.db.DB .setClientManifestBatch ( v6,v0 );
/* goto/16 :goto_1 */
} // .end method
private void finishLoading ( ) {
/* .locals 1 */
/* .prologue */
/* .line 827 */
v0 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->close()V
/* .line 828 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
/* .line 829 */
return;
} // .end method
private void finishWithoutLoading ( ) {
/* .locals 4 */
/* .prologue */
/* .line 813 */
final String v2 = "WebViewCache"; // const-string v2, "WebViewCache"
final String v3 = "finishWithoutLoading"; // const-string v3, "finishWithoutLoading"
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 816 */
v2 = this.trackedPaths;
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
/* .line 817 */
/* .local v1, "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
v2 = this.callback;
v3 = this.path;
(( com.openfeint.internal.ui.WebViewCacheCallback ) v2 ).pathLoaded ( v3 ); // invoke-virtual {v2, v3}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->pathLoaded(Ljava/lang/String;)V
/* .line 819 */
} // .end local v1 # "pathAndCb":Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;
} // :cond_0
v2 = this.trackedPaths;
/* .line 820 */
v2 = this.prioritizedPaths;
/* .line 821 */
v2 = this.serverManifest;
v2 = this.globals;
/* .line 822 */
v2 = this.pathsToLoad;
/* .line 823 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->finishLoading()V */
/* .line 824 */
return;
} // .end method
private static java.lang.String fullOuterJoin ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 9 */
/* .param p0, "fields" # Ljava/lang/String; */
/* .param p1, "table1" # Ljava/lang/String; */
/* .param p2, "table2" # Ljava/lang/String; */
/* .param p3, "condition" # Ljava/lang/String; */
/* .prologue */
int v8 = 4; // const/4 v8, 0x4
int v7 = 3; // const/4 v7, 0x3
int v6 = 2; // const/4 v6, 0x2
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 1148 */
final String v2 = "SELECT %s from %s LEFT OUTER JOIN %s ON %s"; // const-string v2, "SELECT %s from %s LEFT OUTER JOIN %s ON %s"
/* new-array v3, v8, [Ljava/lang/Object; */
/* aput-object p0, v3, v4 */
/* aput-object p1, v3, v5 */
/* aput-object p2, v3, v6 */
/* aput-object p3, v3, v7 */
java.lang.String .format ( v2,v3 );
/* .line 1149 */
/* .local v0, "join1":Ljava/lang/String; */
final String v2 = "SELECT %s from %s LEFT OUTER JOIN %s ON %s"; // const-string v2, "SELECT %s from %s LEFT OUTER JOIN %s ON %s"
/* new-array v3, v8, [Ljava/lang/Object; */
/* aput-object p0, v3, v4 */
/* aput-object p2, v3, v5 */
/* aput-object p1, v3, v6 */
/* aput-object p3, v3, v7 */
java.lang.String .format ( v2,v3 );
/* .line 1150 */
/* .local v1, "join2":Ljava/lang/String; */
final String v2 = "%s UNION %s;"; // const-string v2, "%s UNION %s;"
/* new-array v3, v6, [Ljava/lang/Object; */
/* aput-object v0, v3, v4 */
/* aput-object v1, v3, v5 */
java.lang.String .format ( v2,v3 );
} // .end method
private void gatherDefaultItems ( java.lang.String p0, java.util.Set p1 ) {
/* .locals 10 */
/* .param p1, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 545 */
/* .local p2, "items":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
try { // :try_start_0
v8 = this.appContext;
(( android.content.Context ) v8 ).getAssets ( ); // invoke-virtual {v8}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v8 ).list ( p1 ); // invoke-virtual {v8, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
/* .line 546 */
/* .local v7, "stuff":[Ljava/lang/String; */
/* move-object v0, v7 */
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v5, v0 */
/* .local v5, "len$":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i$":I */
} // :goto_0
/* if-ge v4, v5, :cond_0 */
/* aget-object v6, v0, v4 */
/* .line 547 */
/* .local v6, "s":Ljava/lang/String; */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v8 ).append ( p1 ); // invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = "/"; // const-string v9, "/"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 549 */
/* .local v3, "fullpath":Ljava/lang/String; */
try { // :try_start_1
v8 = this.appContext;
(( android.content.Context ) v8 ).getAssets ( ); // invoke-virtual {v8}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v8 ).open ( v3 ); // invoke-virtual {v8, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 550 */
/* .local v1, "check":Ljava/io/InputStream; */
/* .line 551 */
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 546 */
} // .end local v1 # "check":Ljava/io/InputStream;
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 553 */
/* :catch_0 */
/* move-exception v2 */
/* .line 555 */
/* .local v2, "e":Ljava/io/IOException; */
try { // :try_start_2
/* invoke-direct {p0, v3, p2}, Lcom/openfeint/internal/ui/WebViewCache;->gatherDefaultItems(Ljava/lang/String;Ljava/util/Set;)V */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 558 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v2 # "e":Ljava/io/IOException;
} // .end local v3 # "fullpath":Ljava/lang/String;
} // .end local v4 # "i$":I
} // .end local v5 # "len$":I
} // .end local v6 # "s":Ljava/lang/String;
} // .end local v7 # "stuff":[Ljava/lang/String;
/* :catch_1 */
/* move-exception v2 */
/* .line 559 */
/* .restart local v2 # "e":Ljava/io/IOException; */
final String v8 = "WebViewCache"; // const-string v8, "WebViewCache"
(( java.io.IOException ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v8,v9 );
/* .line 562 */
} // .end local v2 # "e":Ljava/io/IOException;
} // :cond_0
return;
} // .end method
private java.util.Map getDefaultClientManifest ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 729 */
int v5 = 0; // const/4 v5, 0x0
/* .line 730 */
/* .local v5, "result":Landroid/database/Cursor; */
int v0 = 0; // const/4 v0, 0x0
/* .line 732 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
try { // :try_start_0
v6 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v6 ).getReadableDatabase ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 733 */
final String v6 = "SELECT * FROM manifest"; // const-string v6, "SELECT * FROM manifest"
int v7 = 0; // const/4 v7, 0x0
(( android.database.sqlite.SQLiteDatabase ) v0 ).rawQuery ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
v6 = /* .line 734 */
/* if-lez v6, :cond_1 */
/* .line 736 */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 737 */
/* .local v3, "outManifest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* .line 739 */
} // :cond_0
int v6 = 0; // const/4 v6, 0x0
/* .line 740 */
/* .local v4, "path":Ljava/lang/String; */
int v6 = 1; // const/4 v6, 0x1
/* .line 741 */
/* .local v2, "hash":Ljava/lang/String; */
v6 = /* .line 742 */
/* if-nez v6, :cond_0 */
/* .line 743 */
/* .line 744 */
final String v6 = "WebViewCache"; // const-string v6, "WebViewCache"
final String v7 = "create client Manifest from db"; // const-string v7, "create client Manifest from db"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 753 */
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_4 */
/* .line 756 */
} // .end local v2 # "hash":Ljava/lang/String;
} // .end local v3 # "outManifest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v4 # "path":Ljava/lang/String;
} // :goto_0
/* .line 753 */
} // :cond_1
try { // :try_start_2
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_5 */
/* .line 756 */
} // :goto_1
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->getDefaultClientManifestFromAsset()Ljava/util/Map; */
/* .line 747 */
/* :catch_0 */
/* move-exception v1 */
/* .line 748 */
/* .local v1, "e":Landroid/database/sqlite/SQLiteDiskIOException; */
try { // :try_start_3
com.openfeint.internal.ui.WebViewCache .diskError ( );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 753 */
try { // :try_start_4
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* :catch_1 */
/* move-exception v6 */
/* .line 749 */
} // .end local v1 # "e":Landroid/database/sqlite/SQLiteDiskIOException;
/* :catch_2 */
/* move-exception v1 */
/* .line 751 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_5
final String v6 = "WebViewCache"; // const-string v6, "WebViewCache"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "SQLite exception."; // const-string v8, "SQLite exception."
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 753 */
try { // :try_start_6
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_3 */
/* :catch_3 */
/* move-exception v6 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v6 */
try { // :try_start_7
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_6 */
} // :goto_2
/* throw v6 */
/* .restart local v2 # "hash":Ljava/lang/String; */
/* .restart local v3 # "outManifest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* .restart local v4 # "path":Ljava/lang/String; */
/* :catch_4 */
/* move-exception v6 */
} // .end local v2 # "hash":Ljava/lang/String;
} // .end local v3 # "outManifest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v4 # "path":Ljava/lang/String;
/* :catch_5 */
/* move-exception v6 */
/* :catch_6 */
/* move-exception v7 */
} // .end method
private java.util.Map getDefaultClientManifestFromAsset ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 762 */
/* new-instance v3, Ljava/io/File; */
v7 = com.openfeint.internal.ui.WebViewCache.rootPath;
final String v8 = "manifest.plist"; // const-string v8, "manifest.plist"
/* invoke-direct {v3, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 763 */
/* .local v3, "manifestFile":Ljava/io/File; */
v7 = (( java.io.File ) v3 ).isFile ( ); // invoke-virtual {v3}, Ljava/io/File;->isFile()Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 765 */
try { // :try_start_0
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 766 */
/* .local v5, "spf":Ljavax/xml/parsers/SAXParserFactory; */
(( javax.xml.parsers.SAXParserFactory ) v5 ).newSAXParser ( ); // invoke-virtual {v5}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 767 */
/* .local v4, "sp":Ljavax/xml/parsers/SAXParser; */
(( javax.xml.parsers.SAXParser ) v4 ).getXMLReader ( ); // invoke-virtual {v4}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
/* .line 768 */
/* .local v6, "xr":Lorg/xml/sax/XMLReader; */
/* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$SaxHandler; */
int v7 = 0; // const/4 v7, 0x0
/* invoke-direct {v1, p0, v7}, Lcom/openfeint/internal/ui/WebViewCache$SaxHandler;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Lcom/openfeint/internal/ui/WebViewCache$1;)V */
/* .line 769 */
/* .local v1, "handler":Lcom/openfeint/internal/ui/WebViewCache$SaxHandler; */
/* .line 770 */
/* new-instance v2, Ljava/io/FileInputStream; */
(( java.io.File ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
/* invoke-direct {v2, v7}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* .line 771 */
/* .local v2, "inputStream":Ljava/io/InputStream; */
/* new-instance v7, Lorg/xml/sax/InputSource; */
/* invoke-direct {v7, v2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* .line 772 */
(( com.openfeint.internal.ui.WebViewCache$SaxHandler ) v1 ).getOutputMap ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/WebViewCache$SaxHandler;->getOutputMap()Ljava/util/Map;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 778 */
} // .end local v1 # "handler":Lcom/openfeint/internal/ui/WebViewCache$SaxHandler;
} // .end local v2 # "inputStream":Ljava/io/InputStream;
} // .end local v4 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v5 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v6 # "xr":Lorg/xml/sax/XMLReader;
} // :goto_0
/* .line 774 */
/* :catch_0 */
/* move-exception v0 */
/* .line 775 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v7 = "WebViewCache"; // const-string v7, "WebViewCache"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v7,v8 );
/* .line 778 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
/* new-instance v7, Ljava/util/HashMap; */
/* invoke-direct {v7}, Ljava/util/HashMap;-><init>()V */
} // .end method
public static final java.lang.String getItemUri ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "itemPath" # Ljava/lang/String; */
/* .prologue */
/* .line 156 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = com.openfeint.internal.ui.WebViewCache.rootUri;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private static final java.lang.String getManifestPath ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 790 */
final String v0 = "android"; // const-string v0, "android"
/* .line 791 */
/* .local v0, "platform":Ljava/lang/String; */
v2 = com.openfeint.internal.ui.WebViewCache.manifestProductOverride;
if ( v2 != null) { // if-eqz v2, :cond_0
v1 = com.openfeint.internal.ui.WebViewCache.manifestProductOverride;
/* .line 792 */
/* .local v1, "product":Ljava/lang/String; */
} // :goto_0
final String v2 = "/webui/manifest/%s.%s.%s"; // const-string v2, "/webui/manifest/%s.%s.%s"
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "android"; // const-string v5, "android"
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object v1, v3, v4 */
int v4 = 2; // const/4 v4, 0x2
com.openfeint.internal.Util .getDpiName ( p0 );
/* aput-object v5, v3, v4 */
java.lang.String .format ( v2,v3 );
/* .line 791 */
} // .end local v1 # "product":Ljava/lang/String;
} // :cond_0
final String v1 = "embed"; // const-string v1, "embed"
} // .end method
private static final java.net.URI getServerURI ( ) {
/* .locals 3 */
/* .prologue */
/* .line 782 */
try { // :try_start_0
v1 = com.openfeint.internal.ui.WebViewCache.serverOverride;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.openfeint.internal.ui.WebViewCache.serverOverride;
/* .line 785 */
/* .local v0, "e":Ljava/lang/Exception; */
} // :goto_0
/* .line 783 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
/* new-instance v1, Ljava/net/URI; */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v2 ).getServerUrl ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getServerUrl()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 784 */
/* :catch_0 */
/* move-exception v0 */
/* .line 785 */
/* .restart local v0 # "e":Ljava/lang/Exception; */
int v1 = 0; // const/4 v1, 0x0
} // .end method
private void handleBatchBody ( Integer p0, Object[] p1, java.lang.String p2, java.lang.String p3, Integer p4, java.util.Set p5 ) {
/* .locals 8 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .param p3, "originalUrl" # Ljava/lang/String; */
/* .param p4, "currentUrl" # Ljava/lang/String; */
/* .param p5, "retriesLeft" # I */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I[B", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "I", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .local p6, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
int v2 = 2; // const/4 v2, 0x2
int v1 = 0; // const/4 v1, 0x0
/* .line 871 */
/* const/16 v0, 0xc8 */
/* if-gt v0, p1, :cond_0 */
/* const/16 v0, 0x12c */
/* if-ge p1, v0, :cond_0 */
/* .line 872 */
/* invoke-direct {p0, p6, p2}, Lcom/openfeint/internal/ui/WebViewCache;->processBatch(Ljava/util/Set;[B)V */
/* .line 899 */
} // :goto_0
return;
/* .line 873 */
} // :cond_0
/* const/16 v0, 0x12e */
/* if-eq v0, p1, :cond_1 */
/* const/16 v0, 0x12f */
/* if-ne v0, p1, :cond_2 */
/* .line 875 */
} // :cond_1
/* invoke-direct {p0, p3, p4, p5, p6}, Lcom/openfeint/internal/ui/WebViewCache;->batchFetch(Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
/* .line 876 */
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* const/16 v0, 0x190 */
/* if-gt v0, p1, :cond_5 */
/* const/16 v0, 0x1f4 */
/* if-ge p1, v0, :cond_5 */
/* .line 877 */
} // :cond_3
/* if-lez p5, :cond_4 */
/* .line 879 */
v7 = this.mDelayHandler;
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache$6; */
/* move-object v1, p0 */
/* move-object v2, p3 */
/* move-object v3, p4 */
/* move-object v4, p6 */
/* move v5, p5 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/ui/WebViewCache$6;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;I)V */
/* const-wide/16 v1, 0x1388 */
(( android.os.Handler ) v7 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {v7, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 891 */
} // :cond_4
v0 = this.mHandler;
android.os.Message .obtain ( v0,v2,v1,v1,p6 );
/* .line 892 */
/* .local v6, "msg":Landroid/os/Message; */
(( android.os.Message ) v6 ).sendToTarget ( ); // invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V
/* .line 896 */
} // .end local v6 # "msg":Landroid/os/Message;
} // :cond_5
v0 = this.mHandler;
android.os.Message .obtain ( v0,v2,v1,v1,p6 );
/* .line 897 */
/* .restart local v6 # "msg":Landroid/os/Message; */
(( android.os.Message ) v6 ).sendToTarget ( ); // invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V
} // .end method
public static com.openfeint.internal.ui.WebViewCache initialize ( android.content.Context p0 ) {
/* .locals 1 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 57 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 59 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* invoke-direct {v0}, Lcom/openfeint/internal/ui/WebViewCache;->finishWithoutLoading()V */
/* .line 61 */
} // :cond_0
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache; */
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/ui/WebViewCache;-><init>(Landroid/content/Context;)V */
/* .line 62 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
} // .end method
public static Boolean isDiskError ( ) {
/* .locals 1 */
/* .prologue */
/* .line 702 */
/* sget-boolean v0, Lcom/openfeint/internal/ui/WebViewCache;->diskError:Z */
} // .end method
public static Boolean isLoaded ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 74 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
v0 = /* invoke-direct {v0, p0}, Lcom/openfeint/internal/ui/WebViewCache;->isLoadedInner(Ljava/lang/String;)Z */
} // .end method
private Boolean isLoadedInner ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 389 */
v0 = this.serverManifest;
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
/* .line 391 */
} // :goto_0
/* .line 390 */
} // :cond_0
v0 = v0 = this.pathsToLoad;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 391 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
private void loadNextItem ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
/* .line 934 */
final String v2 = "WebViewCache"; // const-string v2, "WebViewCache"
final String v3 = "loadNextItem"; // const-string v3, "loadNextItem"
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 935 */
v2 = this.serverManifest;
v2 = this.globals;
v3 = this.pathsToLoad;
/* .line 937 */
/* iget-boolean v2, p0, Lcom/openfeint/internal/ui/WebViewCache;->globalsFinished:Z */
/* if-nez v2, :cond_0 */
v2 = this.serverManifest;
v2 = v2 = this.globals;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 938 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->finishGlobals()V */
/* .line 941 */
} // :cond_0
v2 = this.prioritizedPaths;
v3 = this.pathsToLoad;
/* .line 943 */
v2 = this.serverManifest;
v2 = v2 = this.globals;
v3 = v3 = this.prioritizedPaths;
/* add-int v1, v2, v3 */
/* .line 945 */
/* .local v1, "numGlobalsAndPrioritized":I */
/* iget-boolean v2, p0, Lcom/openfeint/internal/ui/WebViewCache;->batchesAreBroken:Z */
/* if-nez v2, :cond_1 */
/* if-le v1, v4, :cond_1 */
/* .line 946 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 947 */
/* .local v0, "combinedGlobalsAndPrio":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v2 = this.serverManifest;
v2 = this.globals;
/* .line 948 */
v2 = this.prioritizedPaths;
/* .line 949 */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/ui/WebViewCache;->batchRequest(Ljava/util/Set;)V */
/* .line 966 */
} // .end local v0 # "combinedGlobalsAndPrio":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
} // :goto_0
return;
/* .line 951 */
} // :cond_1
v2 = this.serverManifest;
v2 = v2 = this.globals;
/* if-lez v2, :cond_2 */
/* .line 952 */
v2 = this.serverManifest;
v2 = this.globals;
/* check-cast v2, Ljava/lang/String; */
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/ui/WebViewCache;->singleRequest(Ljava/lang/String;)V */
/* .line 954 */
} // :cond_2
v2 = v2 = this.prioritizedPaths;
/* if-lez v2, :cond_3 */
/* .line 955 */
v2 = this.prioritizedPaths;
/* check-cast v2, Ljava/lang/String; */
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/ui/WebViewCache;->singleRequest(Ljava/lang/String;)V */
/* .line 957 */
} // :cond_3
/* iget-boolean v2, p0, Lcom/openfeint/internal/ui/WebViewCache;->batchesAreBroken:Z */
/* if-nez v2, :cond_4 */
v2 = v2 = this.pathsToLoad;
/* if-le v2, v4, :cond_4 */
/* .line 958 */
v2 = this.pathsToLoad;
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/ui/WebViewCache;->batchRequest(Ljava/util/Set;)V */
/* .line 960 */
} // :cond_4
v2 = v2 = this.pathsToLoad;
/* if-lez v2, :cond_5 */
/* .line 961 */
v2 = this.pathsToLoad;
/* check-cast v2, Ljava/lang/String; */
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/ui/WebViewCache;->singleRequest(Ljava/lang/String;)V */
/* .line 964 */
} // :cond_5
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->finishLoading()V */
} // .end method
public static void prioritize ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 66 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/ui/WebViewCache;->prioritizeInner(Ljava/lang/String;)V */
/* .line 67 */
return;
} // .end method
private void prioritizeInner ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 1057 */
/* iget-boolean v2, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 1072 */
} // :cond_0
} // :goto_0
return;
/* .line 1058 */
} // :cond_1
v2 = this.prioritizedPaths;
/* .line 1059 */
v2 = this.serverManifest;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 1061 */
v2 = this.serverManifest;
v2 = this.objects;
/* check-cast v0, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 1062 */
/* .local v0, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1063 */
/* new-instance v1, Ljava/util/HashSet; */
v2 = this.dependentObjects;
/* invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 1066 */
/* .local v1, "loadingDependents":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v2 = this.pathsToLoad;
/* .line 1067 */
v2 = this.prioritizedPaths;
/* .line 1068 */
final String v2 = "WebViewCache"; // const-string v2, "WebViewCache"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Prioritizing "; // const-string v4, "Prioritizing "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " deps:"; // const-string v4, " deps:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
} // .end method
private void processBatch ( java.util.Set p0, Object[] p1 ) {
/* .locals 10 */
/* .param p2, "body" # [B */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;[B)V" */
/* } */
} // .end annotation
/* .prologue */
/* .local p1, "paths":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
int v9 = 2; // const/4 v9, 0x2
int v8 = 0; // const/4 v8, 0x0
/* .line 1078 */
/* new-instance v1, Ljava/util/HashSet; */
/* invoke-direct {v1}, Ljava/util/HashSet;-><init>()V */
/* .line 1079 */
/* .local v1, "fetchedPaths":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;" */
/* new-instance v5, Ljava/util/zip/ZipInputStream; */
/* new-instance v6, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v6, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v5, v6}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 1081 */
/* .local v5, "zis":Ljava/util/zip/ZipInputStream; */
int v4 = 0; // const/4 v4, 0x0
/* .line 1082 */
/* .local v4, "ze":Ljava/util/zip/ZipEntry; */
} // :cond_0
} // :goto_0
try { // :try_start_0
(( java.util.zip.ZipInputStream ) v5 ).getNextEntry ( ); // invoke-virtual {v5}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 1083 */
v6 = (( java.util.zip.ZipEntry ) v4 ).isDirectory ( ); // invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->isDirectory()Z
/* if-nez v6, :cond_0 */
/* .line 1084 */
(( java.util.zip.ZipEntry ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
/* .line 1085 */
/* .local v2, "finalPath":Ljava/lang/String; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
v7 = com.openfeint.internal.ui.WebViewCache.rootPath;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.Util .saveStreamAndLeaveInputOpen ( v5,v6 );
/* .line 1086 */
(( java.util.HashSet ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1089 */
} // .end local v2 # "finalPath":Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 1091 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v6 = "WebViewCache"; // const-string v6, "WebViewCache"
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 1094 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_1
v6 = (( java.util.HashSet ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z
/* if-nez v6, :cond_2 */
/* .line 1095 */
v6 = this.mHandler;
int v7 = 1; // const/4 v7, 0x1
android.os.Message .obtain ( v6,v9,v7,v8,v1 );
/* .line 1096 */
/* .local v3, "msg":Landroid/os/Message; */
(( android.os.Message ) v3 ).sendToTarget ( ); // invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
/* .line 1101 */
} // :goto_1
return;
/* .line 1098 */
} // .end local v3 # "msg":Landroid/os/Message;
} // :cond_2
v6 = this.mHandler;
android.os.Message .obtain ( v6,v9,v8,v8,p1 );
/* .line 1099 */
/* .restart local v3 # "msg":Landroid/os/Message; */
(( android.os.Message ) v3 ).sendToTarget ( ); // invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
} // .end method
public static Boolean recover ( ) {
/* .locals 1 */
/* .prologue */
/* .line 706 */
/* sget-boolean v0, Lcom/openfeint/internal/ui/WebViewCache;->diskError:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 707 */
} // :goto_0
} // :cond_0
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
v0 = (( com.openfeint.internal.ui.WebViewCache ) v0 ).recoverInternal ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache;->recoverInternal()Z
} // .end method
private final void singleRequest ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "finalPath" # Ljava/lang/String; */
/* .prologue */
/* .line 969 */
final String v0 = "WebViewCache"; // const-string v0, "WebViewCache"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Syncing item: "; // const-string v2, "Syncing item: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 971 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache$7; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/WebViewCache$7;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/lang/String;)V */
(( com.openfeint.internal.ui.WebViewCache$7 ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache$7;->launch()V
/* .line 994 */
return;
} // .end method
public static void start ( ) {
/* .locals 1 */
/* .prologue */
/* .line 160 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* invoke-direct {v0}, Lcom/openfeint/internal/ui/WebViewCache;->updateExternalStorageState()V */
/* .line 161 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* invoke-direct {v0}, Lcom/openfeint/internal/ui/WebViewCache;->sync()V */
/* .line 162 */
return;
} // .end method
private java.util.Set stripUnused ( java.util.Set p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 581 */
/* .local p1, "table":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v5 = this.appContext;
com.openfeint.internal.Util .getDpiName ( v5 );
/* .line 582 */
/* .local v0, "currentDpi":Ljava/lang/String; */
final String v5 = "mdpi"; // const-string v5, "mdpi"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
final String v4 = ".hdpi."; // const-string v4, ".hdpi."
/* .line 583 */
/* .local v4, "test":Ljava/lang/String; */
} // :goto_0
/* new-instance v3, Ljava/util/HashSet; */
/* invoke-direct {v3}, Ljava/util/HashSet;-><init>()V */
/* .line 584 */
/* .local v3, "reducedSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v5 = } // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .line 585 */
/* .local v2, "path":Ljava/lang/String; */
v5 = (( java.lang.String ) v2 ).contains ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v5, :cond_0 */
/* .line 582 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v2 # "path":Ljava/lang/String;
} // .end local v3 # "reducedSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
} // .end local v4 # "test":Ljava/lang/String;
} // :cond_1
final String v4 = ".mdpi."; // const-string v4, ".mdpi."
/* .line 587 */
/* .restart local v1 # "i$":Ljava/util/Iterator; */
/* .restart local v3 # "reducedSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .restart local v4 # "test":Ljava/lang/String; */
} // :cond_2
} // .end method
private void sync ( ) {
/* .locals 3 */
/* .prologue */
/* .line 453 */
final String v1 = "WebViewCache"; // const-string v1, "WebViewCache"
final String v2 = "--- WebViewCache Sync ---"; // const-string v2, "--- WebViewCache Sync ---"
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 455 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest; */
final String v1 = "manifest"; // const-string v1, "manifest"
/* invoke-direct {v0, p0, v1}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/lang/String;)V */
/* .line 456 */
/* .local v0, "req":Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest; */
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->launch()V
/* .line 457 */
return;
} // .end method
public static com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem testOnlyManifestItems ( ) {
/* .locals 12 */
/* .prologue */
int v11 = 0; // const/4 v11, 0x0
/* .line 1154 */
v7 = com.openfeint.internal.db.DB.storeHelper;
(( com.openfeint.internal.db.DB$DataStorageHelperX ) v7 ).getReadableDatabase ( ); // invoke-virtual {v7}, Lcom/openfeint/internal/db/DB$DataStorageHelperX;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
/* .line 1156 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
int v4 = 0; // const/4 v4, 0x0
/* .line 1158 */
/* .local v4, "result":Landroid/database/Cursor; */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 1160 */
/* .local v2, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;>;" */
try { // :try_start_0
final String v7 = "server_manifest.path, server_manifest.hash, manifest.hash"; // const-string v7, "server_manifest.path, server_manifest.hash, manifest.hash"
final String v8 = "server_manifest"; // const-string v8, "server_manifest"
final String v9 = "manifest"; // const-string v9, "manifest"
final String v10 = "server_manifest.path = manifest.path"; // const-string v10, "server_manifest.path = manifest.path"
com.openfeint.internal.ui.WebViewCache .fullOuterJoin ( v7,v8,v9,v10 );
int v8 = 0; // const/4 v8, 0x0
(( android.database.sqlite.SQLiteDatabase ) v1 ).rawQuery ( v7, v8 ); // invoke-virtual {v1, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
v7 = /* .line 1163 */
/* if-lez v7, :cond_2 */
/* .line 1164 */
/* .line 1166 */
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
/* .line 1167 */
/* .local v3, "path":Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 1168 */
int v7 = 1; // const/4 v7, 0x1
/* .line 1169 */
/* .local v6, "serverHash":Ljava/lang/String; */
int v7 = 2; // const/4 v7, 0x2
/* .line 1170 */
/* .local v0, "clientHash":Ljava/lang/String; */
/* new-instance v7, Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
/* invoke-direct {v7, v3, v0, v6}, Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v2 ).add ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 1172 */
} // .end local v0 # "clientHash":Ljava/lang/String;
} // .end local v6 # "serverHash":Ljava/lang/String;
} // :cond_1
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
v7 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v7, :cond_0 */
/* .line 1176 */
} // .end local v3 # "path":Ljava/lang/String;
} // :cond_2
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 1180 */
} // :goto_0
/* new-array v7, v11, [Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
(( java.util.ArrayList ) v2 ).toArray ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v5, [Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
/* .line 1181 */
/* .local v5, "rv":[Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
/* new-instance v7, Lcom/openfeint/internal/ui/WebViewCache$8; */
/* invoke-direct {v7}, Lcom/openfeint/internal/ui/WebViewCache$8;-><init>()V */
java.util.Arrays .sort ( v5,v7 );
/* .line 1187 */
/* .line 1174 */
} // .end local v5 # "rv":[Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;
/* :catch_0 */
/* move-exception v7 */
/* .line 1176 */
try { // :try_start_2
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception v7 */
/* :catchall_0 */
/* move-exception v7 */
try { // :try_start_3
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
} // :goto_1
/* throw v7 */
/* :catch_2 */
/* move-exception v7 */
/* :catch_3 */
/* move-exception v8 */
} // .end method
public static Boolean trackPath ( java.lang.String p0, com.openfeint.internal.ui.WebViewCacheCallback p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "cb" # Lcom/openfeint/internal/ui/WebViewCacheCallback; */
/* .prologue */
/* .line 70 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
v0 = /* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/WebViewCache;->trackPathInner(Ljava/lang/String;Lcom/openfeint/internal/ui/WebViewCacheCallback;)Z */
} // .end method
private Boolean trackPathInner ( java.lang.String p0, com.openfeint.internal.ui.WebViewCacheCallback p1 ) {
/* .locals 5 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "cb" # Lcom/openfeint/internal/ui/WebViewCacheCallback; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 360 */
/* iget-boolean v4, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 361 */
(( com.openfeint.internal.ui.WebViewCacheCallback ) p2 ).pathLoaded ( p1 ); // invoke-virtual {p2, p1}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->pathLoaded(Ljava/lang/String;)V
/* .line 382 */
} // :goto_0
/* .line 364 */
} // :cond_0
v4 = this.serverManifest;
/* if-nez v4, :cond_1 */
/* .line 365 */
(( com.openfeint.internal.ui.WebViewCacheCallback ) p2 ).onTrackingNeeded ( ); // invoke-virtual {p2}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->onTrackingNeeded()V
/* .line 366 */
v2 = this.trackedPaths;
/* new-instance v4, Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback; */
/* invoke-direct {v4, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache$PathAndCallback;-><init>(Ljava/lang/String;Lcom/openfeint/internal/ui/WebViewCacheCallback;)V */
/* move v2, v3 */
/* .line 367 */
/* .line 370 */
} // :cond_1
v4 = this.serverManifest;
v4 = this.objects;
/* check-cast v0, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 371 */
/* .local v0, "loadedItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 373 */
(( com.openfeint.internal.ui.WebViewCacheCallback ) p2 ).onTrackingNeeded ( ); // invoke-virtual {p2}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->onTrackingNeeded()V
/* .line 374 */
/* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* invoke-direct {v1, v0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;-><init>(Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;)V */
/* .line 375 */
/* .local v1, "newItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
v2 = this.dependentObjects;
v4 = this.pathsToLoad;
/* .line 376 */
v2 = this.trackedItems;
/* new-instance v4, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback; */
/* invoke-direct {v4, v1, p2}, Lcom/openfeint/internal/ui/WebViewCache$ItemAndCallback;-><init>(Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;Lcom/openfeint/internal/ui/WebViewCacheCallback;)V */
/* move v2, v3 */
/* .line 377 */
/* .line 381 */
} // .end local v1 # "newItem":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // :cond_2
(( com.openfeint.internal.ui.WebViewCacheCallback ) p2 ).pathLoaded ( p1 ); // invoke-virtual {p2, p1}, Lcom/openfeint/internal/ui/WebViewCacheCallback;->pathLoaded(Ljava/lang/String;)V
} // .end method
private void triggerUpdates ( ) {
/* .locals 5 */
/* .prologue */
/* .line 797 */
final String v2 = "WebViewCache"; // const-string v2, "WebViewCache"
final String v3 = "loadedManifest"; // const-string v3, "loadedManifest"
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 800 */
v2 = this.serverManifest;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.clientManifest;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 802 */
v2 = this.serverManifest;
v2 = this.objects;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .line 803 */
/* .local v1, "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
v2 = this.hash;
v3 = this.clientManifest;
v4 = this.path;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
/* .line 804 */
v2 = this.pathsToLoad;
v3 = this.path;
/* .line 808 */
} // .end local v1 # "item":Lcom/openfeint/internal/ui/WebViewCache$ManifestItem;
} // :cond_1
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->loadNextItem()V */
/* .line 810 */
} // .end local v0 # "i$":Ljava/util/Iterator;
} // :cond_2
return;
} // .end method
private void updateExternalStorageState ( ) {
/* .locals 5 */
/* .prologue */
/* .line 433 */
v3 = com.openfeint.internal.Util .noSdcardPermission ( );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 434 */
final String v3 = "WebViewCache"; // const-string v3, "WebViewCache"
final String v4 = "no sdcard permission"; // const-string v4, "no sdcard permission"
com.openfeint.internal.OpenFeintInternal .log ( v3,v4 );
/* .line 436 */
(( com.openfeint.internal.ui.WebViewCache ) p0 ).setRootUriInternal ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache;->setRootUriInternal()V
/* .line 449 */
} // :goto_0
return;
/* .line 440 */
} // :cond_0
android.os.Environment .getExternalStorageState ( );
/* .line 441 */
/* .local v2, "state":Ljava/lang/String; */
final String v3 = "mounted"; // const-string v3, "mounted"
v3 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 442 */
android.os.Environment .getExternalStorageDirectory ( );
/* .line 443 */
/* .local v1, "sdcard":Ljava/io/File; */
/* new-instance v0, Ljava/io/File; */
final String v3 = "openfeint"; // const-string v3, "openfeint"
/* invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 444 */
/* .local v0, "feintRoot":Ljava/io/File; */
(( com.openfeint.internal.ui.WebViewCache ) p0 ).setRootUriSdcard ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/WebViewCache;->setRootUriSdcard(Ljava/io/File;)V
/* .line 446 */
} // .end local v0 # "feintRoot":Ljava/io/File;
} // .end local v1 # "sdcard":Ljava/io/File;
} // :cond_1
final String v3 = "WebViewCache"; // const-string v3, "WebViewCache"
com.openfeint.internal.OpenFeintInternal .log ( v3,v2 );
/* .line 447 */
(( com.openfeint.internal.ui.WebViewCache ) p0 ).setRootUriInternal ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache;->setRootUriInternal()V
} // .end method
/* # virtual methods */
void markSyncRequired ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 711 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
/* .line 712 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebViewCache;->globalsFinished:Z */
/* .line 713 */
return;
} // .end method
Boolean recoverInternal ( ) {
/* .locals 2 */
/* .prologue */
/* .line 716 */
v1 = this.appContext;
v0 = com.openfeint.internal.db.DB .recover ( v1 );
/* .line 717 */
/* .local v0, "success":Z */
int v1 = 0; // const/4 v1, 0x0
this.serverManifest = v1;
/* .line 718 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 719 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->getDefaultClientManifestFromAsset()Ljava/util/Map; */
this.clientManifest = v1;
/* .line 720 */
v1 = v1 = this.clientManifest;
/* if-nez v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 722 */
} // :cond_0
} // :goto_0
(( com.openfeint.internal.ui.WebViewCache ) p0 ).markSyncRequired ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache;->markSyncRequired()V
/* .line 723 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->sync()V */
/* .line 724 */
/* .line 720 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void setRootUriInternal ( ) {
/* .locals 7 */
/* .prologue */
/* .line 136 */
final String v5 = "WebViewCache"; // const-string v5, "WebViewCache"
final String v6 = "can\'t use sdcard"; // const-string v6, "can\'t use sdcard"
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 137 */
v5 = this.appContext;
(( android.content.Context ) v5 ).getFilesDir ( ); // invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* .line 138 */
/* .local v0, "baseDir":Ljava/io/File; */
/* new-instance v3, Ljava/io/File; */
final String v5 = "webui"; // const-string v5, "webui"
/* invoke-direct {v3, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 139 */
/* .local v3, "rootDir":Ljava/io/File; */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.io.File ) v3 ).getAbsolutePath ( ); // invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "/"; // const-string v6, "/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 140 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "file://"; // const-string v6, "file://"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = com.openfeint.internal.ui.WebViewCache.rootPath;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 141 */
/* new-instance v2, Ljava/io/File; */
final String v5 = "webui"; // const-string v5, "webui"
/* invoke-direct {v2, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 142 */
/* .local v2, "inPhoneWebui":Ljava/io/File; */
v1 = (( java.io.File ) v2 ).isDirectory ( ); // invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
/* .line 143 */
/* .local v1, "hasInPhoneData":Z */
/* if-nez v1, :cond_0 */
/* .line 144 */
/* new-instance v4, Ljava/lang/Thread; */
/* new-instance v5, Lcom/openfeint/internal/ui/WebViewCache$2; */
/* invoke-direct {v5, p0, v0}, Lcom/openfeint/internal/ui/WebViewCache$2;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/io/File;)V */
/* invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 149 */
/* .local v4, "t":Ljava/lang/Thread; */
(( java.lang.Thread ) v4 ).start ( ); // invoke-virtual {v4}, Ljava/lang/Thread;->start()V
/* .line 153 */
} // .end local v4 # "t":Ljava/lang/Thread;
} // :goto_0
return;
/* .line 151 */
} // :cond_0
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->clientManifestReady()V */
} // .end method
public final void setRootUriSdcard ( java.io.File p0 ) {
/* .locals 9 */
/* .param p1, "path" # Ljava/io/File; */
/* .prologue */
/* .line 79 */
/* new-instance v5, Ljava/io/File; */
final String v6 = "webui"; // const-string v6, "webui"
/* invoke-direct {v5, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 80 */
/* .local v5, "webui":Ljava/io/File; */
v6 = (( java.io.File ) v5 ).exists ( ); // invoke-virtual {v5}, Ljava/io/File;->exists()Z
/* if-nez v6, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 81 */
/* .local v1, "copyDefault":Z */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 82 */
/* new-instance v3, Ljava/io/File; */
final String v6 = ".nomedia"; // const-string v6, ".nomedia"
/* invoke-direct {v3, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 84 */
/* .local v3, "noMedia":Ljava/io/File; */
try { // :try_start_0
(( java.io.File ) v3 ).createNewFile ( ); // invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 88 */
} // :goto_1
v6 = (( java.io.File ) v5 ).mkdirs ( ); // invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z
/* if-nez v6, :cond_1 */
/* .line 89 */
(( com.openfeint.internal.ui.WebViewCache ) p0 ).setRootUriInternal ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache;->setRootUriInternal()V
/* .line 133 */
} // .end local v3 # "noMedia":Ljava/io/File;
} // :goto_2
return;
/* .line 80 */
} // .end local v1 # "copyDefault":Z
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 93 */
/* .restart local v1 # "copyDefault":Z */
} // :cond_1
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.io.File ) v5 ).getAbsolutePath ( ); // invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "/"; // const-string v7, "/"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 94 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "file://"; // const-string v7, "file://"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = com.openfeint.internal.ui.WebViewCache.rootPath;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 95 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 96 */
v6 = this.appContext;
(( android.content.Context ) v6 ).getFilesDir ( ); // invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* .line 97 */
/* .local v0, "baseDir":Ljava/io/File; */
/* new-instance v2, Ljava/io/File; */
final String v6 = "webui"; // const-string v6, "webui"
/* invoke-direct {v2, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 98 */
/* .local v2, "inPhoneWebui":Ljava/io/File; */
v6 = (( java.io.File ) v2 ).isDirectory ( ); // invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 102 */
try { // :try_start_1
v6 = this.appContext;
final String v7 = "manifest.db"; // const-string v7, "manifest.db"
(( android.content.Context ) v6 ).getDatabasePath ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
/* new-instance v7, Ljava/io/File; */
final String v8 = "manifest.db"; // const-string v8, "manifest.db"
/* invoke-direct {v7, v5, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
com.openfeint.internal.Util .copyFile ( v6,v7 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 107 */
} // :cond_2
} // :goto_3
/* new-instance v4, Ljava/lang/Thread; */
/* new-instance v6, Lcom/openfeint/internal/ui/WebViewCache$1; */
/* invoke-direct {v6, p0, v2, v5, v0}, Lcom/openfeint/internal/ui/WebViewCache$1;-><init>(Lcom/openfeint/internal/ui/WebViewCache;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V */
/* invoke-direct {v4, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 126 */
/* .local v4, "t":Ljava/lang/Thread; */
(( java.lang.Thread ) v4 ).start ( ); // invoke-virtual {v4}, Ljava/lang/Thread;->start()V
/* .line 129 */
} // .end local v0 # "baseDir":Ljava/io/File;
} // .end local v2 # "inPhoneWebui":Ljava/io/File;
} // .end local v4 # "t":Ljava/lang/Thread;
} // :cond_3
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->clientManifestReady()V */
/* .line 132 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCache;->deleteAll()V */
/* .line 85 */
/* .restart local v3 # "noMedia":Ljava/io/File; */
/* :catch_0 */
/* move-exception v6 */
/* .line 104 */
} // .end local v3 # "noMedia":Ljava/io/File;
/* .restart local v0 # "baseDir":Ljava/io/File; */
/* .restart local v2 # "inPhoneWebui":Ljava/io/File; */
/* :catch_1 */
/* move-exception v6 */
} // .end method
