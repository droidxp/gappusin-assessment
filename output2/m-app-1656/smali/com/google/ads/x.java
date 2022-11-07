public class com.google.ads.x implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private com.google.ads.AdActivity$StaticMethodWrapper a;
	 /* # direct methods */
	 public com.google.ads.x ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 /* new-instance v0, Lcom/google/ads/AdActivity$StaticMethodWrapper; */
		 /* invoke-direct {v0}, Lcom/google/ads/AdActivity$StaticMethodWrapper;-><init>()V */
		 /* invoke-direct {p0, v0}, Lcom/google/ads/x;-><init>(Lcom/google/ads/AdActivity$StaticMethodWrapper;)V */
		 /* .line 25 */
		 return;
	 } // .end method
	 public com.google.ads.x ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 31 */
		 this.a = p1;
		 /* .line 32 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/internal/d;", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Landroid/webkit/WebView;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 48 */
	 final String v0 = "a"; // const-string v0, "a"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 49 */
	 /* if-nez v0, :cond_0 */
	 /* .line 50 */
	 final String v0 = "Could not get the action parameter for open GMSG."; // const-string v0, "Could not get the action parameter for open GMSG."
	 com.google.ads.util.b .a ( v0 );
	 /* .line 67 */
} // :goto_0
return;
/* .line 55 */
} // :cond_0
final String v1 = "webapp"; // const-string v1, "webapp"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 57 */
v0 = this.a;
/* new-instance v1, Lcom/google/ads/internal/e; */
final String v2 = "webapp"; // const-string v2, "webapp"
/* invoke-direct {v1, v2, p2}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
(( com.google.ads.AdActivity$StaticMethodWrapper ) v0 ).launchAdActivity ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/google/ads/AdActivity$StaticMethodWrapper;->launchAdActivity(Lcom/google/ads/internal/d;Lcom/google/ads/internal/e;)V
/* .line 59 */
} // :cond_1
final String v1 = "expand"; // const-string v1, "expand"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 60 */
v0 = this.a;
/* new-instance v1, Lcom/google/ads/internal/e; */
final String v2 = "expand"; // const-string v2, "expand"
/* invoke-direct {v1, v2, p2}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
(( com.google.ads.AdActivity$StaticMethodWrapper ) v0 ).launchAdActivity ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/google/ads/AdActivity$StaticMethodWrapper;->launchAdActivity(Lcom/google/ads/internal/d;Lcom/google/ads/internal/e;)V
/* .line 64 */
} // :cond_2
v0 = this.a;
/* new-instance v1, Lcom/google/ads/internal/e; */
final String v2 = "intent"; // const-string v2, "intent"
/* invoke-direct {v1, v2, p2}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
(( com.google.ads.AdActivity$StaticMethodWrapper ) v0 ).launchAdActivity ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/google/ads/AdActivity$StaticMethodWrapper;->launchAdActivity(Lcom/google/ads/internal/d;Lcom/google/ads/internal/e;)V
} // .end method
