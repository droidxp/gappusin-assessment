public class com.google.ads.mediation.customevent.CustomEventAdapter implements com.google.ads.mediation.MediationBannerAdapter implements com.google.ads.mediation.MediationInterstitialAdapter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;, */
	 /* Lcom/google/ads/mediation/customevent/CustomEventAdapter$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lcom/google/ads/mediation/MediationBannerAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/EmptyNetworkExtras;", */
/* "Lcom/google/ads/mediation/customevent/CustomEventServerParameters;", */
/* ">;", */
/* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/EmptyNetworkExtras;", */
/* "Lcom/google/ads/mediation/customevent/CustomEventServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.String a;
private com.google.ads.mediation.customevent.CustomEventAdapter$a b;
private com.google.ads.mediation.customevent.CustomEventInterstitial c;
/* # direct methods */
public com.google.ads.mediation.customevent.CustomEventAdapter ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 34 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 41 */
this.b = v0;
/* .line 151 */
this.c = v0;
/* .line 153 */
return;
} // .end method
private java.lang.Object a ( java.lang.String p0, java.lang.Class p1, java.lang.String p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class", */
/* "<TT;>;", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 278 */
try { // :try_start_0
com.google.ads.g .a ( p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_4 */
/* .line 296 */
} // :goto_0
/* .line 279 */
/* :catch_0 */
/* move-exception v0 */
/* .line 280 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Make sure you created a visible class named: "; // const-string v2, "Make sure you created a visible class named: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "."; // const-string v2, "."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 296 */
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 282 */
/* :catch_1 */
/* move-exception v0 */
/* .line 283 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Make sure your custom event implements the "; // const-string v2, "Make sure your custom event implements the "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " interface."; // const-string v2, " interface."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 285 */
/* :catch_2 */
/* move-exception v0 */
/* .line 286 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Make sure the default constructor for class "; // const-string v2, "Make sure the default constructor for class "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " is visible."; // const-string v2, " is visible."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 288 */
/* :catch_3 */
/* move-exception v0 */
/* .line 289 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Make sure the name "; // const-string v2, "Make sure the name "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " does not denote an abstract class or an interface."; // const-string v2, " does not denote an abstract class or an interface."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 292 */
/* :catch_4 */
/* move-exception v0 */
/* .line 293 */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
} // .end method
static java.lang.String a ( com.google.ads.mediation.customevent.CustomEventAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 34 */
v0 = this.a;
} // .end method
private void a ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 269 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Error during processing of custom event with label: \'"; // const-string v1, "Error during processing of custom event with label: \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'.Skipping custom event."; // const-string v1, "\'.Skipping custom event."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 271 */
com.google.ads.util.b .b ( v0,p2 );
/* .line 272 */
return;
} // .end method
/* # virtual methods */
public void destroy ( ) {
/* .locals 0 */
/* .prologue */
/* .line 265 */
return;
} // .end method
public java.lang.Class getAdditionalParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/EmptyNetworkExtras;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 254 */
/* const-class v0, Lcom/google/ads/mediation/EmptyNetworkExtras; */
} // .end method
public android.view.View getBannerView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 145 */
v0 = this.b;
com.google.ads.util.a .b ( v0 );
/* .line 146 */
v0 = this.b;
(( com.google.ads.mediation.customevent.CustomEventAdapter$a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a()Landroid/view/View;
} // .end method
public java.lang.Class getServerParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/customevent/CustomEventServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 259 */
/* const-class v0, Lcom/google/ads/mediation/customevent/CustomEventServerParameters; */
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.NetworkExtras p5 ) { //bridge//synthethic
/* .locals 7 */
/* .param p1, "x0" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "x1" # Landroid/app/Activity; */
/* .param p3, "x2" # Lcom/google/ads/mediation/MediationServerParameters; */
/* .param p4, "x3" # Lcom/google/ads/AdSize; */
/* .param p5, "x4" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "x5" # Lcom/google/ads/mediation/NetworkExtras; */
/* .prologue */
/* .line 34 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters; */
/* move-object v6, p6 */
/* check-cast v6, Lcom/google/ads/mediation/EmptyNetworkExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/EmptyNetworkExtras;)V */
return;
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.customevent.CustomEventServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.EmptyNetworkExtras p5 ) {
/* .locals 7 */
/* .param p1, "mediationListener" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/customevent/CustomEventServerParameters; */
/* .param p4, "adSize" # Lcom/google/ads/AdSize; */
/* .param p5, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "mediationExtras" # Lcom/google/ads/mediation/EmptyNetworkExtras; */
/* .prologue */
/* .line 110 */
v0 = this.a;
com.google.ads.util.a .a ( v0 );
/* .line 111 */
v0 = this.label;
this.a = v0;
/* .line 112 */
v0 = this.className;
/* .line 113 */
v4 = this.parameter;
/* .line 116 */
/* const-class v1, Lcom/google/ads/mediation/customevent/CustomEventBanner; */
v2 = this.a;
/* invoke-direct {p0, v0, v1, v2}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object; */
/* check-cast v0, Lcom/google/ads/mediation/customevent/CustomEventBanner; */
/* .line 118 */
/* if-nez v0, :cond_0 */
/* .line 119 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
/* .line 141 */
} // :goto_0
return;
/* .line 123 */
} // :cond_0
v1 = this.b;
com.google.ads.util.a .a ( v1 );
/* .line 124 */
/* new-instance v1, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a; */
/* invoke-direct {v1, p0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;-><init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/MediationBannerListener;)V */
this.b = v1;
/* .line 127 */
try { // :try_start_0
v1 = this.b;
v3 = this.a;
/* move-object v2, p2 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* invoke-interface/range {v0 ..v6}, Lcom/google/ads/mediation/customevent/CustomEventBanner;->requestBannerAd(Lcom/google/ads/mediation/customevent/CustomEventBannerListener;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 134 */
/* :catch_0 */
/* move-exception v0 */
/* .line 138 */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 139 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.NetworkExtras p4 ) { //bridge//synthethic
/* .locals 6 */
/* .param p1, "x0" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "x1" # Landroid/app/Activity; */
/* .param p3, "x2" # Lcom/google/ads/mediation/MediationServerParameters; */
/* .param p4, "x3" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "x4" # Lcom/google/ads/mediation/NetworkExtras; */
/* .prologue */
/* .line 34 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters; */
/* move-object v5, p5 */
/* check-cast v5, Lcom/google/ads/mediation/EmptyNetworkExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/EmptyNetworkExtras;)V */
return;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.customevent.CustomEventServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.EmptyNetworkExtras p4 ) {
/* .locals 6 */
/* .param p1, "mediationListener" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/customevent/CustomEventServerParameters; */
/* .param p4, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "mediationExtras" # Lcom/google/ads/mediation/EmptyNetworkExtras; */
/* .prologue */
/* .line 224 */
v0 = this.a;
com.google.ads.util.a .a ( v0 );
/* .line 225 */
v0 = this.label;
this.a = v0;
/* .line 226 */
v0 = this.className;
/* .line 227 */
v4 = this.parameter;
/* .line 230 */
/* const-class v1, Lcom/google/ads/mediation/customevent/CustomEventInterstitial; */
v2 = this.a;
/* invoke-direct {p0, v0, v1, v2}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object; */
/* check-cast v0, Lcom/google/ads/mediation/customevent/CustomEventInterstitial; */
this.c = v0;
/* .line 232 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 233 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
/* .line 249 */
} // :goto_0
return;
/* .line 238 */
} // :cond_0
try { // :try_start_0
v0 = this.c;
/* new-instance v1, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b; */
/* invoke-direct {v1, p0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;-><init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/MediationInterstitialListener;)V */
v3 = this.a;
/* move-object v2, p2 */
/* move-object v5, p4 */
/* invoke-interface/range {v0 ..v5}, Lcom/google/ads/mediation/customevent/CustomEventInterstitial;->requestInterstitialAd(Lcom/google/ads/mediation/customevent/CustomEventInterstitialListener;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/google/ads/mediation/MediationAdRequest;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 244 */
/* :catch_0 */
/* move-exception v0 */
/* .line 246 */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 247 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
} // .end method
public void showInterstitial ( ) {
/* .locals 3 */
/* .prologue */
/* .line 207 */
v0 = this.c;
com.google.ads.util.a .b ( v0 );
/* .line 209 */
try { // :try_start_0
v0 = this.c;
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 216 */
} // :goto_0
return;
/* .line 210 */
/* :catch_0 */
/* move-exception v0 */
/* .line 214 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Exception when showing custom event labeled \'"; // const-string v2, "Exception when showing custom event labeled \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\'."; // const-string v2, "\'."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v1,v0 );
} // .end method
