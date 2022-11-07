public class com.google.ads.AdActivity$StaticMethodWrapper {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/AdActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "StaticMethodWrapper" */
} // .end annotation
/* # direct methods */
public com.google.ads.AdActivity$StaticMethodWrapper ( ) {
/* .locals 0 */
/* .prologue */
/* .line 113 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean isShowing ( ) {
/* .locals 2 */
/* .prologue */
/* .line 119 */
com.google.ads.AdActivity .a ( );
/* monitor-enter v1 */
/* .line 120 */
try { // :try_start_0
	 com.google.ads.AdActivity .b ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 121 */
	 } // :goto_0
	 /* monitor-exit v1 */
	 /* .line 123 */
	 /* .line 120 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 121 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void launchAdActivity ( Object p0, Object p1 ) {
/* .locals 4 */
/* .param p1, "adManager" # Lcom/google/ads/internal/d; */
/* .param p2, "adOpener" # Lcom/google/ads/internal/e; */
/* .prologue */
/* .line 134 */
com.google.ads.AdActivity .a ( );
/* monitor-enter v1 */
/* .line 135 */
try { // :try_start_0
	 com.google.ads.AdActivity .c ( );
	 /* if-nez v0, :cond_1 */
	 /* .line 136 */
	 com.google.ads.AdActivity .b ( p1 );
	 /* .line 141 */
} // :cond_0
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 144 */
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 145 */
/* if-nez v0, :cond_2 */
/* .line 146 */
final String v0 = "activity was null while launching an AdActivity."; // const-string v0, "activity was null while launching an AdActivity."
com.google.ads.util.b .e ( v0 );
/* .line 161 */
} // :goto_0
return;
/* .line 137 */
} // :cond_1
try { // :try_start_1
com.google.ads.AdActivity .c ( );
/* if-eq v0, p1, :cond_0 */
/* .line 138 */
final String v0 = "Tried to launch a new AdActivity with a different AdManager."; // const-string v0, "Tried to launch a new AdActivity with a different AdManager."
com.google.ads.util.b .b ( v0 );
/* .line 139 */
/* monitor-exit v1 */
/* .line 141 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
/* .line 149 */
} // :cond_2
/* new-instance v1, Landroid/content/Intent; */
(( android.app.Activity ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
/* const-class v3, Lcom/google/ads/AdActivity; */
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 151 */
final String v2 = "com.google.ads.AdOpener"; // const-string v2, "com.google.ads.AdOpener"
(( com.google.ads.internal.e ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/google/ads/internal/e;->a()Landroid/os/Bundle;
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 155 */
try { // :try_start_2
final String v2 = "Launching AdActivity."; // const-string v2, "Launching AdActivity."
com.google.ads.util.b .a ( v2 );
/* .line 156 */
(( android.app.Activity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* :try_end_2 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 157 */
/* :catch_0 */
/* move-exception v0 */
/* .line 158 */
final String v1 = "Activity not found."; // const-string v1, "Activity not found."
com.google.ads.util.b .b ( v1,v0 );
} // .end method
