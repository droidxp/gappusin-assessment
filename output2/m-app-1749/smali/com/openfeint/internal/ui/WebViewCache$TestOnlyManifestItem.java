public class com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "TestOnlyManifestItem" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem$Status; */
/* } */
} // .end annotation
/* # instance fields */
public java.lang.String clientHash;
public java.lang.String path;
public java.lang.String serverHash;
/* # direct methods */
public com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem ( ) {
/* .locals 0 */
/* .param p1, "_path" # Ljava/lang/String; */
/* .param p2, "_clientHash" # Ljava/lang/String; */
/* .param p3, "_serverHash" # Ljava/lang/String; */
/* .prologue */
/* .line 1108 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 1109 */
this.path = p1;
/* .line 1110 */
this.clientHash = p2;
/* .line 1111 */
this.serverHash = p3;
/* .line 1112 */
return;
} // .end method
public static void syncAndOpenDashboard ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1136 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
/* iget-boolean v0, v0, Lcom/openfeint/internal/ui/WebViewCache;->loadingFinished:Z */
/* if-nez v0, :cond_0 */
/* .line 1137 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
int v1 = 0; // const/4 v1, 0x0
this.serverManifest = v1;
/* .line 1138 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
com.openfeint.internal.ui.WebViewCache .access$1600 ( v0 );
/* .line 1140 */
} // :cond_0
com.openfeint.api.ui.Dashboard .open ( );
/* .line 1141 */
return;
} // .end method
/* # virtual methods */
public void invalidate ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1127 */
v0 = this.path;
final String v1 = "INVALID"; // const-string v1, "INVALID"
com.openfeint.internal.db.DB .setClientManifest ( v0,v1 );
/* .line 1129 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
v0 = this.clientManifest;
v1 = this.path;
final String v2 = "INVALID"; // const-string v2, "INVALID"
/* .line 1131 */
/* new-instance v0, Ljava/io/File; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
com.openfeint.internal.ui.WebViewCache .access$1500 ( );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.path;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
com.openfeint.internal.Util .deleteFiles ( v0 );
/* .line 1133 */
v0 = com.openfeint.internal.ui.WebViewCache.sInstance;
(( com.openfeint.internal.ui.WebViewCache ) v0 ).markSyncRequired ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache;->markSyncRequired()V
/* .line 1134 */
return;
} // .end method
public com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem$Status status ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1120 */
v0 = this.clientHash;
/* if-nez v0, :cond_0 */
v0 = com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem$Status.NotYetDownloaded;
/* .line 1123 */
} // :goto_0
/* .line 1121 */
} // :cond_0
v0 = this.serverHash;
/* if-nez v0, :cond_1 */
v0 = com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem$Status.NotOnServer;
/* .line 1122 */
} // :cond_1
v0 = this.serverHash;
v1 = this.clientHash;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem$Status.UpToDate;
/* .line 1123 */
} // :cond_2
v0 = com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem$Status.OutOfDate;
} // .end method
