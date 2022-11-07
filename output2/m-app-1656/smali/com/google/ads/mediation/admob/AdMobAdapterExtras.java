public class com.google.ads.mediation.admob.AdMobAdapterExtras implements com.google.ads.mediation.NetworkExtras {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean a;
	 private Boolean b;
	 private java.util.Map c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.mediation.admob.AdMobAdapterExtras ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 19 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 39 */
/* iput-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->a:Z */
/* .line 62 */
/* iput-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->b:Z */
/* .line 20 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) p0 ).clearExtras ( ); // invoke-virtual {p0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->clearExtras()Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
/* .line 21 */
return;
} // .end method
public com.google.ads.mediation.admob.AdMobAdapterExtras ( ) {
/* .locals 2 */
/* .param p1, "original" # Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .prologue */
/* .line 29 */
/* invoke-direct {p0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;-><init>()V */
/* .line 31 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 32 */
	 /* iget-boolean v0, p1, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->a:Z */
	 /* iput-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->a:Z */
	 /* .line 33 */
	 /* iget-boolean v0, p1, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->b:Z */
	 /* iput-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->b:Z */
	 /* .line 34 */
	 v0 = this.c;
	 v1 = this.c;
	 /* .line 36 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public com.google.ads.mediation.admob.AdMobAdapterExtras addExtra ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 134 */
v0 = this.c;
/* .line 135 */
} // .end method
public com.google.ads.mediation.admob.AdMobAdapterExtras clearExtras ( ) {
/* .locals 1 */
/* .prologue */
/* .line 121 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 122 */
} // .end method
public java.util.Map getExtras ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 97 */
v0 = this.c;
} // .end method
public Boolean getPlusOneOptOut ( ) {
/* .locals 1 */
/* .prologue */
/* .line 58 */
/* iget-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->a:Z */
} // .end method
public Boolean getUseExactAdSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
/* iget-boolean v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->b:Z */
} // .end method
public com.google.ads.mediation.admob.AdMobAdapterExtras setExtras ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterExtras;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 108 */
/* .local p1, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* if-nez p1, :cond_0 */
/* .line 109 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Argument \'extras\' may not be null"; // const-string v1, "Argument \'extras\' may not be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 111 */
} // :cond_0
this.c = p1;
/* .line 112 */
} // .end method
public com.google.ads.mediation.admob.AdMobAdapterExtras setPlusOneOptOut ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "plusOneOptOut" # Z */
/* .prologue */
/* .line 49 */
/* iput-boolean p1, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->a:Z */
/* .line 50 */
} // .end method
public com.google.ads.mediation.admob.AdMobAdapterExtras setUseExactAdSize ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "useExactAdSize" # Z */
/* .prologue */
/* .line 75 */
/* iput-boolean p1, p0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->b:Z */
/* .line 76 */
} // .end method
