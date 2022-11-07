public class com.google.ads.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private final com.google.ads.internal.d a;
	 private com.google.ads.h b;
	 private java.lang.Object c;
	 private java.lang.Thread d;
	 private java.lang.Object e;
	 private Boolean f;
	 private java.lang.Object g;
	 /* # direct methods */
	 protected com.google.ads.e ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 307 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 56 */
		 this.b = v1;
		 /* .line 58 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.c = v0;
		 /* .line 64 */
		 this.d = v1;
		 /* .line 76 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.e = v0;
		 /* .line 84 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/google/ads/e;->f:Z */
		 /* .line 91 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.g = v0;
		 /* .line 308 */
		 this.a = v1;
		 /* .line 309 */
		 return;
	 } // .end method
	 public com.google.ads.e ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 100 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 56 */
		 this.b = v1;
		 /* .line 58 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.c = v0;
		 /* .line 64 */
		 this.d = v1;
		 /* .line 76 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.e = v0;
		 /* .line 84 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/google/ads/e;->f:Z */
		 /* .line 91 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.g = v0;
		 /* .line 101 */
		 com.google.ads.util.a .b ( p1 );
		 /* .line 102 */
		 this.a = p1;
		 /* .line 103 */
		 return;
	 } // .end method
	 static java.lang.Object a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 51 */
		 v0 = this.e;
	 } // .end method
	 static java.lang.Thread a ( Object p0, java.lang.Thread p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 51 */
		 this.d = p1;
	 } // .end method
	 static void a ( Object p0, Object p1, com.google.ads.AdRequest p2 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 51 */
		 /* invoke-direct {p0, p1, p2}, Lcom/google/ads/e;->b(Lcom/google/ads/c;Lcom/google/ads/AdRequest;)V */
		 return;
	 } // .end method
	 public static Boolean a ( Object p0, Object p1 ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 158 */
		 (( com.google.ads.c ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/ads/c;->j()Lcom/google/ads/internal/h;
		 /* if-nez v0, :cond_0 */
		 /* move v0, v1 */
		 /* .line 187 */
	 } // :goto_0
	 /* .line 162 */
} // :cond_0
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 163 */
	 (( com.google.ads.c ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/ads/c;->j()Lcom/google/ads/internal/h;
	 v0 = 	 (( com.google.ads.internal.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->a()Z
	 /* if-nez v0, :cond_1 */
	 /* .line 164 */
	 final String v0 = "InterstitialAd received a mediation response corresponding to a non-interstitial ad.Make sure you specify \'interstitial\' as the ad-type in the mediation UI."; // const-string v0, "InterstitialAd received a mediation response corresponding to a non-interstitial ad.Make sure you specify \'interstitial\' as the ad-type in the mediation UI."
	 com.google.ads.util.b .e ( v0 );
	 /* move v0, v2 */
	 /* .line 167 */
} // :cond_1
/* move v0, v1 */
/* .line 169 */
/* .line 171 */
} // :cond_2
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.i;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/h; */
(( com.google.ads.internal.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->b()Lcom/google/ads/AdSize;
/* .line 172 */
(( com.google.ads.c ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/ads/c;->j()Lcom/google/ads/internal/h;
v3 = (( com.google.ads.internal.h ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/google/ads/internal/h;->a()Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 173 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "AdView received a mediation response corresponding to an interstitial ad.Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView ("; // const-string v3, "AdView received a mediation response corresponding to an interstitial ad.Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView ("
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ") in the ad-type field in the mediation UI."; // const-string v1, ") in the ad-type field in the mediation UI."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* move v0, v2 */
/* .line 178 */
/* .line 180 */
} // :cond_3
(( com.google.ads.c ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/ads/c;->j()Lcom/google/ads/internal/h;
(( com.google.ads.internal.h ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/google/ads/internal/h;->b()Lcom/google/ads/AdSize;
/* .line 181 */
/* if-eq v3, v0, :cond_4 */
/* .line 182 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Mediation server returned ad size: \'"; // const-string v4, "Mediation server returned ad size: \'"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "\', while the AdView was created with ad size: \'"; // const-string v3, "\', while the AdView was created with ad size: \'"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "\'.Using the ad-size passed to the AdView on creation."; // const-string v1, "\'.Using the ad-size passed to the AdView on creation."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* move v0, v2 */
/* .line 185 */
/* goto/16 :goto_0 */
} // :cond_4
/* move v0, v1 */
/* .line 187 */
/* goto/16 :goto_0 */
} // .end method
static Boolean a ( Object p0, Object p1 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = /* invoke-direct {p0, p1}, Lcom/google/ads/e;->e(Lcom/google/ads/h;)Z */
} // .end method
private Boolean a ( Object p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 199 */
/* invoke-direct {p0}, Lcom/google/ads/e;->e()Lcom/google/ads/h; */
/* if-eq v0, p1, :cond_0 */
/* .line 200 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "GWController: ignoring callback to "; // const-string v1, "GWController: ignoring callback to "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " from non showing ambassador with adapter class: \'"; // const-string v1, " from non showing ambassador with adapter class: \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.google.ads.h ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/h;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'."; // const-string v1, "\'."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 203 */
int v0 = 0; // const/4 v0, 0x0
/* .line 205 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean a ( java.lang.String p0, android.app.Activity p1, com.google.ads.AdRequest p2, Object p3, java.util.HashMap p4, Long p5 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Landroid/app/Activity;", */
/* "Lcom/google/ads/AdRequest;", */
/* "Lcom/google/ads/f;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;J)Z" */
/* } */
} // .end annotation
/* .prologue */
/* .line 379 */
/* new-instance v0, Lcom/google/ads/h; */
v1 = this.a;
(( com.google.ads.internal.d ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v1 = this.i;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v2, Lcom/google/ads/internal/h; */
/* move-object v1, p0 */
/* move-object v3, p4 */
/* move-object v4, p1 */
/* move-object v5, p3 */
/* move-object v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/google/ads/h;-><init>(Lcom/google/ads/e;Lcom/google/ads/internal/h;Lcom/google/ads/f;Ljava/lang/String;Lcom/google/ads/AdRequest;Ljava/util/HashMap;)V */
/* .line 385 */
/* monitor-enter v0 */
/* .line 386 */
try { // :try_start_0
(( com.google.ads.h ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/google/ads/h;->a(Landroid/app/Activity;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 390 */
} // :goto_0
try { // :try_start_1
v1 = (( com.google.ads.h ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->c()Z
/* if-nez v1, :cond_0 */
/* const-wide/16 v1, 0x0 */
/* cmp-long v1, p6, v1 */
/* if-lez v1, :cond_0 */
/* .line 391 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* .line 392 */
(( java.lang.Object ) v0 ).wait ( p6, p7 ); // invoke-virtual {v0, p6, p7}, Ljava/lang/Object;->wait(J)V
/* .line 393 */
android.os.SystemClock .elapsedRealtime ( );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move-result-wide v3 */
/* sub-long v1, v3, v1 */
/* .line 394 */
/* sub-long/2addr p6, v1 */
/* .line 395 */
/* .line 396 */
/* :catch_0 */
/* move-exception v1 */
/* .line 397 */
try { // :try_start_2
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Interrupted while waiting for ad network to load ad using adapter class: "; // const-string v2, "Interrupted while waiting for ad network to load ad using adapter class: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v1 );
/* .line 400 */
} // :cond_0
v1 = (( com.google.ads.h ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( com.google.ads.h ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->d()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 404 */
v1 = this.a;
(( com.google.ads.internal.d ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v1 = (( com.google.ads.m ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/google/ads/m;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 410 */
} // :goto_1
v2 = this.a;
/* new-instance v3, Lcom/google/ads/e$8; */
/* invoke-direct {v3, p0, v0, v1, p4}, Lcom/google/ads/e$8;-><init>(Lcom/google/ads/e;Lcom/google/ads/h;Landroid/view/View;Lcom/google/ads/f;)V */
(( com.google.ads.internal.d ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* .line 426 */
int v1 = 1; // const/4 v1, 0x1
/* monitor-exit v0 */
/* move v0, v1 */
/* .line 431 */
} // :goto_2
/* .line 404 */
} // :cond_1
(( com.google.ads.h ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->e()Landroid/view/View;
/* .line 430 */
} // :cond_2
(( com.google.ads.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->b()V
/* .line 431 */
int v1 = 0; // const/4 v1, 0x0
/* monitor-exit v0 */
/* move v0, v1 */
/* .line 432 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v1 */
} // .end method
static com.google.ads.internal.d b ( Object p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = this.a;
} // .end method
private void b ( Object p0, com.google.ads.AdRequest p1 ) {
/* .locals 12 */
/* .prologue */
/* .line 321 */
v1 = this.e;
/* monitor-enter v1 */
/* .line 322 */
try { // :try_start_0
java.lang.Thread .currentThread ( );
v2 = this.d;
com.google.ads.util.a .a ( v0,v2 );
/* .line 323 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 324 */
(( com.google.ads.c ) p1 ).f ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->f()Ljava/util/List;
/* .line 325 */
v1 = (( com.google.ads.c ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = (( com.google.ads.c ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->b()I
/* int-to-long v7, v1 */
/* .line 328 */
} // :goto_0
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_5
/* move-object v2, v0 */
/* check-cast v2, Lcom/google/ads/a; */
/* .line 329 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Looking to fetch ads from network: "; // const-string v1, "Looking to fetch ads from network: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.google.ads.a ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/google/ads/a;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 330 */
(( com.google.ads.a ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/google/ads/a;->c()Ljava/util/List;
/* .line 331 */
(( com.google.ads.a ) v2 ).d ( ); // invoke-virtual {v2}, Lcom/google/ads/a;->d()Ljava/util/HashMap;
/* .line 332 */
/* new-instance v0, Lcom/google/ads/f; */
(( com.google.ads.a ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/google/ads/a;->a()Ljava/lang/String;
(( com.google.ads.a ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/google/ads/a;->b()Ljava/lang/String;
(( com.google.ads.c ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->c()Ljava/lang/String;
(( com.google.ads.c ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->g()Ljava/util/List;
(( com.google.ads.c ) p1 ).h ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->h()Ljava/util/List;
(( com.google.ads.c ) p1 ).i ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->i()Ljava/util/List;
/* invoke-direct/range {v0 ..v6}, Lcom/google/ads/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */
/* .line 339 */
v1 = } // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v2, Ljava/lang/String; */
/* .line 340 */
v1 = this.a;
(( com.google.ads.internal.d ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v1 = this.c;
(( com.google.ads.util.i$d ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v3, Landroid/app/Activity; */
/* .line 341 */
/* if-nez v3, :cond_4 */
/* .line 342 */
final String v0 = "Activity is null while mediating.Terminating mediation thread."; // const-string v0, "Activity is null while mediating.Terminating mediation thread."
com.google.ads.util.b .a ( v0 );
/* .line 369 */
} // :cond_2
} // :goto_1
return;
/* .line 323 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_1
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
/* .line 325 */
} // :cond_3
/* const-wide/16 v7, 0x2710 */
} // :cond_4
/* move-object v1, p0 */
/* move-object v4, p2 */
/* move-object v5, v0 */
/* move-object v6, v11 */
/* .line 346 */
v1 = /* invoke-direct/range {v1 ..v8}, Lcom/google/ads/e;->a(Ljava/lang/String;Landroid/app/Activity;Lcom/google/ads/AdRequest;Lcom/google/ads/f;Ljava/util/HashMap;J)Z */
/* if-nez v1, :cond_2 */
/* .line 353 */
v1 = /* invoke-direct {p0}, Lcom/google/ads/e;->d()Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 354 */
final String v0 = "GWController.destroy() called.Terminating mediation thread."; // const-string v0, "GWController.destroy() called.Terminating mediation thread."
com.google.ads.util.b .a ( v0 );
/* .line 362 */
} // :cond_5
v0 = this.a;
/* new-instance v1, Lcom/google/ads/e$7; */
/* invoke-direct {v1, p0, p1}, Lcom/google/ads/e$7;-><init>(Lcom/google/ads/e;Lcom/google/ads/c;)V */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
static com.google.ads.h c ( Object p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = this.b;
} // .end method
private Boolean d ( ) {
/* .locals 2 */
/* .prologue */
/* .line 312 */
v1 = this.g;
/* monitor-enter v1 */
/* .line 313 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/google/ads/e;->f:Z */
/* monitor-exit v1 */
/* .line 314 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private com.google.ads.h e ( ) {
/* .locals 2 */
/* .prologue */
/* .line 462 */
v1 = this.c;
/* monitor-enter v1 */
/* .line 463 */
try { // :try_start_0
v0 = this.b;
/* monitor-exit v1 */
/* .line 464 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private Boolean e ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 451 */
v1 = this.g;
/* monitor-enter v1 */
/* .line 452 */
try { // :try_start_0
v0 = /* invoke-direct {p0}, Lcom/google/ads/e;->d()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 453 */
(( com.google.ads.h ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/ads/h;->b()V
/* .line 454 */
int v0 = 1; // const/4 v0, 0x1
/* monitor-exit v1 */
/* .line 456 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* monitor-exit v1 */
/* .line 458 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
/* # virtual methods */
public void a ( Object p0, com.google.ads.AdRequest p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 126 */
v1 = this.e;
/* monitor-enter v1 */
/* .line 127 */
try { // :try_start_0
v0 = (( com.google.ads.e ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/e;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 128 */
final String v0 = "Mediation thread is not done executing previous mediation request.Ignoring new mediation request"; // const-string v0, "Mediation thread is not done executing previous mediation request.Ignoring new mediation request"
com.google.ads.util.b .c ( v0 );
/* .line 130 */
/* monitor-exit v1 */
/* .line 147 */
} // :goto_0
return;
/* .line 134 */
} // :cond_0
v0 = this.a;
com.google.ads.e .a ( p1,v0 );
/* .line 136 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v2, Lcom/google/ads/e$1; */
/* invoke-direct {v2, p0, p1, p2}, Lcom/google/ads/e$1;-><init>(Lcom/google/ads/e;Lcom/google/ads/c;Lcom/google/ads/AdRequest;)V */
/* invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.d = v0;
/* .line 145 */
v0 = this.d;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 146 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 245 */
final String v0 = "onPresentScreen"; // const-string v0, "onPresentScreen"
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/ads/e;->a(Lcom/google/ads/h;Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
/* .line 254 */
} // :goto_0
return;
/* .line 248 */
} // :cond_0
v0 = this.a;
/* new-instance v1, Lcom/google/ads/e$4; */
/* invoke-direct {v1, p0}, Lcom/google/ads/e$4;-><init>(Lcom/google/ads/e;)V */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
public void a ( Object p0, android.view.View p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 227 */
/* invoke-direct {p0}, Lcom/google/ads/e;->e()Lcom/google/ads/h; */
/* if-eq v0, p1, :cond_0 */
/* .line 228 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "GWController: ignoring onAdRefreshed() callback from non-showing ambassador (adapter class name is \'"; // const-string v1, "GWController: ignoring onAdRefreshed() callback from non-showing ambassador (adapter class name is \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.google.ads.h ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/h;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\')."; // const-string v1, "\')."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 241 */
} // :goto_0
return;
/* .line 234 */
} // :cond_0
v0 = this.b;
(( com.google.ads.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->a()Lcom/google/ads/f;
/* .line 235 */
v1 = this.a;
/* new-instance v2, Lcom/google/ads/e$3; */
/* invoke-direct {v2, p0, p2, v0}, Lcom/google/ads/e$3;-><init>(Lcom/google/ads/e;Landroid/view/View;Lcom/google/ads/f;)V */
(( com.google.ads.internal.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
public void a ( Object p0, Boolean p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 211 */
final String v0 = "onAdClicked()"; // const-string v0, "onAdClicked()"
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/ads/e;->a(Lcom/google/ads/h;Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
/* .line 222 */
} // :goto_0
return;
/* .line 214 */
} // :cond_0
(( com.google.ads.h ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/ads/h;->a()Lcom/google/ads/f;
/* .line 215 */
v1 = this.a;
/* new-instance v2, Lcom/google/ads/e$2; */
/* invoke-direct {v2, p0, v0, p2}, Lcom/google/ads/e$2;-><init>(Lcom/google/ads/e;Lcom/google/ads/f;Z)V */
(( com.google.ads.internal.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .prologue */
/* .line 106 */
v1 = this.e;
/* monitor-enter v1 */
/* .line 107 */
try { // :try_start_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit v1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 108 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void b ( ) {
/* .locals 3 */
/* .prologue */
/* .line 112 */
v1 = this.g;
/* monitor-enter v1 */
/* .line 113 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lcom/google/ads/e;->f:Z */
/* .line 115 */
int v0 = 0; // const/4 v0, 0x0
(( com.google.ads.e ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/e;->d(Lcom/google/ads/h;)V
/* .line 116 */
v2 = this.e;
/* monitor-enter v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 117 */
try { // :try_start_1
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 118 */
v0 = this.d;
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 120 */
} // :cond_0
/* monitor-exit v2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 121 */
try { // :try_start_2
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 122 */
return;
/* .line 120 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit v2 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
/* throw v0 */
/* .line 121 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* throw v0 */
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 258 */
final String v0 = "onDismissScreen"; // const-string v0, "onDismissScreen"
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/ads/e;->a(Lcom/google/ads/h;Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
/* .line 267 */
} // :goto_0
return;
/* .line 261 */
} // :cond_0
v0 = this.a;
/* new-instance v1, Lcom/google/ads/e$5; */
/* invoke-direct {v1, p0}, Lcom/google/ads/e$5;-><init>(Lcom/google/ads/e;)V */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
public void c ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 271 */
final String v0 = "onLeaveApplication"; // const-string v0, "onLeaveApplication"
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/ads/e;->a(Lcom/google/ads/h;Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
/* .line 280 */
} // :goto_0
return;
/* .line 274 */
} // :cond_0
v0 = this.a;
/* new-instance v1, Lcom/google/ads/e$6; */
/* invoke-direct {v1, p0}, Lcom/google/ads/e$6;-><init>(Lcom/google/ads/e;)V */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 291 */
v0 = this.a;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
com.google.ads.util.a .a ( v0 );
/* .line 292 */
/* invoke-direct {p0}, Lcom/google/ads/e;->e()Lcom/google/ads/h; */
/* .line 293 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 294 */
(( com.google.ads.h ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->f()V
/* .line 300 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* .line 296 */
} // :cond_0
final String v0 = "There is no ad ready to show."; // const-string v0, "There is no ad ready to show."
com.google.ads.util.b .b ( v0 );
/* .line 297 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void d ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 468 */
v1 = this.c;
/* monitor-enter v1 */
/* .line 469 */
try { // :try_start_0
v0 = this.b;
/* if-eq v0, p1, :cond_1 */
/* .line 470 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 472 */
v0 = this.b;
(( com.google.ads.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->b()V
/* .line 474 */
} // :cond_0
this.b = p1;
/* .line 476 */
} // :cond_1
/* monitor-exit v1 */
/* .line 477 */
return;
/* .line 476 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
