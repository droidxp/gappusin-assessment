public class com.google.ads.AdRequest {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/AdRequest$Gender;, */
	 /* Lcom/google/ads/AdRequest$ErrorCode; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String LOGTAG;
public static final java.lang.String TEST_EMULATOR;
public static final java.lang.String VERSION;
private static final java.text.SimpleDateFormat a;
private static java.lang.reflect.Method b;
private static java.lang.reflect.Method c;
/* # instance fields */
private com.google.ads.AdRequest$Gender d;
private java.util.Date e;
private java.util.Set f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map g;
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
private java.util.Map h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Lcom/google/ads/mediation/NetworkExtras;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.location.Location i;
private Boolean j;
private Boolean k;
private java.util.Set l;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.google.ads.AdRequest ( ) {
/* .locals 6 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 47 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "yyyyMMdd"; // const-string v1, "yyyyMMdd"
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* .line 152 */
/* .line 153 */
/* .line 158 */
try { // :try_start_0
final String v0 = "com.google.analytics.tracking.android.AdMobInfo"; // const-string v0, "com.google.analytics.tracking.android.AdMobInfo"
java.lang.Class .forName ( v0 );
/* .line 159 */
(( java.lang.Class ) v0 ).getMethods ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
/* array-length v2, v1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v2, :cond_3 */
/* aget-object v3, v1, v0 */
/* .line 160 */
(( java.lang.reflect.Method ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
final String v5 = "getInstance"; // const-string v5, "getInstance"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
(( java.lang.reflect.Method ) v3 ).getParameterTypes ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
/* array-length v4, v4 */
/* if-nez v4, :cond_1 */
/* .line 162 */
/* .line 159 */
} // :cond_0
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 163 */
} // :cond_1
(( java.lang.reflect.Method ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
final String v5 = "getJoinIds"; // const-string v5, "getJoinIds"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( java.lang.reflect.Method ) v3 ).getParameterTypes ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
/* array-length v4, v4 */
/* if-nez v4, :cond_0 */
/* .line 165 */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 174 */
/* :catch_0 */
/* move-exception v0 */
/* .line 175 */
final String v0 = "No Google Analytics: Library Not Found."; // const-string v0, "No Google Analytics: Library Not Found."
com.google.ads.util.b .a ( v0 );
/* .line 215 */
} // :cond_2
} // :goto_2
final String v0 = "emulator"; // const-string v0, "emulator"
com.google.ads.util.AdUtil .b ( v0 );
return;
/* .line 169 */
} // :cond_3
try { // :try_start_1
v0 = com.google.ads.AdRequest.b;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.google.ads.AdRequest.c;
/* if-nez v0, :cond_2 */
/* .line 170 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 171 */
int v0 = 0; // const/4 v0, 0x0
/* .line 172 */
final String v0 = "No Google Analytics: Library Incompatible."; // const-string v0, "No Google Analytics: Library Incompatible."
com.google.ads.util.b .e ( v0 );
/* :try_end_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 176 */
/* :catch_1 */
/* move-exception v0 */
/* .line 177 */
final String v0 = "No Google Analytics: Error Loading Library"; // const-string v0, "No Google Analytics: Error Loading Library"
com.google.ads.util.b .a ( v0 );
} // .end method
public com.google.ads.AdRequest ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 37 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 183 */
this.d = v1;
/* .line 186 */
this.e = v1;
/* .line 189 */
this.f = v1;
/* .line 192 */
this.g = v1;
/* .line 195 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.h = v0;
/* .line 199 */
this.i = v1;
/* .line 202 */
/* iput-boolean v2, p0, Lcom/google/ads/AdRequest;->j:Z */
/* .line 205 */
/* iput-boolean v2, p0, Lcom/google/ads/AdRequest;->k:Z */
/* .line 218 */
this.l = v1;
return;
} // .end method
private synchronized com.google.ads.mediation.admob.AdMobAdapterExtras a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 413 */
/* monitor-enter p0 */
try { // :try_start_0
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.AdRequest ) p0 ).getNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdRequest;->getNetworkExtras(Ljava/lang/Class;)Ljava/lang/Object;
/* if-nez v0, :cond_0 */
/* .line 414 */
/* new-instance v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* invoke-direct {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;-><init>()V */
(( com.google.ads.AdRequest ) p0 ).setNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdRequest;->setNetworkExtras(Lcom/google/ads/mediation/NetworkExtras;)Lcom/google/ads/AdRequest;
/* .line 417 */
} // :cond_0
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.AdRequest ) p0 ).getNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdRequest;->getNetworkExtras(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* .line 413 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
/* # virtual methods */
public com.google.ads.AdRequest addExtra ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/Object; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 450 */
/* invoke-direct {p0}, Lcom/google/ads/AdRequest;->a()Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .line 451 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
/* if-nez v1, :cond_0 */
/* .line 452 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).setExtras ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->setExtras(Ljava/util/Map;)Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
/* .line 455 */
} // :cond_0
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
/* .line 456 */
} // .end method
public com.google.ads.AdRequest addKeyword ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "keyword" # Ljava/lang/String; */
/* .prologue */
/* .line 365 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 366 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.f = v0;
/* .line 369 */
} // :cond_0
v0 = this.f;
/* .line 370 */
} // .end method
public com.google.ads.AdRequest addKeywords ( java.util.Set p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 383 */
/* .local p1, "keywords":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 384 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.f = v0;
/* .line 387 */
} // :cond_0
v0 = this.f;
/* .line 388 */
} // .end method
public com.google.ads.AdRequest addMediationExtra ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 522 */
v0 = this.g;
/* if-nez v0, :cond_0 */
/* .line 523 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.g = v0;
/* .line 526 */
} // :cond_0
v0 = this.g;
/* .line 527 */
} // .end method
public com.google.ads.AdRequest addTestDevice ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "testDevice" # Ljava/lang/String; */
/* .prologue */
/* .line 673 */
v0 = this.l;
/* if-nez v0, :cond_0 */
/* .line 674 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.l = v0;
/* .line 677 */
} // :cond_0
v0 = this.l;
/* .line 678 */
} // .end method
public com.google.ads.AdRequest clearBirthday ( ) {
/* .locals 1 */
/* .prologue */
/* .line 307 */
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
/* .line 308 */
} // .end method
public java.util.Date getBirthday ( ) {
/* .locals 1 */
/* .prologue */
/* .line 299 */
v0 = this.e;
} // .end method
public com.google.ads.AdRequest$Gender getGender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 235 */
v0 = this.d;
} // .end method
public java.util.Set getKeywords ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 399 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 400 */
int v0 = 0; // const/4 v0, 0x0
/* .line 403 */
} // :goto_0
} // :cond_0
v0 = this.f;
java.util.Collections .unmodifiableSet ( v0 );
} // .end method
public android.location.Location getLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 547 */
v0 = this.i;
} // .end method
public java.lang.Object getNetworkExtras ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class", */
/* "<TT;>;)TT;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 494 */
/* .local p1, "extrasClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;" */
v0 = this.h;
} // .end method
public Boolean getPlusOneOptOut ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 339 */
/* invoke-direct {p0}, Lcom/google/ads/AdRequest;->a()Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
v0 = (( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getPlusOneOptOut ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getPlusOneOptOut()Z
} // .end method
public java.util.Map getRequestMap ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p1, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 574 */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 577 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 578 */
final String v0 = "kw"; // const-string v0, "kw"
v4 = this.f;
/* .line 582 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 583 */
final String v0 = "cust_gender"; // const-string v0, "cust_gender"
v4 = this.d;
v4 = (( com.google.ads.AdRequest$Gender ) v4 ).ordinal ( ); // invoke-virtual {v4}, Lcom/google/ads/AdRequest$Gender;->ordinal()I
java.lang.Integer .valueOf ( v4 );
/* .line 587 */
} // :cond_1
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 588 */
final String v0 = "cust_age"; // const-string v0, "cust_age"
v4 = com.google.ads.AdRequest.a;
v5 = this.e;
(( java.text.SimpleDateFormat ) v4 ).format ( v5 ); // invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
/* .line 592 */
} // :cond_2
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 593 */
final String v0 = "uule"; // const-string v0, "uule"
v4 = this.i;
com.google.ads.util.AdUtil .a ( v4 );
/* .line 596 */
} // :cond_3
/* iget-boolean v0, p0, Lcom/google/ads/AdRequest;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 597 */
final String v0 = "testing"; // const-string v0, "testing"
java.lang.Integer .valueOf ( v1 );
/* .line 600 */
} // :cond_4
v0 = (( com.google.ads.AdRequest ) p0 ).isTestDevice ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/AdRequest;->isTestDevice(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 601 */
final String v0 = "adtest"; // const-string v0, "adtest"
final String v4 = "on"; // const-string v4, "on"
/* .line 616 */
} // :cond_5
} // :goto_0
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.AdRequest ) p0 ).getNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdRequest;->getNetworkExtras(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .line 618 */
if ( v0 != null) { // if-eqz v0, :cond_b
v4 = (( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getPlusOneOptOut ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getPlusOneOptOut()Z
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 619 */
final String v2 = "pto"; // const-string v2, "pto"
java.lang.Integer .valueOf ( v1 );
/* .line 626 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_6
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = (( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
/* if-lez v1, :cond_6 */
/* .line 629 */
final String v1 = "extras"; // const-string v1, "extras"
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
/* .line 632 */
} // :cond_6
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 633 */
final String v0 = "mediation_extras"; // const-string v0, "mediation_extras"
v1 = this.g;
/* .line 638 */
} // :cond_7
try { // :try_start_0
v0 = com.google.ads.AdRequest.b;
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 639 */
v0 = com.google.ads.AdRequest.b;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 640 */
v1 = com.google.ads.AdRequest.c;
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v1 ).invoke ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 643 */
/* check-cast v0, Ljava/util/Map; */
/* .line 644 */
v1 = if ( v0 != null) { // if-eqz v0, :cond_8
/* if-lez v1, :cond_8 */
/* .line 645 */
final String v1 = "analytics_join_id"; // const-string v1, "analytics_join_id"
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 652 */
} // :cond_8
} // :goto_2
/* .line 603 */
} // :cond_9
/* iget-boolean v0, p0, Lcom/google/ads/AdRequest;->k:Z */
/* if-nez v0, :cond_5 */
/* .line 605 */
v0 = com.google.ads.util.AdUtil .c ( );
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 606 */
final String v0 = "AdRequest.TEST_EMULATOR"; // const-string v0, "AdRequest.TEST_EMULATOR"
/* .line 610 */
} // :goto_3
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "To get test ads on this device, call adRequest.addTestDevice("; // const-string v5, "To get test ads on this device, call adRequest.addTestDevice("
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ");"; // const-string v4, ");"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 612 */
/* iput-boolean v1, p0, Lcom/google/ads/AdRequest;->k:Z */
/* goto/16 :goto_0 */
/* .line 608 */
} // :cond_a
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "\""; // const-string v4, "\""
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.google.ads.util.AdUtil .a ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\""; // const-string v4, "\""
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 621 */
} // :cond_b
final String v4 = "cipa"; // const-string v4, "cipa"
v5 = com.google.ads.af .a ( p1 );
if ( v5 != null) { // if-eqz v5, :cond_c
} // :goto_4
java.lang.Integer .valueOf ( v1 );
/* goto/16 :goto_1 */
} // :cond_c
/* move v1, v2 */
/* .line 648 */
/* :catch_0 */
/* move-exception v0 */
/* .line 649 */
final String v1 = "Internal Analytics Error:"; // const-string v1, "Internal Analytics Error:"
com.google.ads.util.b .c ( v1,v0 );
} // .end method
public Boolean isTestDevice ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 707 */
v1 = this.l;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 708 */
com.google.ads.util.AdUtil .a ( p1 );
/* .line 710 */
/* if-nez v1, :cond_1 */
/* .line 719 */
} // :cond_0
} // :goto_0
/* .line 714 */
} // :cond_1
v1 = v2 = this.l;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 715 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public com.google.ads.AdRequest removeNetworkExtras ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 483 */
/* .local p1, "extrasClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v0 = this.h;
/* .line 484 */
} // .end method
public com.google.ads.AdRequest setBirthday ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "birthday" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 248 */
final String v0 = ""; // const-string v0, ""
/* if-eq p1, v0, :cond_0 */
/* if-nez p1, :cond_1 */
/* .line 249 */
} // :cond_0
this.e = v1;
/* .line 260 */
} // :goto_0
/* .line 252 */
} // :cond_1
try { // :try_start_0
v0 = com.google.ads.AdRequest.a;
(( java.text.SimpleDateFormat ) v0 ).parse ( p1 ); // invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
this.e = v0;
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 253 */
/* :catch_0 */
/* move-exception v0 */
/* .line 254 */
final String v0 = "Birthday format invalid.Expected \'YYYYMMDD\' where \'YYYY\' is a 4 digit year, \'MM\' is a two digit month, and \'DD\' is a two digit day.Birthday value ignored"; // const-string v0, "Birthday format invalid.Expected \'YYYYMMDD\' where \'YYYY\' is a 4 digit year, \'MM\' is a two digit month, and \'DD\' is a two digit day.Birthday value ignored"
com.google.ads.util.b .b ( v0 );
/* .line 256 */
this.e = v1;
} // .end method
public com.google.ads.AdRequest setBirthday ( java.util.Calendar p0 ) {
/* .locals 1 */
/* .param p1, "calendar" # Ljava/util/Calendar; */
/* .prologue */
/* .line 285 */
/* if-nez p1, :cond_0 */
/* .line 286 */
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
/* .line 291 */
} // :goto_0
/* .line 288 */
} // :cond_0
(( java.util.Calendar ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
(( com.google.ads.AdRequest ) p0 ).setBirthday ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdRequest;->setBirthday(Ljava/util/Date;)Lcom/google/ads/AdRequest;
} // .end method
public com.google.ads.AdRequest setBirthday ( java.util.Date p0 ) {
/* .locals 3 */
/* .param p1, "birthday" # Ljava/util/Date; */
/* .prologue */
/* .line 269 */
/* if-nez p1, :cond_0 */
/* .line 270 */
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
/* .line 275 */
} // :goto_0
/* .line 272 */
} // :cond_0
/* new-instance v0, Ljava/util/Date; */
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
this.e = v0;
} // .end method
public com.google.ads.AdRequest setExtras ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 432 */
/* .local p1, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* invoke-direct {p0}, Lcom/google/ads/AdRequest;->a()Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).setExtras ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->setExtras(Ljava/util/Map;)Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
/* .line 433 */
} // .end method
public com.google.ads.AdRequest setGender ( com.google.ads.AdRequest$Gender p0 ) {
/* .locals 0 */
/* .param p1, "gender" # Lcom/google/ads/AdRequest$Gender; */
/* .prologue */
/* .line 226 */
this.d = p1;
/* .line 227 */
} // .end method
public com.google.ads.AdRequest setKeywords ( java.util.Set p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 351 */
/* .local p1, "keywords":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
this.f = p1;
/* .line 352 */
} // .end method
public com.google.ads.AdRequest setLocation ( android.location.Location p0 ) {
/* .locals 0 */
/* .param p1, "location" # Landroid/location/Location; */
/* .prologue */
/* .line 538 */
this.i = p1;
/* .line 539 */
} // .end method
public com.google.ads.AdRequest setMediationExtras ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 507 */
/* .local p1, "mediationExtras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
this.g = p1;
/* .line 508 */
} // .end method
public com.google.ads.AdRequest setNetworkExtras ( com.google.ads.mediation.NetworkExtras p0 ) {
/* .locals 2 */
/* .param p1, "extras" # Lcom/google/ads/mediation/NetworkExtras; */
/* .prologue */
/* .line 470 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 471 */
v0 = this.h;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 473 */
} // :cond_0
} // .end method
public com.google.ads.AdRequest setPlusOneOptOut ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "plusOneOptOut" # Z */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 325 */
/* invoke-direct {p0}, Lcom/google/ads/AdRequest;->a()Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).setPlusOneOptOut ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->setPlusOneOptOut(Z)Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
/* .line 326 */
} // .end method
public com.google.ads.AdRequest setTestDevices ( java.util.Set p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lcom/google/ads/AdRequest;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 691 */
/* .local p1, "testDevices":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
this.l = p1;
/* .line 692 */
} // .end method
public com.google.ads.AdRequest setTesting ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "testing" # Z */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 562 */
/* iput-boolean p1, p0, Lcom/google/ads/AdRequest;->j:Z */
/* .line 563 */
} // .end method
